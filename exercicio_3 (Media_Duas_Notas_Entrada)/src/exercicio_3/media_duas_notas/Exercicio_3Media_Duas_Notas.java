/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_3.media_duas_notas;

/**
 *
 * @author Usuario
 */
public class Exercicio_3Media_Duas_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // Variaveis
    double nota1, nota2, media;

    // Solicita ao usuario as notas
    nota1 = Entrada.leiaDouble("Digite a primeira nota: ");
    nota2 = Entrada.leiaDouble("Digite a segunda nota: ");

    // Calcula a media aritmetica
    media = (nota1 + nota2) / 2;

    // Exibe a media
    System.out.println("Media do aluno: " + media);

    // Verifica se o aluno foi aprovado ou reprovado
    if (media >= 7.0) {
        System.out.println("Situacao: Aprovado!");
    } else {
        System.out.println("Situacao: Reprovado!");
    }

    System.exit(0);
    }
    
}
