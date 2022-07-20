//Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
//Ao final mostre os números e seus sucessores.

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
      Random random = new Random();

      int[] numeros = new int[20];

       
        for (int i = 0; i < numeros.length; i++){
            int numerosAleatorios = random.nextInt(100);
            numeros[i] = numerosAleatorios;
        } 
        
        System.out.println("Números aleatórios: ");
        for(int numerosAleatorios : numeros){
            System.out.println(numerosAleatorios);
        }

        System.out.println("Antecessor dos números aleatórios: ");
        for(int numerosAleatorios : numeros){
            System.out.println(numerosAleatorios - 1);
        }

        System.out.println("Sucessor dos números aleatórios: ");
        for(int numerosAleatorios : numeros){
            System.out.println(numerosAleatorios + 1);
        }
    }
    
}
