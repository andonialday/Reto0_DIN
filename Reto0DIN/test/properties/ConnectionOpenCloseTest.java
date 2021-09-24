/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import exception.ConnectException;
import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ConnectionOpenCloseTest {
    
    ConnectionOpenClose instance = new ConnectionOpenClose();
    
    public ConnectionOpenCloseTest() {
    }

    @Test
    public void testOpenConnection() throws ConnectException {
      Connection con= null;
      con = instance.openConnection();
      assertNotNull("Error Opening connection to DataBase", con);
    }
    
}
