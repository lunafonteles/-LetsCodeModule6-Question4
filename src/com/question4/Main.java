package com.question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scancotacaoDolar = new Scanner(System.in);
        System.out.println("Digite a cotação do dolar de hoje");
        float cotacaoDolar = scancotacaoDolar.nextFloat();
        System.out.println("Digite o valor em reais que deseja converter");
        float reais = scancotacaoDolar.nextFloat();

        float result = Conversor.dolarConverter(cotacaoDolar, reais);
        System.out.printf("%.2f equivalem a %.2f dolares. ", reais, result);
        //nao consegui formatar a moeda

    }
}