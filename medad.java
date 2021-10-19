/*
Author       :Daniel Alberto De Jesús (danyd3)
Fecha        :19_10_2021
*/

import java.util.Scanner;
public class medad {//Inicio clase principal
	public static void main(String[] args){//Inicio metodo principal

		//Declaracion de variables
		int Fecha_Nacimiento;
		int Fecha_Actual = 2021;
		int diferencia = 0;
		Scanner teclado = new Scanner (System.in);

		System.out.print("Digite su año de nacimiento")
		Fecha_Nacimiento = teclado.nextInt();

		diferencia = (Fecha_Actual - Fecha_Nacimiento);

		if (diferencia >= 18){
			System.out.print ("El usuario tiene " + diferencia + ", es mayor de edad");
		}
		else {
			System.out.print ("El usuario tiene " + diferencia + ",es menor de edad");
		}
	}//Fin del metodo principal

//Fin clase principal

	
		
