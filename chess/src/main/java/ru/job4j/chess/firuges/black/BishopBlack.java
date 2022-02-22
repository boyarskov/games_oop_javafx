package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    //На данном этапе метод еще не реализован и Ваша задача реализовать его таким образом,
    // чтобы он вернул массив из четырех клеток: D2, E3, F4, G5.
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new ImpossibleMoveException(
            String.format("Could not move by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(position().getX() - dest.getX());
        Cell[] steps = new Cell[size];
        int deltaX = position().getX() < dest.getX() ? 1 : -1;
        int deltaY = position().getY() < dest.getY() ? 1 : -1;
        int x = position.getX() + deltaX;
        int y = position.getY() + deltaY;
        for (int index = 0; index < size; index++) {
            x = (index + 1) * deltaX + position().getX();
            y = (index + 1) * deltaY + position().getY();
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }

    public boolean isDiagonal(Cell source, Cell dest) {
        /* TODO check Diagonal */
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
