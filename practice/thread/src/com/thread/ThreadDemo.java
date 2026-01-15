package com.thread;

public class ThreadDemo extends Thread {
	static final Object lock=new Object();
  public void run() {
synchronized (lock) {
	flow();
}
	
}
   public void flow() {
	for(int i=1;i<=10;i++) {
		String thread1=Thread.currentThread().getName();
		System.out.println(i+": "+thread1);
	}
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ThreadDemo threadDemo=new ThreadDemo();
ThreadDemo threadDemo1=new ThreadDemo();
//threadDemo.run();
threadDemo.setName("1st thread");

threadDemo1.setName("2nd thread");
threadDemo.start();



//threadDemo1.run();
threadDemo1.start();

	}

}
