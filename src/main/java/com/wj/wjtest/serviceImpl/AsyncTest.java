package com.wj.wjtest.serviceImpl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTest {
	
	/**
	 * 1.在@SpringBootApplication启动类 添加注解@EnableAsync
		2.异步方法使用注解@Async ,返回值为void或者Future
		3.切记一点 ,异步方法和调用方法一定要**** 写在不同的类中 ****,如果写在一个类中, 是没有效果的
		4.不能是static
		5.在@Async注解的方法上再使用@Transaction注解是无效的，在@Async注解的方法中调用Service层的事务方法是有效的
	 */
	@Async
	public void holdon() {
		try {
			Thread.sleep(10000);
			System.out.println("Async执行完了！！！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
