package com.wj.wjtest;

/**
 *  做汉堡线程
 * @author jian.k.wang
 *
 */
public class MakeRunnable implements Runnable {

	SyncKFC syncKFC;
	
	MakeRunnable(SyncKFC syncKFC) {
		this.syncKFC = syncKFC;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(100);
				syncKFC.makeHamburger();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
