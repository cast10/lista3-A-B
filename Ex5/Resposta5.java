package Ex5;

/////Faça um Programa que receba um número e exiba o dia correspondente da semana.
// (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer a mensagem “valor inválido//

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Resposta5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o dia da semana? ");
        int num = sc.nextInt();

        switch (num){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sábado");
                break;
            default:
                System.out.println("cófigo inválido");

        }




    }
}
