/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo4;

/**
 *
 * @author Ecliptica
 */
public class Handphone {
    private String noSeri, model, versiOS;
    private boolean on = false;
    private int volume = 0;
    
    public Handphone() {
    
    }

    public Handphone(String noSeri, String model, String versiOS) {
        this.noSeri = noSeri;
        this.model = model;
        this.versiOS = versiOS;
    } 
    
    public String getNoSeri() {
        return noSeri;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getVersiOs() {
        return versiOS;
    }
    
    public void PowerOn() {
        on = true;
    }
    
    public void PowerOff() {
        on = false;
    }
    
    public void tambahVolume() {
        if (on && volume < 100) {
            volume += 5;
        }
    }
    
    public void kurangVolume() {
        if (on && volume > 0) {
            volume -= 5;
        }
    }
    
    private int lostVolume = 0;    
    public void mute() {
        if (on) {
            if (volume > 0) {
                lostVolume = volume;
                volume = 0;
            } else {
                volume = lostVolume;
            }
        }
    }
    
    public boolean hpOn() {
        return on;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void printStatusHP() {
        if (on) {
            System.out.println("Status HP   : Menyala");
        } else {
            System.out.println("Status HP   : Mati");
        }
    }
} 