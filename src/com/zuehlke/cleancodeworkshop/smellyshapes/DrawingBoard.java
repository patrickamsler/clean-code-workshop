package com.zuehlke.cleancodeworkshop.smellyshapes;

public class DrawingBoard {

    private final ShapeGroup shapeGroup = new ShapeGroup();
    private Color backgroundColor;

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void drawOnScreen() {
        // ...
    }

    public void load(String file) {
        // ...
    }

    public static void main(String[] args) {
        DrawingBoard drawingBoard = new DrawingBoard();
        drawingBoard.setBackgroundColor(new Color("Green"));
        drawingBoard.shapeGroup.add(new Square(-10, -10, 20));
        drawingBoard.load(args[0]);
        drawingBoard.drawOnScreen();
    }

    public ShapeGroup getShapeGroup() {
        return shapeGroup;
    }


}
