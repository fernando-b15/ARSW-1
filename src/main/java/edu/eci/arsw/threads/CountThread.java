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
public class CountThread extends Thread {
	private int inicial;
	private int fin;
    public CountThread(int inicial,int fin) {
    	this.inicial=inicial;
    	this.fin=fin;
    	
    }
    @Override
    public void run() {
    	for(int i=inicial;i<fin;i++) {
    		System.out.println(i);
    		
    	}
    	
    }
	
}
