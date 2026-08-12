/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_6.solic_num_soma_media_maior_menor_entrada;

/**
 *
 * @author Usuario
 */
public class Exercicio_6Solic_Num_Soma_Media_Maior_Menor_Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Pergunta ao usuario quantos numeros deseja informar
        int n = Entrada.leiaInt("Quantos numeros voce deseja informar? ");

        // Variaveis para calculo
        int soma = 0;
        int maior, menor, numero;

        // Le o primeiro numero para iniciar maior e menor
        numero = Entrada.leiaInt("Digite o numero 1: ");
        maior = numero;
        menor = numero;
        soma = soma + numero;

        // Le os numeros
        for (int i = 2; i <= n; i++) {
            numero = Entrada.leiaInt("Digite o numero " + i + ": ");
            soma = soma + numero;

            // Verifica se e o maior
            if (numero > maior) {
                maior = numero;
            }

            // Verifica se e o menor
            if (numero < menor) {
                menor = numero;
            }
        }

        // Calcula a media
        double media = (double) soma / n;

        // Exibe os resultados
        System.out.println("===================================");
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("===================================");

        System.exit(0);
    }
    
}
