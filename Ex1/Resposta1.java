package Ex1;

//Faça um programa que receba dois números e imprima o maior deles///

import java.util.Scanner;

public class Resposta1 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número ");
        int numeroX = sc.nextInt();

        System.out.println("Digite um número ");
        int numeroY = sc.nextInt();

        if (numeroX > numeroY){

            System.out.println("o Número:  " + numeroY +  " é meenor  ");
        }
        else{ System.out.println("o Número:  " + numeroX +  " é maior  ");


        }
    }
}

