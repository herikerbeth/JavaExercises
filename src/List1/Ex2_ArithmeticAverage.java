package List1;

/*2) Faça um programa que receba três notas, calcule e mostre a média aritmética.*/

import java.util.Scanner;
import java.text.*;

public class Ex2_ArithmeticAverage {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = myObj.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = myObj.nextFloat();
        System.out.print("Digite a terceira nota: ");
        nota3 = myObj.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média da sua nota é: " + casas.format(media));
    }
}
