/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author AsFx
 */
public class Truck {
    public int cadence;
    public int gear;
    public int speed;
    public Truck (int startcadence, int startspeed, int startgear){
        gear = startgear;
        cadence = startcadence;
        speed = startspeed;
    }
    public void setcadence(int newvalue){
        cadence = newvalue;
    }
    public void setgear(int newvalue){
        gear = newvalue;
    }
    public void applybrake(int decrement){
        speed = decrement;
    }
    public void speedup(int increment){
        speed = increment;
    }
}
