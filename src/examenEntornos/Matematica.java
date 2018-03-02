package examenEntornos;

import java.util.ArrayList;

/**
 * @author ik012982i9
 *
 */
public class Matematica {

	private int a;
	private int b;
	private int resultado;
	
	
	private int[] total = new int[5];

	/**
	 * realiza una suma
	 * @param a primer valor de la operacion
	 * @param b segundo valor de la operaicon
	 * @return 
	 */
	public int suma() {
		resultado = a + b;

		total[1] = resultado;
		
		return resultado;
	}
	
	/**
	 * si a es mayor que b, devuelve true
	 * @param a
	 * @param b
	 * @return
	 */
	public boolean mayor (){
		boolean esMayor = false;
		if(a>b){
			esMayor=true;
		}
		
		return esMayor;
	}
	
	/**
	 * devuelve el array en el que se han guardado los resultados
	 * @param total array donde se guardan los resultados
	 * @return
	 */
	public int result(){
		int resul=0;
		for(int i=0; i<total.length;i++){
			resul=total[i];
			System.out.println(resul);
		}
		return resul;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int[] getTotal() {
		return total;
	}

	public void setTotal(int[] total) {
		this.total = total;
	}


	
	
}
