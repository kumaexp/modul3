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
class sekolah {
    protected String namasiswa;
    protected int umur;
    public sekolah(String namasiswa, int umur){
    this.namasiswa = namasiswa;
    this.umur = umur;
}
    
public void info(){
    System.out.println("Nama Siswa: " + this.namasiswa);
    System.out.println("Umur Siswa: " + this.umur);
}
}
