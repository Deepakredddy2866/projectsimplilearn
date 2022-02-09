package com.simplilearn.withandwithoutsync;

public class user extends Thread{

		String name;
		String msg;
		Sender sender;

		public user(String name,String msg,Sender sender)
		{
			this.name=name;
			this.msg=msg;
			this.sender=sender;
		}

		public void run()
		{
			System.out.println(name +" wants to send a message "+msg);

			synchronized(sender)
			{
				sender.send(msg);
			}
}
