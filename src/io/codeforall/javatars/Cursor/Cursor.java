package io.codeforall.javatars.Cursor;

import io.codeforall.javatars.Cell;
import io.codeforall.javatars.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;

public class Cursor {

    private Rectangle cursor;
    private Grid grid;
    private int row;
    private int col;
    private Keyboard myKeyboard;

    public Cursor(int row, int col, int cellSize, Color color, Grid grid) {
        this.row = row;
        this.col = col;
        this.grid = grid;
        cursor = new Rectangle(row, col, cellSize, cellSize);
        setCursor(color);
        cursor.fill();
    }


    public void setCursor(Color color) {
        cursor.setColor(color);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Grid getGrid() {
        return grid;
    }


    public int currentRow() {
        return (cursor.getY() - 10) / grid.getCellSize();
    }

    public void moveUp() {
        if (cursor.getY() > grid.PADDING) {
            cursor.translate(0, -grid.getCellSize());
        }
    }


    public void moveDown() {
        if (cursor.getY() < ((grid.getRows() - 1) * grid.getCellSize())) {
            cursor.translate(0, grid.getCellSize());
        }
    }


    public void moveLeft() {
        if (cursor.getX() > grid.PADDING) {
            cursor.translate(-grid.getCellSize(), 0);
        }
    }


    public void moveRight() {
        if (cursor.getX() < ((grid.getCols() - 1) * grid.getCellSize())) {
            cursor.translate(grid.getCellSize(), 0);
        }
    }

    public void paint() {
        Cell current = grid.getCell((cursor.getX() - 10) / grid.getCellSize(), (cursor.getY() - 10) / grid.getCellSize());
        current.delete();
        cursor.delete();
        if (current.getColored()) {
            current.draw();
            cursor.fill();
            current.setColored(false);
            return;
        }
        current.fill();
        cursor.fill();
        current.setColored(true);
    }

}
