/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_7.caixa_eletr_num_cedulas;

/**
 *
 * @author Usuario
 */
public class Exercicio_7Caixa_Eletr_Num_Cedulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        boolean novaSaque = true;

        while (novaSaque) {

            // Leitura do valor do saque
            int valor = Entrada.leiaInt("Digite o valor do saque: ");

            // Calculo das cedulas
            int c100 = valor / 100;
            valor = valor % 100;

            int c50 = valor / 50;
            valor = valor % 50;

            int c20 = valor / 20;
            valor = valor % 20;

            int c10 = valor / 10;
            valor = valor % 10;

            int c5 = valor / 5;
            valor = valor % 5;

            int c2 = valor / 2;
            valor = valor % 2;

            int c1 = valor;

            // Exibe as cedulas necessarias
            System.out.println("===================================");
            System.out.println("Cedulas necessarias:");
            System.out.println("R$ 100: " + c100);
            System.out.println("R$  50: " + c50);
            System.out.println("R$  20: " + c20);
            System.out.println("R$  10: " + c10);
            System.out.println("R$   5: " + c5);
            System.out.println("R$   2: " + c2);
            System.out.println("R$   1: " + c1);
            System.out.println("===================================");

            // Pergunta se deseja realizar novo saque
            novaSaque = Entrada.leiaBoolean("Deseja realizar um novo saque? (true/false): ");
        }

        System.out.println("Obrigado por utilizar o caixa eletronico!");
        System.exit(0);
    }
    
}
