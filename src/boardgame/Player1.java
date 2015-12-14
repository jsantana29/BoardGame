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
    private int money = 1200;
    private int position = 1;
    private int mines = 0;
    private int shots = 0;
    private int missiles = 0;
    private int dewitos = 0;
    private int hitDay = 0;
    private boolean launched;

    public Player1(int health, int money, int position, int mines, int shots, int missiles, int dewitos, int hitDay,boolean launched) {
        this.health = health;
        this.mines = mines;
        this.missiles = missiles;
        this.money = money;
        this.position = position;
        this.shots = shots;
        this.dewitos = dewitos;
        this.hitDay = hitDay;
        this.launched = launched;
    }

    Player1() {
      
    }

    @Override
    public String toString() {
        return "Player1{" + "health=" + health + ", money=" + money + ", position=" + position + ", mines=" + mines + ", shots=" + shots + ", missiles=" + missiles + ", dewitos=" + dewitos + ", hitDay=" + hitDay + ", launched=" + launched + '}';
    }

    public int Player1Roll(){
        Random rnd = new Random();
      
        int move = rnd.nextInt(6);
        move++;
        position += move;
        
        if(position > 31){
            position -= 31;
            
            if(health < 20){
                health += 5;
           
                if(health > 20){
                    health = 20;
           }
           
        }
        else{
            JOptionPane.showMessageDialog(null, "You are too good to receive health!");
        }
            
            money += 1000;
            JOptionPane.showMessageDialog(null, "I'm surprised you survived this long! Take some health and $1000!");
            
        }
        
        return move;
        
    }
    
    public void Player1Moved(int move){
        JOptionPane.showMessageDialog(null,"You moved "+ move +" spaces!");
    }
    
    public void isShelter(){
        JOptionPane.showMessageDialog(null, "You are safe... for now....");
    }
    
    public int isTides(){
        Random rnd = new Random();
        
        int chance = rnd.nextInt(6);
        chance++;
        
        return chance;
    }
    
    public int isEnemyMine(){
        Mines m = new Mines();
        int damage = m.getDamage();
        
        health -= damage;
        return health;
    }
    
    public int isGo(){
        money += 1000;
        return money;
    }
    
    public int isHealth(){
        if(health < 20){
           health += 5;
           
           if(health > 20){
               health = 20;
           }
           
        }
        else{
            JOptionPane.showMessageDialog(null, "You are too good to receive health!");
        }
        return health; 
    }
    
    public int isSmallHealth(){
        if(health < 20){
           health += 2;
           
           if(health > 20){
               health = 20;
           }
           
        }
        else{
            JOptionPane.showMessageDialog(null, "You are too good to receive health!");
        }
        return health;
    }
    
    public int isMoneyGain(){
        money += 400;
        return money;
    }
    
    public int isMoneyLost(){
        
        if(money == 0){
            JOptionPane.showMessageDialog(null, "Damn Player 1! You are too poor to take money from!");
        }
        else if(money > 0){
            money -= 100;
        }
        
        if(money < 0){
            money = 0;
        }
        
        return money;
    }
    
    public boolean isHitDay(int day){
        if(day == hitDay){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int isEnemyMissile(){
        Missiles mi = new Missiles();
        int damage = mi.getDamage();
        
        health -= damage;
        return health;
    }
    
    public void isDead(){
        if(health <= 0){
            JOptionPane.showMessageDialog(null, "Player 1 can no longer continue due to Obamacare! Player 2 wins!");
            System.exit(0);
        }
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
    
    public int gethitDay(){
        return hitDay;
    }
    
    public boolean getLaunched(){
        return launched;
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
    
    public void sethitDay(int hitDay){
        this.hitDay = hitDay;
    }
    
    public void setLaunched(boolean launched){
        this.launched = launched;
    }
    
    
    
    
    
}
