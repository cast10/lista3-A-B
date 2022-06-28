package src.lista3B.Ex2;

//Faça um programa que leia n números inteiros e imprima sua média.//

import java.util.Scanner;

public class Resposta2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você deseja? ");
        int entrada = sc.nextInt();

        int[] gaveta = new int[entrada];

        double total = 0;
        for (int i = 0; i < entrada; i++){
            System.out.print("Digitar um numero :" );
            gaveta[i] = sc.nextInt();
             total = total + gaveta[i];
        }

        System.out.println ("Somas dos números  " + total);

        double media = total / entrada;
        System.out.println("A média é  "  + media);
    }
}