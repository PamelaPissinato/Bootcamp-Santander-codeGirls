//Faça um programa que leia conjuntos de dois valores,
//primeiro representando o nome do aluno e o segundo a
//idade. Pare o programa inserindo o valor 0 no campo nome.

import java.util.Scanner;

public class nomeIdade{
      public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);   
        
        while(true){
            System.out.println("Digite seu nome: ");
            String nome = entrada.next();

            if(nome.equals("0")) break;

            System.out.println("Digite sua idade: ");
            int idade = entrada.nextInt();   
        }
    entrada.close();
    }

}