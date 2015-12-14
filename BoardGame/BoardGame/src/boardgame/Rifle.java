/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boardgame;

import java.util.Random;

/**
 *
 * @author KCISCisco
 */
public class Rifle {
    private int price = 500;
    private int damage;

    public Rifle(int price, int damage) {
        this.price = price;
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public int Rifleshot(){
        Random rnd = new Random();
        damage = rnd.nextInt(6);
        return damage;
    }
    
    
}
