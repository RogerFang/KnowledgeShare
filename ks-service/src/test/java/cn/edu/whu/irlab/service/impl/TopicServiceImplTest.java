package cn.edu.whu.irlab.service.impl;

import cn.edu.whu.irlab.service.TopicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Roger on 2016/7/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TopicServiceImplTest {

    @Autowired
    private TopicService topicService;

    @Test
    public void selectByPrimaryKey() throws Exception {
        System.out.println(topicService.selectByPrimaryKey(1).getName());
    }

}