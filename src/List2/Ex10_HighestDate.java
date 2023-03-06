package List2;

/*10) Faça um programa que determine a data cronologicamente maior entre duas datas fornecidas
pelo usuário. Cada data deve ser composta por três valores inteiros, em que o primeiro
representa o dia, o segundo, o mês e o terceiro, o ano.*/

import java.util.Scanner;

public class Ex10_HighestDate {
    public static void main(String[] args) {
        int dia1, dia2, mes1, mes2, ano1, ano2;
        String data1, data2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira data.");
        System.out.print("Digite o dia: ");
        dia1 = scan.nextInt();
        System.out.print("Digite o mês: ");
        mes1 = scan.nextInt();
        System.out.print("Digite o ano: ");
        ano1 = scan.nextInt();
        System.out.println("Informe a segunda data.");
        System.out.print("Digite o dia: ");
        dia2 = scan.nextInt();
        System.out.print("Digite o mês: ");
        mes2 = scan.nextInt();
        System.out.print("Digite o ano: ");
        ano2 = scan.nextInt();

        data1 = dia1 + "/" + mes1 + "/" + ano1;
        data2 = dia2 + "/" + mes2 + "/" + ano2;

        if (ano1 > ano2) {
            System.out.println("A primeira data é maior: " + data1);
        } else if (ano2 > ano1) {
            System.out.println("A segunda data é maior: " + data2);
        } else {
            if (mes1 > mes2) {
                System.out.println("A primeira data é maior: " + data1);
            } else if (mes2 > mes1) {
                System.out.println("A segunda data é maior: " + data2);
            } else {
                if (dia1 > dia2) {
                    System.out.println("A primeira data é maior: " + data1);
                } else if (dia2 > dia1) {
                    System.out.println("A segunda data é maior: " + data2);
                } else {
                    System.out.println("As data são iguais!");
                }
            }
        }
    }
}