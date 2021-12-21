package com.anz.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SquareTableTest {

    @Mock
    Location location;

    SquareTable testTable = new SquareTable(5);
    @Test
    public void testValidLocation(){
        when(location.getxPos()).thenReturn(0);
        when(location.getyPos()).thenReturn(0);
        Assertions.assertTrue(testTable.isValidLocation(location));

        when(location.getxPos()).thenReturn(10);
        Assertions.assertFalse(testTable.isValidLocation(location));

        when(location.getxPos()).thenReturn(1);
        Assertions.assertTrue(testTable.isValidLocation(location));

        when(location.getxPos()).thenReturn(-1);
        Assertions.assertFalse(testTable.isValidLocation(location));
    }
}
