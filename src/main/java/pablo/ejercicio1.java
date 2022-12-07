/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pablo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int numeroTeclado;
        String numeroString;
        //1º.Leer un nº por teclado
        //Convertir ese int en string, y de string en char[]
        
        numeroTeclado=pedirNumero();
        
        System.out.println("El numero(int) es " + numeroTeclado);
        
        //convirtiendo el numero en String
        numeroString= Integer.toString(numeroTeclado);
        
        System.out.println("Se ha pasado el numero por String = "+ numeroString);
        
        //Convirtiendo el String en Char[], con el metodo con Strings
        
        char[] numeroChar = numeroString.toCharArray();
        
        //Declaro el For para leer el array y se muestre.
        for (int i = 0; i < numeroChar.length; i++) {
            
            
            System.out.print(numeroChar[i]+" - ");
        }
        //Imprimimos resultados llamando al metodo con la comparativa del nuestro array char en 
        //la condicion del if llamando al metodo
        System.out.println(" \n78");
        System.out.println("---------Metodo CAPICUA-----------");
        
        
        if (esCapicuo(numeroChar)){
            
            System.out.println("El array es capicuo");
            
        } else{
            
            System.out.println("El array no es capicuo");
        }
        
    }
    
    
    
    public static int pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        // Se pone dentro del bloque try la sentencia que puede producir 
        // el error
        do {
            System.out.println("Introduce el numero que vas a usar");
            try {
                numero = teclado.nextInt();
                // La calificación es válida. Imprimo y salgo del bucle

                break;
            } catch (InputMismatchException ime) {
                // En caso de error
                System.out.println("No es un numero entero");
                // Limpieza del buffer
                teclado.nextLine();
            }
        } while (true);
        return numero;

    }
    
    public static boolean esCapicuo(char[] array){
        boolean resultado = true;
        int aux=0;
        do{
            //bucle
            //Si el array con el numero aun en su indice no es igual al array de su longitud, mirando una casilla menos y con el numero aux
            
            if(array[aux]!=array[array.length-1-aux]){
                resultado = false;//se cambia a falso no es igual
            }
            //se suma 1 al contador
            aux++;
           //Se repetira siempre que sea par
        }while(aux <array.length/2 && resultado);
        
        
        
        
        return resultado;
    }
}
