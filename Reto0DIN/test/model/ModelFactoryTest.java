/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelFactoryTest {
    
    private ModelFactory instance = new ModelFactory();
    
    public ModelFactoryTest() {
    }

    @Test
    public void testGetBDAModel() {
        Model model = instance.getModel();
        assertNotNull("Error generating Model", model);
        assertTrue("Error generating Model", model instanceof DDBBModelImplementation);
    }
    
    @Test
    public void testGetFichModel() {
        Model model = instance.getModel();
        assertNotNull("Error generating Model", model);
        assertTrue("Error generating Model", model instanceof FileModelImplementation);
    }
    
}
