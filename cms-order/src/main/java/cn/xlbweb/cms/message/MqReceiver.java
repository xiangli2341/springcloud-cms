package cn.xlbweb.cms.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: bobi
 * @date: 2018/8/20 23:50
 * @description:
 */
@Component
@Slf4j
public class MqReceiver {


    /**
     * 需要自己去mq管理界面手动创建
     *
     * @param message
     */
//    @RabbitListener(queues = "myQueue1")
//    public void mqReceive1(String message) {
//        log.info("RabbitMQ接收到消息:{}", message);
//    }

    /**
     * 自动创建队列
     *
     * @param message
     */
//    @RabbitListener(queuesToDeclare = @Queue("myQueue2"))
//    public void mqReceive2(String message) {
//        log.info("RabbitMQ接收到消息:{}", message);
//    }

    /**
     * 自动创建队列并绑定到myExchange
     *
     * @param message
     */
//    @RabbitListener(bindings = @QueueBinding(value = @Queue("myQueue3"), exchange = @Exchange("myExchange")))
//    public void mqReceive3(String message) {
//        log.info("RabbitMQ接收到消息:{}", message);
//    }

    /**
     * 数码供应商 接收消息
     *
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(key = "computer", value = @Queue("computerOrder"), exchange = @Exchange("myOrder")))
    public void mqReceiveComputer(String message) {
        log.info("数码供应商接收到消息:{}", message);
    }

    /**
     * 水果供应商 接收消息
     *
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(key = "fruit", value = @Queue("fruitOrder"), exchange = @Exchange("myOrder")))
    public void mqReceiveFruit(String message) {
        log.info("水果供应商接收到消息:{}", message);
    }
}
