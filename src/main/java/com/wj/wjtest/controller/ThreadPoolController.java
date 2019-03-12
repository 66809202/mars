package com.wj.wjtest.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wj.wjtest.serviceImpl.UserService;
/**
 * @RestController 比 @Controller 多了个 @ResponseBody
 * 
 * @ResponseBody是作用在方法上的，@ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，
 * 一般在异步获取数据时使用【也就是AJAX】，在使用 @RequestMapping后，返回值通常解析为跳转路径，但是加上
 *  @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入 HTTP response body 中。 
 *  比如异步获取 json 数据，加上 @ResponseBody 后，会直接返回 json 数据。@RequestBody 将 HTTP 请求正文插入方法中，
 *  使用适合的 HttpMessageConverter 将请求体写入某个对象。
 *  
 * @author jian.k.wang
 */
@RestController
public class ThreadPoolController {
	@Autowired
	UserService userService;

	@RequestMapping("/poolTest")
	public void testThreadPool() {
		ThreadPoolExecutor pool = (ThreadPoolExecutor)Executors.newFixedThreadPool(10);
		for (int i = 0; i < 20; i++) {
			
			pool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("起了一个线程" + System.currentTimeMillis());
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			});
			System.out.println("正在活跃的线程有 " + pool.getActiveCount() + " 个");
		}
	}
	
	@RequestMapping("/springPool")
	public List<Map<String, Object>> springThreadPoolTest() {
		return userService.springPoolTest();
	}
}
