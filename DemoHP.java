/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pbo4;

/**
 *
 * @author Ecliptica
 */
public class DemoHP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handphone hp1 = new Handphone("100101", "Model PC F5", "OS 12");
        
        hp1.PowerOn();
        
        hp1.tambahVolume();
        hp1.tambahVolume();
        hp1.tambahVolume();
        
        hp1.kurangVolume();        
        hp1.mute();
        hp1.mute();
        
        hp1.PowerOff();
        
        hp1.printStatusHP();
        System.out.println("No. Seri HP : "+hp1.getNoSeri());
        System.out.println("Model HP    : "+hp1.getModel());
        System.out.println("OS          : "+hp1.getVersiOs());
        System.out.println("Volume      : "+hp1.getVolume());
    }    
}

