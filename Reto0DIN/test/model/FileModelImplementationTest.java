/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author 2dam
 */
public class FileModelImplementationTest {
    
    FileModelImplementation instance = new FileModelImplementation();
    
    public FileModelImplementationTest() {
    }
    
    @Test
    public void testGetGreeting() {
        String greeting = "Hola Mundo";
        String testGreeting = instance.getGreeting();
        assertEquals("Error al cargar Saludo desde Fichero", greeting, testGreeting);
    }
        
}
