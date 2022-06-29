package src.lista3BEex9;

import java.util.Scanner;

public class Resposta9 {

    public static void main(String[] args){

        Scanner numberfator = new Scanner(System.in);
        System.out.println("Digito um numero");
        int numero = numberfator.nextInt();

        int cont = numero;
        int soma = 1;

        while (cont > 1){
        soma *= cont;
        cont --;


        }

        System.out.println(" A resposta é " + numero +  " é igual o  " + soma );
    }

}
