package runnable_tester;

import java.util.Scanner;

import runnable_task.*;

public class Tester_Concurrency {

	public static void main(String[] args)throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter the range: begin n end");
			int start=sc.nextInt();
			int end=sc.nextInt();
			//create the task,attach thread to task,start the thread
			//implements runnable:Thread(Runnable task,String nm)
			Thread t1=new Thread(new EvenPrinterTask(start,end),"even");
			Thread t2=new Thread(new OddPrinterTask(start,end),"Odd");
			Thread t3=new Thread(new AveragePrinterTask(start,end),"AveragePrinterTask");
			//starting the thread
			t1.start();//if we  give same thread again tomcall get IllegalState Exception
			t2.start();
			//t2.start();//java.lang.IllegalThreadStateException due to double calling of same thread
			t3.start();
			System.out.println("main waiting for child to complete Excution");
			t1.join();
			t2.join();
			t3.join();
			System.out.println("main over");
			
		}
	}

}
