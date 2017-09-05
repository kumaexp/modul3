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
class ssiswa extends sekolah {
    private int absen;
    private String kelas;
    
    public ssiswa(int absen, String kelas, String namasiswa, int umur){
        super(namasiswa, umur);
        this.absen = absen;
        this.kelas = kelas;
    }
    public void info(){
        System.out.println("No. Absen : " + this.absen);
        System.out.println("kelas : " + this.kelas);
        super.info();
    }
}
