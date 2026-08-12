/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_2.nome_idade_entrada;

/**
 *
 * @author Usuario
 */
public class Exercicio_2Nome_Idade_Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Variaveis de nome e idade
    int idade, resultado;
    String nome;
    
    //Solicita nome e idade
    nome = Entrada.leiaString("Digite seu nome: ");
    idade = Entrada.leiaInt("Digite sua Idade: ");
    
    //Calcula a idade com mais um ano
    resultado = idade + 1;
    
    //Imprime mensagem /nome e idade
    System.out.println("Ola, " + nome);
    System.out.println("Sua idade daqui a 1 ano sera " + resultado + " anos");
    
    System.exit(0);
    }
    
}
