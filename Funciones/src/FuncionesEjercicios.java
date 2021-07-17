import java.util.Scanner;
public class FuncionesEjercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Debe diseñar un programa que reciba 3 números por consola 
		 * y determine cual de los 3 números es el mayor.
		Plus: Imprimir los números ordenados de mayor a menor.
		Plus: Imprimir los números ordenados de menor a mayor.*/
		
		Scanner readKeyboard= new Scanner (System.in);//Creo el método scanner para que se lean los datos del teclado.
		int number1=0;//Declaro las tres variables que utilizaré. Son números enteros.
		int number2=0;
		int number3=0;	
		
		System.out.println("Introduce el primer número entero, por favor");//Mensaje para el usuario.
		number1=readKeyboard.nextInt();//Para que se lea el dato introducido en mi variable.
		System.out.println("Introduce el segundo número entero, por favor");
		number2=readKeyboard.nextInt();
		System.out.println("Introduce el tercer número entero, por favor");
		number3=readKeyboard.nextInt();
		
		if (number1>number2 && number1>number3) { //Condición. Se evalúa si el número 1 es mayor que el 2 y 3.
				System.out.println("El número mayor es" + " " + number1); //Si esto es verdadero, el número 1 es el mayor.
		}else if (number2>number1 && number2>number3) { // Si no se cumple lo anterior, entonces se evalúa si el número 2 es mayor que el 1 y 3.
			System.out.println("El número mayor es" + " " + number2);//Si esto se cumple, el número 2 será el mayor.
		}else { //Si  nada de lo anterior se cumplió, entonces el número 3 será el mayor.
			System.out.println("El número mayor es:" + " " + number3);
			} 
		}
	}


