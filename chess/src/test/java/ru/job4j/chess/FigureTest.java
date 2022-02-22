package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FigureTest {

    @Test
    public void whenPositionCorrect() {
       BishopBlack bishopBlack = new BishopBlack(Cell.F7);
       assertThat(bishopBlack.position(), is(Cell.F7));
    }

    @Test
    public void whenCopyCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A3);
        assertThat(bishopBlack.copy(Cell.D2).position(), is(Cell.D2));
    }

    @Test
    public void whenWayCorrect() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(cells));
    }
}
