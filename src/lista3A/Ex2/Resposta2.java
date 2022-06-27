package src.lista3A.Ex2;

import java.util.Scanner;

public class Resposta2 {
    public static void main(String[] args){
        System.out.println("Qual é preço do pao francês ? ");
        Scanner sc = new Scanner(System.in);
        double  frances =sc.nextDouble();

        System.out.println("Qual é preço do pao Leite ? ");
        double  leite = sc.nextDouble();

        System.out.println("Qual é preço do pao integral ? ");
        double  integral = sc.nextDouble();

        if (frances < leite && frances < integral ) {

            System.out.println("Este pão francês :" + frances  +  " é mais barato ");
        }
        else{ if (integral < frances && integral < leite)

            System.out.println("Este pão integral :" + integral +  " é mais barato ");

        else{

            System.out.println("Este pão Leite :" + leite +  " é mais barato ");

        }

        }}


}
