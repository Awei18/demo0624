/*
package com.example.demo.rabbit;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

*/
/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/11/21 16:44
 *//*

@Component
public class Consumer {

    @RabbitListener(queuesToDeclare = @Queue(name = "workQ"))
    public void handler1(String message){
        System.out.println("worker1------------------------->" + message);
    }

    @RabbitListener(queuesToDeclare = @Queue("workQ"))
    public void handler2(String message){
        System.out.println("worker_2------------------------->" + message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(name = "ex02", type = "direct"),
                    key = "zhw.zaq.q"
            )
    })
    public void handler3(String message){
        System.out.println("direct_1------------------------->" + message);
    }

    @RabbitListener(bindings = {
            @QueueBinding(
                    value = @Queue,
                    exchange = @Exchange(name = "ex02", type = "direct"),
                    key = "zhw.zaq.w"
            )
    })
    public void handler4(String message){
        System.out.println("direct_02------------------------->" + message);
    }

}
*/
