/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_4.num_par_imp;

/**
 *
 * @author Usuario
 */
public class Exercicio_4Num_Par_Imp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Variavel
        int numero;

        // Solicita ao usuario um numero
        numero = Entrada.leiaInt("Digite um numero inteiro: ");

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " e PAR.");
        } else {
            System.out.println("O numero " + numero + " e IMPAR.");
        }

        System.exit(0);
    }
    
}
