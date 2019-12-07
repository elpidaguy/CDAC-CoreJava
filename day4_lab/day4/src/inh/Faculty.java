package inh;
public class Faculty extends Person
{
	//firstName,lastName,yrs of experience , sme
	private int expInYrs;
	private String sme;
	public Faculty(String fn,String ln,int yrs,String sme)
	{
		super(fn,ln);
		System.out.println("3");
		expInYrs=yrs;
		this.sme=sme;
	}
}
