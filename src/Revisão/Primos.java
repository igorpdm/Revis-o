
package Revisão_Aula1;

import java.util.Scanner;

public class Primos {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x;
        System.out.print("Informe a quantidade de numeros primos: ");
        x = scn.nextInt();
        for (int i = 2; i < x; i++) {
            System.out.print(2+",");
        }
    }
    
}
