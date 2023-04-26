/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnes;

/**
 *
 * @author Mohamed
 */
import java.util.Scanner;

public class NewClass {

    public int getSwimming() {
        return swimming;
    }

    public void setSwimming(int swimming) {
        this.swimming = swimming;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public int getKick_boxing() {
        return kick_boxing;
    }

    public void setKick_boxing(int kick_boxing) {
        this.kick_boxing = kick_boxing;
    }

    public int getStrength_training() {
        return strength_training;
    }

    public void setStrength_training(int strength_training) {
        this.strength_training = strength_training;
    }

    int CALORIES_BURNT;
    double HEART_RATE;

    int swimming ;
    int running;
    int kick_boxing;
    int strength_training;

    public NewClass() {
        this.CALORIES_BURNT = 0;
        this.HEART_RATE = 80;
        this.running = 0;
        this.kick_boxing = 0;
        this.strength_training = 0;
        this.swimming = 0;
    }

    public int getCALORIES_BURNT() {
        return CALORIES_BURNT;
    }

    public void setCALORIES_BURNT(int CALORIES_BURNT) {
        this.CALORIES_BURNT = CALORIES_BURNT;
    }

    public double getHEART_RATE() {
        return HEART_RATE;
    }

    public void setHEART_RATE(double HEART_RATE) {
        this.HEART_RATE = HEART_RATE;
    }

    public int caloryburn(int c, int t) {
        int cc;
        cc = this.CALORIES_BURNT + (c * t);
        setCALORIES_BURNT(cc);
        return cc;
    }

    public double heratratecalc(double h, int t) {
        double hh;
        hh = this.HEART_RATE + this.HEART_RATE * t * h;
        setHEART_RATE(hh);
        return hh;

    }

}
