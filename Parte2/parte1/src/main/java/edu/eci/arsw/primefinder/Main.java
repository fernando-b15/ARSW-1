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
	public static int cont=0;
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
		try {
			Thread.sleep(5000);
			pausar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
	
	}
	public static void pausar() {
		for(PrimeFinderThread h:hilos) {
			h.suspend();
		}
		synchronized(hilos) {
			imprimir();
			System.out.println("he encontrado"+" "+calcular()+" "+"primos");
			reset();
			System.out.println("presione enter para continuar");
			Scanner scanner = new Scanner(System.in);
			scanner.nextLine();
			despertar();
			terminar();
			imprimir();
			System.out.println("he encontrado"+" "+calcular()+" "+"primos");

			
		}
	}
	public static void terminar() {
		for(PrimeFinderThread h:hilos) {
			try {
				h.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void despertar() {
		for(PrimeFinderThread h:hilos) {
			h.resume();
			try {
				h.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static int calcular() {
		
		for(PrimeFinderThread h:hilos) {
			cont+=(h.getPrimes()).size();
		}
		return cont;
		
	}
	public static void imprimir() {
		for(PrimeFinderThread h:hilos) {
			for(int num:h.getPrimes()) {
				System.out.println(num);
			}
		}
		
	}
	public static void reset() {
		for(PrimeFinderThread h:hilos) {
			h.reset();
		}
	}
	


	

	
	
}
