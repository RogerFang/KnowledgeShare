package cn.edu.whu.irlab.web;

import cn.edu.whu.irlab.model.Topic;
import cn.edu.whu.irlab.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Roger on 2016/7/29.
 */
@Controller
@RequestMapping("/topic")
public class TopicManageController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET)
    public String topic(Model model){
        List<Topic> topics = topicService.selectRootTopic();
        model.addAttribute("topics", topics);
        return "topic/topic";
    }

    @RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getTopicTree(@PathVariable Integer topicId){
        long start = System.nanoTime();
        Map<String, Object> map = new HashMap<>();
        Topic topic = topicService.selectByPrimaryKey(topicId);
        List<Topic> parentTopics = recursiveParentTopic(topic);
        map.put("parentTopics", parentTopics);

        List<Topic> childTopics = topicService.selectChildTopic(topicId);
        map.put("childTopics", childTopics);
        long end = System.nanoTime();
        System.out.println(end - start);
        return map;
    }

    private List<Topic> recursiveParentTopic(Topic topic){
        List<Topic> list = new ArrayList<>();
        Integer parent = topic.getParentId();
        while (parent != 0){
            Topic parentTopic = topicService.selectByPrimaryKey(parent);
            list.add(parentTopic);
            parent = parentTopic.getParentId();
        }
        return list;
    }
}
