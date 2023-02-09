
public class Calculator {

	private float num1;
	private float num2;
	
	
	public float add(float num1 , float num2){

		return num1 + num2;
	}
	
	public float substract(float num1, float num2){

		return num1 - num2 ;
	}
	
	public float divide(float num1, float num2){

		return num1 / num2 ;
	}
	
	public float multiply(float num1, float num2) throws Exception {
		if(num1 <= 0 && num2 <= 0 ) {
			throw new Exception("i numeri non si possono moltiplicare");
		}
		return num1 * num2 ;
	}
	
	
}
