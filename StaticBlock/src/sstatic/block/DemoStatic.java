package sstatic.block;

public class DemoStatic {
	public static int x;
	public int y;
	
	public DemoStatic(){
		System.out.println("this is my constructor");
	}
	
	static{
		x=10;
		//y=10; this gives an error as only static members can b accessed by this block
		
		System.out.println("Hii this is static block");
	}
	
	{
		System.out.println("Hii i m empty block");
	}
	
	public static void main(String[] args){
		DemoStatic dmObj = new DemoStatic();
	}
}
