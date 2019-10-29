/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author ARVINA
 */
public class Informasi extends NamaGuru{
    String Namaguru;

    public Informasi(String Namaguru,String mapel, String kelas, String jeniskelamin) {
        super(mapel, kelas, jeniskelamin);
        this.Namaguru = Namaguru;
    }
    public void info(){
        System.out.println("Nama Guru : "+this.Namaguru);
        super.info();
    }
    
}