/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DD4L;

import DD4L.Temp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jer1140
 */
public class DieTest {
    
    /**
     * Test of getVisibleFace method, of class Die.
     */
    @Test
    public void testGetVisibleFace() {
        Die myDie = new Die(12,0);
        assertEquals(7, myDie.getVisibleFace(), 0.0);
        }
}
