package event.handling.spring;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("this is the msg"+ this.message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
