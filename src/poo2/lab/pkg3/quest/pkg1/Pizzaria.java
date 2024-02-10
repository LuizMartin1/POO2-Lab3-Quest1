/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public class Pizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PREPARANDO UM PEDIDO DE PIZZA MARGUERITA
        Pizza pedido1 = new MassaFinaPizza();
        Pizza margueritaPedido1 = new Queijo(new Tomate(pedido1));
        double precoPedido1 = margueritaPedido1.getCusto();
        String descPedido1 = margueritaPedido1.getDescricao();
        System.out.println("Preparando pizza Marguerita...\n");
        System.out.println(descPedido1);
        System.out.println("R$" + precoPedido1);
        
        //PREPARANDO UM PEDIDO DE PIZZA PORTUGUESA
        Pizza pedido2 = new MassaEspessaPizza();
        Pizza portuguesaPedido2 = new Queijo(new Tomate(new Ovo(pedido2)));
        double precoPedido2 = portuguesaPedido2.getCusto();
        String descPedido2 = portuguesaPedido2.getDescricao();
        System.out.println("Preparando pizza Portuguesa...\n");
        System.out.println(descPedido2);
        System.out.println("R$" + precoPedido2);
    }
    
}
