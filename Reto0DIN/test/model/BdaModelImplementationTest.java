/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.ConnectException;
import exception.ReadException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class BdaModelImplementationTest {
    
    BdaModelImplementation instance = new BdaModelImplementation();
    
    public BdaModelImplementationTest() {
    }

    @Test
    public void testGetGreeting() throws ReadException, ConnectException {
        String greeting = "Hola Mundo";
        String testGreeting = instance.getGreeting();
        assertEquals("Error al cargar Saludo desde Fichero", greeting, testGreeting);
    }
    
}
