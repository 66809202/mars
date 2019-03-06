package com.wj.wjtest;

/**
 * 肯德基 做汉堡 吃汉堡
 * @author jian.k.wang
 *
 */
public class SyncKFC {
	// ，汉堡包
	int hamburger = 0;

	// ，做汉堡包
	public synchronized void makeHamburger() throws InterruptedException {
		if (hamburger == 5) {
			// ，汉堡太多了，等会在做
			wait();
			
		} else {
			hamburger++;
			System.out.println("做了一个汉堡包，现在有" + hamburger + "个汉堡包");
			// ，有汉堡了，可以吃了
			notifyAll();
		}

	}

	public synchronized void eatHamburger() throws InterruptedException {
		
		if (hamburger > 0) {
			
			hamburger--;
			System.out.println("吃了一个汉堡包，现在有" + hamburger + "个汉堡包");
			// ，汉堡被吃了，可以做了
			notifyAll();
		} else {
			// ，没有汉堡了，等着做
			wait();
			
		}
	}
}
