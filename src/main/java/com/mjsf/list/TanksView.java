/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjsf.list;


/**
 *
 * @author grisha
 */
public class TanksView {

    private String name;
    private int cannon;
    private int weight;
    private int maxSpeed;

    
    public TanksView (String name, int cannon, int weight, int maxSpeed) {
        this.name = name;
        this.cannon = cannon;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }
    
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCannon() {
        return cannon;
    }

    public void setCannon(int cannon) {
        this.cannon = cannon;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    
            
}
