package Revisão_Aula1;

import java.util.Scanner;

public class PI {
    public static double calculo1(int quantidade){
        float pi1=0;
        float pi3=0;
        float pi2, div; 
        double fin;
        div = ((quantidade*2)-1);  
        for (float i = quantidade; i != 0; i--) {
            pi1=(i*i);
            pi2= (div-2)+((i-1)*(i-1));  
            if (i==quantidade) {
              pi2=pi2/pi1;
              pi3=pi2;
            }else{
                pi1=pi1/pi3;
                pi3=pi1+div  ;
            }
            div=div-2;
        }
        fin=4/pi3;
        
        
        
        return fin;
    }
    public static double calculo2(int quantidade){
        double pi = 0;
        for(int i = 1; i < quantidade; i+=4){
            pi = (pi+(4f/i)-(4f/(i+2f)));
        }
        return pi;
    }
    public static double calculo3(int quantidade){
        double pi = 3;
        for(int i = 2; i < quantidade; i+=4){
            pi = (pi+(4f/(i*(i+1f)*(i+2f)))-(4f/((i+2)*(i+3f)*(i+4f))));
        }
        return pi;
    }

    
    public static void main(String[] args) {
        int quantidade;
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe um numero(Quanto maior o numero mais preciso o valor de pi): ");
        quantidade = scn.nextInt();
        System.out.println("Calculo 1: "+calculo1(quantidade));
        System.out.println("Calculo 2: "+calculo2(quantidade));
        System.out.println("Calculo 2: "+calculo3(quantidade));
        
    }
}
