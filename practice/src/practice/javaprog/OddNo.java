package practice.javaprog;

public class OddNo implements Runnable{
	public void run(){
		for(int i=1; i<=20; i++){
				if (i%2!=0){
					System.out.print(i+" ");
				}
						
		}

	}



}
