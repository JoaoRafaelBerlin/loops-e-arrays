package br.com.dio.exercicios.loops;

import java.util.Scanner;

import javax.management.monitor.StringMonitorMBean;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    
    public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        //int media; 
        int soma = 0; 


        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

        if (numero > maior) maior = numero;

            count = count + 1;

            System.out.println("Maior: " + maior);
            System.out.println("Media: " + soma/5);

        } while(count < 5);
        
    }

}