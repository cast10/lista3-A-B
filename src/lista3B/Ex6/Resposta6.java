package src.lista3B.Ex6;

//Faça um programa que some os números ímpares contidos em um intervalo
// definido pelo usuário. O usuário define o valor inicial do intervalo
// e o valor final deste intervalo e o programa deve somar todos os números
// ímpares contidos neste intervalo. Caso o usuário digite um intervalo
// inválido (começando por um valor maior que o valor final) deve ser escrito
// uma mensagem de erro na tela, “Intervalo de valores inválido” e o programa
// termina.//

import javax.swing.*;
import java.util.Scanner;

public class Resposta6 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("informar o começo ");
        int comeco = input.nextInt();
        System.out.println("informar o final ");
        int finaly = input.nextInt();
        input.close();
        int soma = 0;
        for (int i = comeco; i < finaly; i++){

            if (i % 2 == 1){

                soma +=1;
            }

        }
        System.out.println("Soma dos intervalos é  "  + soma);


    }
}
