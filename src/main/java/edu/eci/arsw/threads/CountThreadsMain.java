/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author fernando
 */
public class CountThreadsMain {
    private final static Thread hilo1=new CountThread(1,99);
    private final static Thread hilo2=new CountThread(100,199);
    private final static Thread hilo3=new CountThread(200,299);
    public static void main(String a[]){
        //hilo1.start();
        //hilo2.start();
        //hilo3.start();
        
        hilo1.run();
        hilo2.run();
        hilo3.run();
    }
    
}
