package runnable_task;

import java.util.stream.IntStream;

//IntStream===>range()====>filter()====>forEach()
public class EvenPrinterTask implements Runnable {

	//state:
	private int start;
	private int end;
	
	public EvenPrinterTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		System.out.println("constructor invoked"+Thread.currentThread().getName());//main thread cause construtor to call
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"Started");//which thread get staeted
		try {
			System.out.println("Print the Even");
			IntStream.range(start,end)//IntStream:int starts ----->end-1
			.filter(p-> p%2 == 0)
			.forEach(p->System.out.println(Thread.currentThread().getName()+"Printed Even no : "+p));
		}
		catch(Exception e)
		{
			System.out.println(Thread.currentThread().getName()+"got exc"+e);
		}
	
	
	
		System.out.println(Thread.currentThread().getName()+"Over");//which thread get staeted
	}
	
	
	
	
}

////Standard template
//public class EvenPrinterTask implements Runnable {
//
//	@Override
//	public void run()
//	{
//		System.out.println(Thread.currentThread().getName()+"Started");//which thread get staeted
//		try {
//			
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println(Thread.currentThread().getName()+"got exc"+e);
//		}
//	
//	
//	
//		System.out.println(Thread.currentThread().getName()+"Over");//which thread get staeted
//	}
//	
//	
//	
//	
//}

