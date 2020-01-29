package edu.eci.arsw.primefinder;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{
	public static boolean estado=false;
	public static ArrayList<PrimeFinderThread> hilos=new  ArrayList<PrimeFinderThread>();
	public static void main(String[] args) {
		Timer timer = new Timer();
		int j=0;
		for(int i=0;i<3;i++) {
			PrimeFinderThread ptf=new PrimeFinderThread(0,j+10000000);
			hilos.add(ptf);
			ptf.start();
			j+=+10000000;
		}

	
		
		
		TimerTask task = new TimerTask() {
		      

		        @Override
		        public void run()
		        {
		        	int cont=0;
		        	for(PrimeFinderThread h:hilos) {
		        		h.suspend();
		        		cont+=(h.getPrimes()).size();
		        		
		        
		        	}
		        	estado=true;

		    		
		        }
		        };
		timer.schedule(task,5000);
		while(true) {
		
			synchronized(hilos) {
				if(true) {
						
						Scanner teclado = new Scanner(System.in);
						String prueba = teclado.nextLine();
						(hilos.get(0)).resume();
						(hilos.get(1)).resume();
						(hilos.get(2)).resume();
						break;
					
					}
				}
			}
	}




	

	
	
}
