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
public class MountainTruck extends Truck {
    public int seatheight;
    public MountainTruck(int startheight, int startcadence, 
    int startspeed,int startgear){
        super(startcadence, startspeed, startgear);
        seatheight = startheight;
    }
    public void setheight(int newvalue){
        seatheight = newvalue;
    }
    public static void main (String [] args){
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear = "+MB.gear);
        System.out.println("spead = "+MB.speed );
        MB.setgear(2);
        MB.speedup(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("spead = "+MB.speed );
        MB.speedup(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("spead = "+MB.speed );
        
    }
}
