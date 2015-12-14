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
class Missiles {
    private int price = 1000;
    private int damage = 7;
    private int duration = 0;

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
