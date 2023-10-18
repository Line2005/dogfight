package jpu2016.dogfight.model;

public class Dimension {
    private int width;
    private int height;
    private Dimension dimension;
    public Dimension(int width, int height, Dimension dimension) {
        this.width = width;
        this.height = height;
        this.dimension = dimension;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {

    }
    public int getHeight() {
        return  height;
    }
    public void setHeight(int height) {

    }

}
