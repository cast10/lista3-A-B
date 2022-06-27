package src.lista3B.Ex1;

//Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes.
// A primeira vez com "for" e a segunda com "while".//

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Resposta1 {

                public static void main(String[] args) {
                    for (int i = 0; i < 101; i++) {
                        System.out.print(i+ " ");

                    }
                    int contador = 0;

                    while (contador < 101) {
                        System.out.println(contador);
                        contador++;}
            }
}


