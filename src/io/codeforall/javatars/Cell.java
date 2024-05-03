package io.codeforall.javatars;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    private int row;
    private int col;
    private boolean colored;
    private Rectangle rectangle;

    public Cell(int row, int col, int padding, int cellSize) {
        this.row = row;
        this.col = col;
        colored = false;
        rectangle = new Rectangle(padding + this.col * cellSize, padding + this.row * cellSize, cellSize, cellSize);
    }

    public void draw() {
        rectangle.draw();;
    }

    public void fill() {
        rectangle.fill();
    }

    public void delete() {
        rectangle.delete();
    }

    public void setColor(Color color) {
        rectangle.setColor(color);
    }

    public boolean getColored() {
        return colored;
    }

    public void setColored(boolean state) {
        colored = state;
    }
}
