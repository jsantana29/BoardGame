/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boardgame;

/**
 *
 * @author KCISCisco
 */
public class Mines {
    private int price = 300;
    private int damage = 5;
    private int duration = 0;

    public Mines(int price, int damage, int duration) {
        this.price = price;
        this.damage = damage;
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public int getDuration() {
        return duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
    
}


