package com.wj.wjtest.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  队列消息发送
 */
@RestController
public class MQSendController {
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
 
	@Autowired
	private Queue queue;
	
	/*
	 * 发送队列消息
	 */
	@RequestMapping("/sendmsg")
	public void sendmsg(String msg) {

		// 指定消息发送的目的地及内容
		this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}

}
