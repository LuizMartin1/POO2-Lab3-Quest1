/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg3.quest.pkg1;

/**
 *
 * @author Luiz Henrique
 */
public class Tomate extends PizzaDecorator {
    
    public Tomate(Pizza pizza){
        super(pizza);
    }
    
    @Override
    public String getDescricao(){
        return super.pizza.getDescricao() + "adicionando tomate...\n";
    }
    
    @Override
    public double getCusto(){
        return super.pizza.getCusto() + 2.00;
        //2.00 reais é o preço do tomate
    }
}
