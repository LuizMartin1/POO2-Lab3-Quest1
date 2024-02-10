/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public class Queijo extends PizzaDecorator {
    
    public Queijo(Pizza pizza){
        super(pizza);
    }
    
    @Override
    public String getDescricao(){
        return super.pizza.getDescricao() + "adicionando queijo...\n";
    }
    
    @Override
    public double getCusto(){
        return super.pizza.getCusto() + 1.50;
        //1.50 reais é o preço do queijo
    }
}
