package src.lista3B.Ex4;

//Faça um programa que leia n números inteiros e imprima sua média.//

import com.sun.jdi.ArrayReference;

import java.sql.Array;
import java.util.Scanner;

public class Resposta4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros você deseja? ");
        int quant = sc.nextInt();

        int[] numeros  = new int[quant];


        int  soma = 0;

        for (int i = 0; i < quant; i++){

            System.out.print("Digitar um numero :" );
             numeros[i] = sc.nextInt();

            while(numeros[i] < 0){
                System.out.println("este número é inválido " );
                numeros[i] =sc.nextInt();
            }

            soma = soma + numeros[i];
        }
        sc.close();

        System.out.println ("Somas dos números  " +  soma);

    }
}