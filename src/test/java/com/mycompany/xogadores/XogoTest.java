/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.xogadores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import proxecto.proxectoxogo.Xogo;

/**
 *
 * @author Usuario
 */
public class XogoTest {
    
    public XogoTest() {
    }

    @Test
    public void testGañador() {
        System.out.println("EMPATE");
        String xogada1 = "PEDRA";
        String xogada2 = "PEDRA";
        Xogo instance = new Xogo();
        String expResult = "EMPATE!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
    @Test
    public void testGañador2() {
        System.out.println("GAÑADOR 2");
        String xogada1 = "PEDRA";
        String xogada2 = "PAPEL";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 2!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
    @Test
    public void testGañador3() {
        System.out.println("GAÑA XOGADOR 2");
        String xogada1 = "PEDRA";
        String xogada2 = "PAPEL";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 2!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
    @Test
    public void testGañador4() {
        System.out.println("GAÑA XOGADOR 1");
        String xogada1 = "TESOIRAS";
        String xogada2 = "PAPEL";
        Xogo instance = new Xogo();
        String expResult = "Gaña o xogador 1!";
        String result = instance.gañador(xogada1, xogada2);
        assertEquals(expResult, result);
    }
}
