package com.wj.wjtest;

/**
 *  线程同步 生产者消费者
 * @author jian.k.wang
 *
 */
public class SyncTest {
	
	public static void main(String[] args) {
		SyncKFC syncKFC = new SyncKFC();
		
		
		MakeRunnable makeRunnable = new MakeRunnable(syncKFC);
		EatRunnable eatRunnable = new EatRunnable(syncKFC);
		
		Thread makeHamburgerThread = new Thread(makeRunnable);
		Thread eatHamburgerThread = new Thread(eatRunnable);
		
		makeHamburgerThread.start();
		eatHamburgerThread.start();

	}

}
