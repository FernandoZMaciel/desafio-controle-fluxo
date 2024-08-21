package org.example;

import org.example.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        if (contagem < 0) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
        //realizar o for para imprimir os números com base na variável contagem
    }
}