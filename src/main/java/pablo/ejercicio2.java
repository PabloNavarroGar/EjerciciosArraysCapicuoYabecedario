/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pablo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pablo
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hacer un array char con las letras A a la Z
        //Generar otro array con un tamaño entre 18 y 25

        //Creamos el array char con 26 casillas
        char[] abecedario = new char[26];
        int num = 0;//Contador
        //Bucle for para rellenar el array de la A a la Z
        for (int i = 0; i < abecedario.length; i++) {

            abecedario[i] = (char) ('A' + num);//se pone el char y se suma con el numero contador

            num++;//aqui ira sumando cada vez el contador por cada letra

        }

        //Se muestra el array del abecedario
        
        System.out.println("-------ABECEDARIO----------");
        for (int i = 0; i < abecedario.length; i++) {
            System.out.print(abecedario[i] + "-");

        }

        //Crear un array aleatorio entre un rango
        int[] arrayAleatorio = new int[numeroAleatorioRango()];

        
        
        System.out.println(" ");
        
        
        System.out.println("----------ARRAY ALEATORIO------------");
        for (int i = 0; i < arrayAleatorio.length; i++) {
            //Uso la clase ARRAYS, para rellenar ese array que espacios aleatorios 
            Arrays.fill(arrayAleatorio, numeroAleatorioRango());

            System.out.print(arrayAleatorio[i] + "-");
        }

    }
     //Metodo para poner un numero entero aleatorio entre 2 rangos
    public static int numeroAleatorioRango() {
        Random random = new Random();
        int enteroAleatorio;
        int n = 15, m = 25;//Rango minimo 15 y m 25 maximo
        enteroAleatorio = random.nextInt(m - n + 1) + n;

        return enteroAleatorio;

    }
    
    public static char[] crearCharAbecedario(){
        
        char[] abecedario = new char[26];
        int contador=0;
        for (int i = 'A'; i <= 'Z'; i++) {
            abecedario[contador]= (char)  (i);
            
            contador++;
        }
        
        
        
        return abecedario;
        
        //Para poder almacenar un char en un string usamos la clase Arrya.valueof
        //String.valueOf(abecedario);
        
        
    }
    
    public static String[] crearArrays(int tamanio,int numeroArrays,char[]abecedario){
        
        String[] almacen = new String[numeroArrays];
        
        int contador =0;
        
        char[] aux= new char [tamanio];
        
        Random aleatorio = new Random();
        
        //bucle que rellena los valores del array con los arrays crados
        
        for (int j = 0; j < numeroArrays; j++) {
            for (int i = 0; i < tamanio; i++) {
                
            }
            
        }
        
        
        return almacen;
        
    }

}
