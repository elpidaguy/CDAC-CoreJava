package threadOddEven;

public class EvenRunnable implements Runnable {
	
	private int start, end;
	
	public EvenRunnable(int start, int end)
	{
		this.start=start;
		this.end=end;
	}

	@Override
	public void run() {
		
		for(int i=start;i<=end;i++)
		{
			if(i%2 == 0)
				{
				 System.out.println(i+" is Even says Thread "+Thread.currentThread().getName());
				}
		}
	}
}
