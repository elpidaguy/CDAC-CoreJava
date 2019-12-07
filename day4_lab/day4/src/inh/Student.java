package inh;
public class Student extends Person 
{
	 //additional state
	private int gradYear;
		private String course;
		private double fees;
		private int marks;
		//constr
		public Student(String fn,String ln,int yr,String course,double fees,int marks)
	{
			//to invoke immediate super cls's MATCHING constr
		
			 super(fn,ln);
			 System.out.println("2");
			 gradYear=yr;
			 this.course=course;
			 this.fees=fees;
			 this.marks=marks;
	}
}
