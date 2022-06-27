package src.lista3A.Ex4;

//Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores
// e lhe contrataram para desenvolver o programa que calcula os reajustes.
// Portanto, faça um programa que recebe o salário de um colaborador e o reajuste
// segundo o seguinte critério, baseado no salário atual///


import java.util.Scanner;

public class Resposta4 {
    public static void main(String[] args) {
        System.out.println("Qual é o salário atual? ");
        Scanner sc = new Scanner(System.in);
        double SalarioAtual = sc.nextDouble();

        double VintePorc = (SalarioAtual * 0.20);
        double QuinzePorc = (SalarioAtual * 0.15);
        double DezPorc = (SalarioAtual * 0.10);
        double CincoPorc = (SalarioAtual * 0.05);
        double ComVinte = (SalarioAtual * 0.20) + SalarioAtual;
        double ComQuinze= (SalarioAtual * 0.15) + SalarioAtual;
        double ComDez  = (SalarioAtual * 0.10) + SalarioAtual;
        double ConCinco = (SalarioAtual * 0.05) + SalarioAtual;



        if (SalarioAtual < 279.99) {
            System.out.println("Valor de 20% é R$ " + VintePorc + "  logo o seu salário será reajustado para  R$  " + ComVinte);
        } else
            if (SalarioAtual < 699.00) {
                System.out.println("Valor de 15% é R$ " + QuinzePorc + "  logo o seu salário será reajustado para  R$  " + ComQuinze);
            }
             else
                if (SalarioAtual < 1499.99) {
                    System.out.println("Valor de 10% é R$ " + DezPorc + "  logo o seu salário será reajustado para  R$  " + ComDez);
                } else
                     {
                         System.out.println("Valor de 5% é R$  " + CincoPorc + "  logo o seu salário será reajustado para  R$  " + ConCinco);
                    }





    }}






