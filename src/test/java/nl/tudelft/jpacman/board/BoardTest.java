package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BoardTest {

    @Test
    void testValid() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { mock(BasicSquare.class) }
        };
        Board board = new Board(grid);
        assertThat(board.invariant()).isEqualTo(true);
    }

    @Test
    void testSquareAtNull() {
        Square[][] grid = {
            { mock(BasicSquare.class) },
            { null }
        };
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isEqualTo(grid[0][0]);
    }
}
