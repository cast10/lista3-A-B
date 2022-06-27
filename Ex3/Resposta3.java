package Ex3;


    ///Faça um programa que receba duas notas parciais de um aluno.
// O programa deve calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.//


import java.util.Scanner;

    public class Resposta3 {
        public static void main(String[] args) {
            System.out.println("Nota primeiro semestre é? ");
            Scanner sc = new Scanner(System.in);
            double Nota1 = sc.nextDouble();
            System.out.println("Nota segundo semestre é? ");
            double Nota2 = sc.nextDouble();
            double Media = ((Nota2 + Nota1)/2);

            if (Media == 10 ){
            System.out.println("Media " + Media  +  "o aluno está  Aprovado com Distinção");
            }
            else{ if (Media >= 7 )
                System.out.println("Media   " + Media  +  "o aluno está Aprovado");
                else {
                System.out.println("Media   " + Media  +  " o aluno está Reprovado");
            }


            }
        }


    }

