/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_1.soma_num_int;

/**
 *
 * @author Usuario
 */
public class Exercicio_1Soma_Num_Int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Variaveis e abertura do scanner de numeros
    int numero1, numero2, resultado;
    
    //Solicita ao usuario o primeiro numero
    numero1 = Entrada.leiaInt("Digite o primeiro numero inteiro: ");
    numero2 = Entrada.leiaInt("Digite o segundo numero inteiro: ");
    
    //Realiza o calculo e apresenta o resultado
    resultado = numero1 + numero2;
    System.out.println("A soma dos dois numeros e: " + resultado);
    
    System.exit(0);
        
    }
    
}
