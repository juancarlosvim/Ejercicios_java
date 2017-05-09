
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juancarlosvim
 */
public class NumerosPares {

    /**
     * @param args the command line arguments
     */
    private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
        String input;
        System.out.println("Introduce un numero");
        
        input = stdin.readLine();
        
        int numero = Integer.parseInt(input);
        
        if(numero%2==0){
            suma(numero);
        }else{
            sumaImpares(numero);
        }
        
        
        
        
    }
    public static void suma(int numeros){
        int n = numeros;
        int contador=0;
        int suma=0;
        int j =2;
        //System.out.println(" "+n);
        
       while(contador<n*2){
           if(contador%2==0){
               suma = suma+ contador;
           }
           contador++;
           
       }
      
        
        System.out.println(" "+suma);
        
    }
    
      public static void sumaImpares(int numeros){
        int n = numeros;
        int contador=0;
        int suma=0;
        int j =2;
        //System.out.println(" "+n);
        
       while(contador<n*2){
           if(contador%2==1){
               suma = suma+ contador;
           }
           contador++;
           
       }
      
        
        System.out.println(" "+suma);
        
    }
}
