/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author f-er9
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        Boolean variable = false;
        int invertido=0, resto=0;
        System.out.println("Digite un numero y le diremos si es palindromo");
        int numero = f.nextInt();
        int mismon = numero;
        
        if(numero<0){
            System.out.println(variable);
        }else{
            while(numero > 0){
                resto = numero % 10;
                invertido = invertido * 10 + resto;
                numero /=10;
            }
            
            if(mismon == invertido){
                variable = true;
                System.out.println(variable);
            }else{
                System.out.println(variable);
            }
            
        }
    }
    
}
