package examenEntornos;

import static org.junit.Assert.*;

public class Test extends Matematica {

	@org.junit.Test
	public void test() {
		
		try{
			Matematica sumar = new Matematica();
			sumar.suma();
		}catch (NullPointerException ex){
			// cuando falta un valor
			System.out.println("tienes que rellenar todo");
			fail("error falta un numero");
		}catch (NumberFormatException ex){
			// si introducimos letras
			System.out.println("introduce un numero");
			fail("formato erroneo");
		}
		
		
		try{
			Matematica more = new Matematica();
			more.mayor();
		}catch (NullPointerException ex){
			// cuando falta un valor
			System.out.println("tienes que rellenar todo");
			fail("error falta un numero");
		}catch (NumberFormatException ex){
			// si introducimos letras
			System.out.println("introduce un numero");
			fail("formato erroneo");
		}

		
		
		try{
			Matematica array = new Matematica();
			array.result();
		}catch (NullPointerException ex){
			// cuando falta un valor
			System.out.println("tienes que rellenar todo");
			fail("error falta un numero");
		}catch (NumberFormatException ex){
			// si introducimos letras
			System.out.println("introduce un numero");
			fail("formato erroneo");
		}

}}
