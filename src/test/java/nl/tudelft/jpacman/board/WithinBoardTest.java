package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class WithinBoardTest {

    private static final int MAX_WIDTH = 5;
    private static final int MAX_HEIGHT = 4;

    private final Square[][] grid = {
        { mock(Square.class), mock(Square.class), mock(Square.class) , mock(Square.class), },
        { mock(Square.class), mock(Square.class), mock(Square.class) , mock(Square.class), },
        { mock(Square.class), mock(Square.class), mock(Square.class) , mock(Square.class), },
        { mock(Square.class), mock(Square.class), mock(Square.class) , mock(Square.class), },
        { mock(Square.class), mock(Square.class), mock(Square.class) , mock(Square.class), }
    };
    private final Board board = new Board(grid);

    @Test
    void withinBoardTest(){
        for(int x = 0; x < MAX_WIDTH; x++) {
            for (int y = 0; y < MAX_HEIGHT; y++) {
                assertThat(board.withinBorders(x, y)).isTrue();
            }
        }
    }
}
