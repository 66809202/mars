package com.wj.wjtest.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
 *  消息接收
 */
@RestController
public class MQReceiveController {

	/*
	 * 监听和读取消息
	 */
	@JmsListener(destination="active.queue")
	public void readActiveQueue(String message) {
		
		System.out.println("接受到：" + message);
	}

}
