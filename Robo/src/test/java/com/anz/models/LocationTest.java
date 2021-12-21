package com.anz.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class LocationTest {

    Location currentLocation = new Location(1,1,null);

    @Test
    public void testNext(){

        currentLocation.setDirection(Direction.EAST);
        Assertions.assertEquals(currentLocation.next().getxPos(),2);
        Assertions.assertEquals(currentLocation.next().getyPos(),1);

        currentLocation.setDirection(Direction.NORTH);
        Assertions.assertEquals(currentLocation.next().getxPos(),1);
        Assertions.assertEquals(currentLocation.next().getyPos(),2);

        currentLocation.setDirection(Direction.WEST);
        Assertions.assertEquals(currentLocation.next().getxPos(),0);
        Assertions.assertEquals(currentLocation.next().getyPos(),1);

        currentLocation.setDirection(Direction.SOUTH);
        Assertions.assertEquals(currentLocation.next().getxPos(),1);
        Assertions.assertEquals(currentLocation.next().getyPos(),0);

    }
}
