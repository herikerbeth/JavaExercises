package List1;

/*3) Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.*/

import java.text.*;
import java.util.Scanner;

public class Ex3_WeightedAverage {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float nota1, nota2, nota3, peso1, peso2, peso3, notaPeso, somaPeso, media;

        System.out.print("Informe a primeira nota: ");
        nota1 = myObj.nextFloat();
        System.out.print("Informe o peso da nota " + nota1 + ": ");
        peso1 = myObj.nextFloat();
        System.out.print("Informe a segunda nota: ");
        nota2 = myObj.nextFloat();
        System.out.print("Informe o peso da nota " + nota2 + ": ");
        peso2 = myObj.nextFloat();
        System.out.print("Informe a terceira nota: ");
        nota3 = myObj.nextFloat();
        System.out.print("Informe o peso da nota " + nota3 + ": ");
        peso3 = myObj.nextFloat();

        notaPeso = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        somaPeso = peso1 + peso2 + peso3;
        media = (notaPeso / somaPeso);
        System.out.println("Média ponderada: " + casas.format(media));
    }
}