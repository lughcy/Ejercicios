/*
Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
*/
import java.util.Scanner;

public class U018 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Cantidad total de preguntas: ");
        int totalPreguntas = consola.nextInt();
        System.out.print("Cantidad de respuestas correctas: ");
        int respuestasCorrectas = consola.nextInt();

        double porcentaje = (double) respuestasCorrectas/totalPreguntas * 100;

        if(porcentaje>=90){
            System.out.println("Nivel Maximo");
        }else if(porcentaje>=75 && 90<porcentaje){
            System.out.println("Nivel medio ");
        }else if(porcentaje>=50 && 75<porcentaje){
            System.out.println("Nivel regular");
        }else {
            System.out.println("Fuera de Nivel");
        }

    }
}