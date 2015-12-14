/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boardgame;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author KCISCisco
 */
public class Player1 {
    private int health = 20;
    private int money = 1500;
    private int position = 0;
    private int mines = 0;
    private int shots = 0;
    private int missiles = 0;
    private int dewitos = 0;

    public Player1(int health, int money, int position, int mines, int shots, int missiles, int dewitos) {
        this.health = health;
        this.mines = mines;
        this.missiles = missiles;
        this.money = money;
        this.position = position;
        this.shots = shots;
        this.dewitos = dewitos;
    }

    Player1() {
      
    }

    @Override
    public String toString() {
        return "Player1{" + "health=" + health + ", money=" + money + ", position=" + position + ", mines=" + mines + ", shots=" + shots + ", missiles=" + missiles + ", dewitos=" + dewitos + '}';
    }

    
    public int Player1Roll(){
        Random rnd = new Random();
      
        int move = rnd.nextInt(6);
        position += move;
        
        return move;
        
    }
    
    public void Player1Moved(int move){
        JOptionPane.showMessageDialog(null,"You moved "+ move +" spaces!");
    }
    
    
    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public int getPosition() {
        return position;
    }

    public int getMines() {
        return mines;
    }

    public int getShots() {
        return shots;
    }

    public int getMissiles() {
        return missiles;
    }

    public int getDewitos() {
        return dewitos;
    }
    
    

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setMines(int mines) {
        this.mines = mines;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public void setMissiles(int missiles) {
        this.missiles = missiles;
    }

    public void setDewitos(int dewitos) {
        this.dewitos = dewitos;
    }
    
    
    
    
    
}
