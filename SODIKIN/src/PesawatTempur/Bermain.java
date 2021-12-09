/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PesawatTempur;

/**
 *
 * @author 4 GSG
 */
public class Bermain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pesawat boeing = new pesawat();
        PesawatTempur f16 = new PesawatTempur();
        
        boeing.terbang();
        f16.terbang();
        
        boeing.mendarat();
        f16.mendarat();
        
        f16.manuver();
    }
    
}
