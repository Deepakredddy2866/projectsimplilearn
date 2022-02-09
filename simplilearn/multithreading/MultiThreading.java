package com.simplilearn.multithreading;

public class MultiThreading extends Thread{

		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+ " "+Thread.currentThread().getName());

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		public static void main(String[] args) {
			MultiThreading t1=new MultiThreading();
			MultiThreading t2=new MultiThreading();

			t1.setName("first");
			t2.setName("Second");
			t1.start();
			t2.start();
		}

}
