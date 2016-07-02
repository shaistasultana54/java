package shaista.develop.demo;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Hello " + this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("Initialization is done.");
	}
	
	public void destroy(){
		System.out.println("Destruction complete.");
	}
	
}
