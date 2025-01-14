package br.com.dio.exercicios.loops;

import java.util.Scanner;

import javax.lang.model.element.NestingKind;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;
        
        System.out.println("Quantidade de Numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; //quantPares = quantPares + 1
            else quantImpares++;

            //count = count + 1;
            count++;

        } while(count < quantNumeros);

        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Impares: " + quantImpares);

    }

}