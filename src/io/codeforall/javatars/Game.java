package io.codeforall.javatars;

import io.codeforall.javatars.Cursor.Cursor;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;

public class Game {

    private Grid grid;
    private int cols;
    private int rows;
    private Cursor cursor;

    private MyKeyboard keyboard;

    public Game(int rows, int cols) {
        grid = new Grid(rows, cols);
        Canvas.limitCanvasHeight(grid.getRows()* grid.getCellSize());
        Canvas.limitCanvasWidth(grid.getRows()* grid.getCellSize());
        this.rows = rows;
        this.cols = cols;
        cursor = new Cursor(grid.PADDING, grid.PADDING, grid.getCellSize(), Color.BLUE, grid);
        keyboard = new MyKeyboard(grid, cursor);
        keyboard.addKeyboard();
    }

    public void init() {
        grid.init();
    }
}
