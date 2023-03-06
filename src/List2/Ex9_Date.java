package List2;

/*9) Faça um programa que mostre a data e a hora do sistema nos seguintes formatos:
DD/MM/AAAA – mês por extenso e hora:minuto.*/

import java.util.Scanner;

public class Ex9_Date {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d, m, a, hora, min;
        String mes = "";
        System.out.print("Digite o dia: ");
        d = scan.nextInt();
        System.out.print("Digite o mês: ");
        m = scan.nextInt();
        System.out.print("Digite o ano: ");
        a = scan.nextInt();
        System.out.print("Digite a hora: ");
        hora = scan.nextInt();
        System.out.print("Digite o o minuto: ");
        min = scan.nextInt();
        switch (m) {
            case 1 -> mes += "January";
            case 2 -> mes += "February";
            case 3 -> mes += "March";
            case 4 -> mes += "April";
            case 5 -> mes += "May";
            case 6 -> mes += "June";
            case 7 -> mes += "July";
            case 8 -> mes += "August";
            case 9 -> mes += "September";
            case 10 -> mes += "October";
            case 11 -> mes += "November";
            case 12 -> mes += "December";
            default -> {
                System.out.println("Mês não identificado!");
                mes += "?";
            }
        }
        System.out.println("Data: " + d + "/" + mes + "/" + a);
        System.out.println("Hora: " + hora + ":" + min);
    }
}