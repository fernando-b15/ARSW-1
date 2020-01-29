/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 */
public class PiCalcTest {

    public PiCalcTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void piGenTest() throws Exception {

        byte[] expected = new byte[]{
            0x2, 0x4, 0x3, 0xF, 0x6, 0xA, 0x8, 0x8,
            0x8, 0x5, 0xA, 0x3, 0x0, 0x8, 0xD, 0x3,
            0x1, 0x3, 0x1, 0x9, 0x8, 0xA, 0x2, 0xE,
            0x0, 0x3, 0x7, 0x0, 0x7, 0x3, 0x4, 0x4,
            0xA, 0x4, 0x0, 0x9, 0x3, 0x8, 0x2, 0x2,
            0x2, 0x9, 0x9, 0xF, 0x3, 0x1, 0xD, 0x0,
            0x0, 0x8, 0x2, 0xE, 0xF, 0xA, 0x9, 0x8,
            0xE, 0xC, 0x4, 0xE, 0x6, 0xC, 0x8, 0x9,
            0x4, 0x5, 0x2, 0x8, 0x2, 0x1, 0xE, 0x6,
            0x3, 0x8, 0xD, 0x0, 0x1, 0x3, 0x7, 0x7,};

        for (int start = 0; start < expected.length; start++) {
            for (int count = 0; count < expected.length - start; count++) {
            	for(int n=1; n<3;n++) {
	                byte[] digits = PiDigits.getDigits(start,count,n);
	                assertEquals(count, digits.length);
	
	                for (int i = 0; i < digits.length; i++) {
	                    assertEquals(expected[start + i], digits[i]);
	                }
            	}
            }
        }
    }
    @Test
    public void piDigits1() throws Exception {
    	byte[] caso1=PiDigits.getDigits(0,99);
    	byte[] prueba1=PiDigits.getDigits(0,99,1);
    	assertArrayEquals(caso1,prueba1);
    	byte[] caso2=PiDigits.getDigits(100,300);
    	byte[] prueba2=PiDigits.getDigits(100,300,1);
    	assertArrayEquals(caso2,prueba2);
    	byte[] caso3=PiDigits.getDigits(500,500);
    	byte[] prueba3=PiDigits.getDigits(500,500,1);
    	assertArrayEquals(caso3,prueba3);
    	
    }
    
    @Test
    public void piDigits2() throws Exception {
    	byte[] caso1=PiDigits.getDigits(0,100);
    	byte[] prueba1=PiDigits.getDigits(0,100,2);
    	assertArrayEquals(caso1,prueba1);
    	byte[] caso2=PiDigits.getDigits(100,400);
    	byte[] prueba2=PiDigits.getDigits(100,400,2);
    	assertArrayEquals(caso2,prueba2);
    	byte[] caso3=PiDigits.getDigits(500,400);
    	byte[] prueba3=PiDigits.getDigits(500,400,2);
    	assertArrayEquals(caso3,prueba3);
    	
    }
    
    @Test
    public void piDigits3() throws Exception {
    	byte[] caso1=PiDigits.getDigits(1,100);
    	byte[] prueba1=PiDigits.getDigits(1,100,3);
    	assertArrayEquals(caso1,prueba1);
    	byte[] caso2=PiDigits.getDigits(500,300);
    	byte[] prueba2=PiDigits.getDigits(500,300,3);
    	assertArrayEquals(caso2,prueba2);
    	byte[] caso3=PiDigits.getDigits(150,150);
    	byte[] prueba3=PiDigits.getDigits(150,150,3);
    	assertArrayEquals(caso3,prueba3);
    	
    }

}
