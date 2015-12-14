/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boardgame;

/**
 *
 * @author Jean
 */
public class Dewitos {
    private int price = 10000;
    private int damage = 420;

    public Dewitos(int price, int damage) {
        this.price = price;
        this.damage = damage;
    }

    Dewitos() {
        
    }

    @Override
    public String toString() {
        return "Dewitos{" + "price=" + price + ", damage=" + damage + '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
    
    
}
