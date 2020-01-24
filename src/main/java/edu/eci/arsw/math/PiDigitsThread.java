package edu.eci.arsw.math;

public class PiDigitsThread extends Thread{
	private int inicial;
	private int fin;
	private int coor1;
	private int coor2;
	public PiDigitsThread (int inicial,int fin,int coor1,int coor2) {
		this.inicial=inicial;
		this.fin=fin;
		this.coor1=coor1;
		this.coor2=coor2;
		
	}
	@Override
	public void run(){
		
		byte[] subDigits=PiDigits.getDigits(inicial,fin);
		
		int index=0;
		for(int i=coor1;i<coor2;i++) {
			PiDigits.Digits[i]=subDigits[index];
			index++;
		}
		
	}
}
