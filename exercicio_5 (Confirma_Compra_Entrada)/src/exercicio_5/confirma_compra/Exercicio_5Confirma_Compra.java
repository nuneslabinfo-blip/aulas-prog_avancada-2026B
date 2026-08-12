/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_5.confirma_compra;

/**
 *
 * @author Usuario
 */
public class Exercicio_5Confirma_Compra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Produto p1 = new Produto();

        // Leitura dos dados do produto
        p1.nome = Entrada.leiaString("Digite o nome do produto: ");
        p1.preco = Entrada.leiaString("Digite o preco do produto: ");

        // Pergunta ao usuario se deseja confirmar a compra
        boolean confirmar = Entrada.leiaBoolean("Confirmar compra? (Confirmar/Cancelar): ");

        // Verifica a decisao do usuario
        if (confirmar) {
            System.out.println("===================================");
            System.out.println("Compra confirmada!");
            p1.imprimirDados();
            System.out.println("===================================");
        } else {
            System.out.println("===================================");
            System.out.println("Compra cancelada!");
            System.out.println("===================================");
        }

        System.exit(0);
    }
    
}
