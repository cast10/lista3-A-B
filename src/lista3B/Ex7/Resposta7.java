package src.lista3B.Ex7;

//Faça um programa que peça um número inteiro e determine se ele é ou
// não um número primo. Um número primo é aquele que é divisível somente
// por ele mesmo e por 1.//

import java.util.Scanner;


public class Resposta7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite um numero");
        int x = input.nextInt();
        input.close();

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {

                soma += 1;

            }

        } if (soma == 2) {

            System.out.println("é um Número Primo");

        } else {

            System.out.println("não é  um número Primo");


        }

    }
}




