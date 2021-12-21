package com.anz.models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DirectionTest {

    private Direction direction;

    @Test
    public void testLeft(){

        direction = Direction.NORTH;
        Assertions.assertEquals(direction.left(),Direction.WEST);

        direction = Direction.WEST;
        Assertions.assertEquals(direction.left(),Direction.SOUTH);

        direction = Direction.SOUTH;
        Assertions.assertEquals(direction.left(),Direction.EAST);

        direction = Direction.EAST;
        Assertions.assertEquals(direction.left(),Direction.NORTH);
    }

    @Test
    public void testRight(){
        direction = Direction.NORTH;
        Assertions.assertEquals(direction.right(),Direction.EAST);

        direction = Direction.EAST;
        Assertions.assertEquals(direction.right(),Direction.SOUTH);

        direction = Direction.SOUTH;
        Assertions.assertEquals(direction.right(),Direction.WEST);

        direction = Direction.WEST;
        Assertions.assertEquals(direction.right(),Direction.NORTH);
    }
}
