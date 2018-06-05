package exercicios.iniciante.ex1047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int hora, horaF, minuto, minutoF, duracaoH, duracaoM;
        Scanner sc = new Scanner(System.in);

        hora = sc.nextInt();
        minuto = sc.nextInt();
        horaF = sc.nextInt();
        minutoF = sc.nextInt();
        sc.close();
        
        duracaoH = horaF - hora;
        if (duracaoH < 0) {
            duracaoH = 24 + (horaF - hora);
        }
        duracaoM = minutoF - minuto;
        if (duracaoM < 0) {
            duracaoM = 60 + (minutoF - minuto);
            duracaoH--;
        }
        if (hora == horaF && minuto == minutoF) {
            System.out.print("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracaoH, duracaoM);
        }
    }

}