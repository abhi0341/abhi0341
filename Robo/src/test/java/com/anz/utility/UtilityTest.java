package com.anz.utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilityTest {

    Utilty util = new Utilty();

    @Test
    public void testGetCommand(){
        //valid
        Assertions.assertNotNull(util.getCommand("PLACE"));
        Assertions.assertNotNull(util.getCommand("MOVE"));
        Assertions.assertNotNull(util.getCommand("LEFT"));
        Assertions.assertNotNull(util.getCommand("REPORT"));

        //invalid
        Assertions.assertNull(util.isValidStart("/n"));
        Assertions.assertNull(util.isValidStart("TEST"));
    }

    @Test
    public void testValidStart(){
        //valid
        Assertions.assertNotNull(util.isValidStart("PLACE 1,2,EAST"));

        //invalid
        Assertions.assertNull(util.isValidStart("MOVE"));
        Assertions.assertNull(util.isValidStart("LEFT"));
        Assertions.assertNull(util.isValidStart("REPORT"));
        Assertions.assertNull(util.isValidStart("/n"));

        //validate place
        Assertions.assertNull(util.isValidStart("PLACE 1"));
        Assertions.assertNull(util.isValidStart("PLACE"));
        Assertions.assertNull(util.isValidStart("PLACE 1,2"));
        Assertions.assertNull(util.isValidStart("PLACE 1,2,XYZ"));
    }
}
