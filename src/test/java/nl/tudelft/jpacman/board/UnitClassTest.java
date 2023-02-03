package nl.tudelft.jpacman.board;

import nl.tudelft.jpacman.sprite.SpriteStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

public class UnitClassTest {
    private Square square;
    private Unit unit;

    @BeforeEach
    public void setUp() {
        square = new BasicSquare();
        unit = new BasicUnit();
        unit.occupy(square);
    }

    @Test
    void hasSquareTest(){
        assertThat(unit.hasSquare()).isTrue();
    }

}


/*

    private Square square;
    private Unit unit;

    @BeforeEach
    public void setUp() {
        square = new BasicSquare();
        unit = new BasicUnit();
        unit.setDirection(Direction.SOUTH);
        unit.occupy(square);
    }

    @Test
    void getDirectionTest() {
        assertThat(unit.getDirection()).isEqualTo(Direction.SOUTH);
    }

    @Test
    void hasSquareTest(){
        assertThat(unit.hasSquare()).isTrue();
    }



 */
