package src.lista3B.Ex3;


//Escreva um programa que leia 10 números e escreva o menor valor lido é o
// maior valor lido//


import java.util.*;

public class Resposta3  {
    public static void main(String[] args) {

        int quantidade = 10;
        List<Integer> caixa = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número: ");
            Scanner input = new Scanner(System.in);
            caixa.add(input.nextInt());
        }

        int maior = 0;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < quantidade; i++) {
            if (caixa.get(i) > maior) {
                maior = caixa.get(i);
            } else if (caixa.get(i) < menor) {
                menor = caixa.get(i);
            }
        }
        System.out.println("Número maior   " +maior);
        System.out.println("Número menor   " +menor);

    }
}



