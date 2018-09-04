package calculadoratesting;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author matte
 */
public class Calculadoratesting {

    public static int suma(double a , double b) {
        System.out.println((a+b));
        return 0;}
    public static int resta(double a , double b) {
        System.out.println((a-b));
        return 0;}
    public static int multiplicacion(double a , double b) {
        System.out.println((a*b));
        return 0;}
    public static int division(double a , double b) {
        System.out.println((float)(a/b));
        return 0;}
    
    public static void main(String[] args) {
        System.out.println("********************************************************************");
        System.out.println("********************************************************************");
        System.out.println("**                                                                **");
        System.out.println("**                     Calculatron                                **");
        System.out.println("**                  Calculadora en java                           **");
        System.out.println("**                                                                **");
        System.out.println("********************************************************************");
        System.out.println("********************************************************************");
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
 
        System.out.println("1. suma dos numeros");
        System.out.println("2. multiplicar dos numeros");
        System.out.println("3. restar dos numeros");
        System.out.println("4. dividir dos numeros");
        System.out.println("5. Salir del Programa");
 
            try {
 
                System.out.println("Elije una operacion:  (Ejemplo : 1)  ");
                opcion = sn.nextInt();
                double variable1;
                double variable2;
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado suma");
                        System.out.println("elija las variables");
                        System.out.println("primera variable");
                        variable1=sn.nextInt();
                        System.out.println("Segunda variable");
                        variable2=sn.nextInt();
                        System.out.println(suma(variable1, variable2));                        
                        break;
                    case 2:
                        System.out.println("Has seleccionado multiplicacion");
                        System.out.println("elija las variables");
                        System.out.println("primera variable");
                        variable1=sn.nextInt();
                        System.out.println("Segunda variable");
                        variable2=sn.nextInt();
                        System.out.println(multiplicacion(variable1, variable2));                        
                        break;
                    case 3:
                        System.out.println("Has seleccionado resta");
                        System.out.println("elija las variables");
                        System.out.println("primera variable");
                        variable1=sn.nextInt();
                        System.out.println("Segunda variable");
                        variable2=sn.nextInt();
                        System.out.println(resta(variable1, variable2));                        
                        break;
                    case 4:
                        System.out.println("Has seleccionado division");
                        System.out.println("elija las variables");
                        System.out.println("primera variable");
                        variable1=sn.nextInt();
                        System.out.println("Segunda variable");
                        variable2=sn.nextInt();
                        System.out.println(division(variable1, variable2));                        
                        break;
                    case 5:
                        System.out.println("Eliminando Session");
                        System.out.println("Hasta Luego");
                        salir = true;                      
                        break;
                    default:
                        System.out.println("Solo opciones entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

}



