package tester;

import fruits.*;

public class TestFruits1 {

	public static void main(String[] args) {
		Fruit f = new Fruit();// direct ref -- type of the ref & type of obj is same
		f.taste();//javac resolves it by type of ref
		f=new Apple();//indirect ref --- super cls ref  ---> sub class instance
		f.taste();//run time polymorphism -- dynamic method dispatch
	    f=new Cherry();
	    f.taste();
	}

}
