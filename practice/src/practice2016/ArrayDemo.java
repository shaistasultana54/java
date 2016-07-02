package practice2016;

public class ArrayDemo {

	public static void main(String[] args) {
		double[] numbers= new double[10];
		double sum=0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		for (int i=1;i<10;i++)
		{
			numbers[i]=input.nextDouble();
			sum += sum+numbers[i];
			System.out.println(sum);
		}
		// TODO Auto-generated method stub

	}

}
