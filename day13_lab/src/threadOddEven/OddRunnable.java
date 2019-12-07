package threadOddEven;

public class OddRunnable implements Runnable {
	private int start, end;
	
	public OddRunnable(int start, int end)
	{
		this.start=start;
		this.end=end;
	}

	@Override
	public void run() {
		for(int i=start;i<=end;i++)
		{
			if(i%2 != 0)
				{
				 System.out.println(i+" is Odd says Thread "+Thread.currentThread().getName());
				}
		}
	}
	
}
