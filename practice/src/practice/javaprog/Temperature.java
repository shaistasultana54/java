package practice.javaprog;

public class Temperature {
	private float value;
	private char scale;

	public Temperature() {
		this.value = 0;
		this.scale = 'C';

	}

	public Temperature(float v) {
		this.value = v;
	}

	public Temperature(char s) {
		this.scale = s;

	}

	public Temperature(float v, char s) {
		value=v;
		scale=s;

	}
	public void setValue(float v){
		this.value=v;
	}
	public float getValue(){
		return this.value;
	}
	public void setValue(char s){
		this.scale=s;
		
	}
	public char getScale() {
		return this.scale;
		
	}
}
