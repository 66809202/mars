package com.wj.wjtest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		// 无返回值
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("线程池1");
			}
			
		});
		
		// 有返回值
		Future<String> future = executorService.submit(new Callable<String>() {
			
			@Override
			public String call() throws Exception {
				return "线程池2";
			}
			
		});
		System.out.println(future.get());
		
	}
	
	
	
	
	
	
	
	
	
	
}
