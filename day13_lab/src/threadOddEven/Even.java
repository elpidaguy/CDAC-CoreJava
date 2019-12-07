package threadOddEven;

public class Even extends Thread {
	
	private int start, end;
	private String name;
	
	public Even(int start, int end, String name)
	{
		super(name);
		this.start=start;
		this.end=end;
		this.name=name;
		start();
	}

	@Override
	public void run() {
		super.run();
		
		for(int i=start;i<=end;i++)
		{
			if(i%2 == 0)
				{
				 System.out.println(i+" is "+getName());
				}
		}
	}
}
