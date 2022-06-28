package src.lista3B.Ex5;

// Escreva um programa que declare um inteiro, inicialize-o com 0,
// e incremente-o de 1000 em 1000, imprimindo seu valor na tela, até
// que seu valor seja 100000 (cem mil)//

import java.util.Scanner;

public class Respostas5 {
    public static void main(String[] args) {

        int numero = 0;
        while (numero <= 100000) {

            System.out.println("valor ...  " + numero);
            numero += 1000;

        }


    }
}


