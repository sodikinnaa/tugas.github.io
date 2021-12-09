/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import inheritences.mahasiswa;

/**
 *
 * @author 4 GSG
 */
public class coba {
    public static void main(String[] args){
        mahasiswa sodikin = new mahasiswa();
        
        sodikin.setNama("Gajah mada");
        sodikin.setNpm("20312075");
        sodikin.setProdi("Infotmatika");
        System.out.println("Nama Mahasiswa "+sodikin.getNama());
        System.out.println("NPM Mahasiswa : "+sodikin.getNpm());
        System.out.println("Prodi Mahasiswa : "+sodikin.getProdi());
    }
    
}
