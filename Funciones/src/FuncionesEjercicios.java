import java.util.Scanner;
public class FuncionesEjercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Debe dise�ar un programa que reciba 3 n�meros por consola 
		 * y determine cual de los 3 n�meros es el mayor.
		Plus: Imprimir los n�meros ordenados de mayor a menor.
		Plus: Imprimir los n�meros ordenados de menor a mayor.*/
		
		Scanner readKeyboard= new Scanner (System.in);//Creo el m�todo scanner para que se lean los datos del teclado.
		int number1=0;//Declaro las tres variables que utilizar�. Son n�meros enteros.
		int number2=0;
		int number3=0;	
		
		System.out.println("Introduce el primer n�mero entero, por favor");//Mensaje para el usuario.
		number1=readKeyboard.nextInt();//Para que se lea el dato introducido en mi variable.
		System.out.println("Introduce el segundo n�mero entero, por favor");
		number2=readKeyboard.nextInt();
		System.out.println("Introduce el tercer n�mero entero, por favor");
		number3=readKeyboard.nextInt();
		
		if (number1>number2 && number1>number3) { //Condici�n. Se eval�a si el n�mero 1 es mayor que el 2 y 3.
				System.out.println("El n�mero mayor es" + " " + number1); //Si esto es verdadero, el n�mero 1 es el mayor.
		}else if (number2>number1 && number2>number3) { // Si no se cumple lo anterior, entonces se eval�a si el n�mero 2 es mayor que el 1 y 3.
			System.out.println("El n�mero mayor es" + " " + number2);//Si esto se cumple, el n�mero 2 ser� el mayor.
		}else { //Si  nada de lo anterior se cumpli�, entonces el n�mero 3 ser� el mayor.
			System.out.println("El n�mero mayor es:" + " " + number3);
			} 
		}
	}


