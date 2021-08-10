/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukab
 */
public class Fitbyte {
    private int age;
    private int rhr;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.rhr=restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return ((((206.3-(0.711*this.age))-this.rhr)*(percentageOfMaximum))+this.rhr);
    }
}
