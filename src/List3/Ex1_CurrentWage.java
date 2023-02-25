package List3;

/*1) Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
 a) Esse funcionário foi contratado em 2015, com salário inicial de R$ 1.000,00.
 b) Em 2016, ele recebeu aumento de 1,5% sobre seu salário inicial.
 c) A partir de 2017 (inclusive), os aumentos salariais sempre corresponderam ao dobro do
 percentual do ano anterior.
 Faça um programa que determine o salário atual desse funcionário.*/

import java.util.Scanner;
import java.text.*;

public class Ex1_CurrentWage {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salInicial, salarioAtual, aumentoNovo;
        int aumento, anoInicial, anoAtual;

        System.out.print("Informe o ano atual: ");
        anoAtual = dado.nextInt();
        anoInicial = 2017;
        salInicial = 1000;
        aumento = 3;

        while (anoInicial < anoAtual) {
            aumento *= 2;
            anoInicial++;
        }
        aumentoNovo = (salInicial * aumento) / 100;
        salarioAtual = salInicial + aumentoNovo;
        System.out.println("Salário atual: R$ " + casas.format(salarioAtual));
    }
}