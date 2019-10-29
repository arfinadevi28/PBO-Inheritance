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
public class NamaGuru {
    String kelas;
    String mapel;
    String jeniskelamin;
    
    //konstruktor
    public NamaGuru ( String mapel, String kelas, String jeniskelamin){
      
        this.mapel = mapel;
        this.kelas = kelas;
        this.jeniskelamin = jeniskelamin;
    }
    public void info (){
        System.out.println("mapel:"+this.mapel);
        System.out.println("kelas:"+this.kelas);
        System.out.println("jeniskelamin:"+this.jeniskelamin);
    }
}
