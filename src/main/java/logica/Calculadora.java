package logica;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculadora {
	
	@WebMethod
	public float sumar(float num1, float num2) {
		return num1+num2;
	}
	
	@WebMethod
	public float restar(float num1, float num2) {
		return num1-num2;
	}
	
	@WebMethod
	public float multiplicar(float num1, float num2) {
		return num1*num2;
	}
	
	@WebMethod
	public float dividir(float num1, float num2) {
		return num1/num2;
	}
}