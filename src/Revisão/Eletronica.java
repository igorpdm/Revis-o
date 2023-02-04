package Revisão_Aula1;

import java.util.Scanner;

public class Eletronica {

    public static void main(String[] args) {
        int[] camada = {1,2,2,3,3,4,3,4,5,4,5,6,4,5,6,7,5,6,7};
        char[] subcamada = {'s','s','p','s','p','s','d','p','s','d','p','s','f','d','p','s','f','d','p'};
        int[] eletronssubcamada = {2,2,6,2,6,2,10,6,2,10,6,2,14,10,6,2,14,10,6};
        int[] totaleletrons = {2,4,10,12,18,20,30,36,38,48,54,56,70,80,86,88,102,112,118};
        int n;
        int i = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o numero atomico: ");
        n = scn.nextInt();
        for (i = 0; totaleletrons[i] <n ; i++) {
            System.out.print(camada[i]);
            System.out.print(subcamada[i]);
            System.out.println(eletronssubcamada[i]);
            System.out.println("  ");
        }
        if(totaleletrons[i]!=n){
            System.out.print(camada[i]);
            System.out.print(subcamada[i]);
            System.out.print(eletronssubcamada[i]-(totaleletrons[i]-n));
        }
    }
    
}
