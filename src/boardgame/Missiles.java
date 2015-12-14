/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boardgame;

import java.util.Random;

/**
 *
 * @author Jean
 */
class Missiles {
    private int price = 1200;
    private int damage = 10;
    private int duration = 0;
    private boolean launched;

    public Missiles(int price,int damage,int duration) {
        this.price = price;
        this.damage = damage;
        this.duration = duration;
    }

    Missiles() {
        
    }

    @Override
    public String toString() {
        return "Missiles{" + "price=" + price + ", damage=" + damage + ", duration=" + duration + '}';
    }
    
    public int isLaunched(){
        Random rnd = new Random();
        duration = rnd.nextInt(3);
        duration++;
        return duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
    
}
