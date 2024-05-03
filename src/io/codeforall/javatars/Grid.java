package io.codeforall.javatars;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {
    private int cols;
    private int rows;
    private int cellSize;
    public final int PADDING = 10;
    private Cell[][] cells;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cellSize = 20;
        cells = new Cell[rows][cols];
    }


    public void init() {
        Rectangle gameArea = new Rectangle(PADDING, PADDING, cols*cellSize, rows*cellSize);
        gameArea.draw();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell(j, i, PADDING, cellSize);
                cells[i][j].draw();
            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCellSize() {
        return cellSize;
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }
}
