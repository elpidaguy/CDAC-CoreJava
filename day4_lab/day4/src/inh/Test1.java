package inh;
class Test1 
{
	public static void main(String[] args) 
	{
		C c1=new C();
	}
}
class A
{
	 A()
	{
	//	 super();
		  System.out.println("in A");
	}
}
class B extends A
{
	 B()
	{
		 //super();
		  System.out.println("in B");
	}
}

class C extends B
{
	 C()
	{  
	//	 super();added implicitely by javac
		  System.out.println("in C");
	}
}
