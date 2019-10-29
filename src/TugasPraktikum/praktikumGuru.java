/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author ARVINA
 */
public class praktikumGuru {
    public static void main(String[] args){
        Informasi NamaGuru1 = new Informasi("Bu Seno","Bahasa Inggris","XRPL2","Perempuan1");
        Informasi NamaGuru2 = new Informasi("Pak Arifin","Produktif","RPL2","LakiLaki");
        Informasi NamaGuru3 = new Informasi("Pak Tepeng","Bahasa Indonesia","RPL2","LakiLaki");
        Informasi NamaGuru4 = new Informasi("Pak Y","Seni Budaya","RPL2","LakiLaki");
        
        System.out.println("\n Silahkan pilih yang ingin anda ketahui informasinya");
        System.out.println("1. Bu Seno\n2. Pak Arifin\n3.Pak Tepeng\n4.Pak Y");
        Scanner dev = new Scanner(System.in);
        int jawab = dev.nextInt();
        switch (jawab){
            case 1:
              System.out.println("Informasi NamaGuru");
              NamaGuru1.info();
              break;
            case 2:
               System.out.println("Informasi NamaGuru");
               NamaGuru2.info();
               break;
            case 3:
               System.out.println("Informasi NamaGuru");
               NamaGuru3.info();
               break;
            case 4:
                System.out.println("Informasi NamaGuru");
                NamaGuru4.info();
        }
    } 
}
