package com.wj.wjtest;

/**
 *   吃汉堡线程
 * @author jian.k.wang
 *
 */
public class EatRunnable implements Runnable {

	SyncKFC syncKFC;
	
	EatRunnable(SyncKFC syncKFC) {
		this.syncKFC = syncKFC;
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				Thread.sleep(100);
				syncKFC.eatHamburger();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
