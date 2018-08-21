package cn.xlbweb.cms.mq;

import cn.xlbweb.cms.CmsOrderApplicationTest;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: bobi
 * @date: 2018/8/20 23:55
 * @description:
 */
@Component
public class MqSenderTest extends CmsOrderApplicationTest {

    @Autowired
    private AmqpTemplate amqpTemplate;

//    @Test
//    public void send1() {
//        amqpTemplate.convertAndSend("myQueue1", "当前时间:" + new Date());
//    }
//
//    @Test
//    public void send2() {
//        amqpTemplate.convertAndSend("myQueue2", "当前时间:" + new Date());
//    }
//
//    @Test
//    public void send3() {
//        amqpTemplate.convertAndSend("myQueue3", "当前时间:" + new Date());
//    }

    @Test
    public void sendOrder1() {
        amqpTemplate.convertAndSend("myOrder", "computer", "当前时间:" + new Date());
    }

    @Test
    public void sendOrder2() {
        amqpTemplate.convertAndSend("myOrder", "fruit", "当前时间:" + new Date());
    }
}
