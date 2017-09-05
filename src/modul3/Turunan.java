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
class Turunan extends Induk {
    public void test(String s){
        System.out.println("Method di dalam kelas turunan");
        System.out.println("s: \""+s+"\"");
    }
    public void d(){
        System.out.println("overriding method");
    }
}
