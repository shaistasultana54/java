package tester.function;
import practice.javaprog.*;

public class MyTester {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
EvenNo even=new EvenNo();
OddNo odd= new OddNo();
Thread x=new Thread(even,"t1");// t1 is the name of the thread, x is the object, even is being passed so that into x to make x behave like an even no. thread
Thread y=new Thread(odd,"t2");
x.setPriority(6);
y.setPriority(7);

x.start();
x.join();// setpriority is being superceded by x.join. x will execute and then y.join

y.start();


	}

}
