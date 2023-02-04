package Revisão_Aula1;

import java.util.Scanner;

public class Ordena {

    public static void imprimevetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("");
    }

    public static void ordenavetor(int[] v) {
        int temp;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < (v.length-1); j++) {
                if (v[j] > v[j + 1]) {
                    temp = v[j];
                    v[j]= v[j + 1];
                    v[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] vetor = new int[7];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º numero: ");
            vetor[i] = scn.nextInt();
        }
        imprimevetor(vetor);
        ordenavetor(vetor);
        imprimevetor(vetor);
    }
}
