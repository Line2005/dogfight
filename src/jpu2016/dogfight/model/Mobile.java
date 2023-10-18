package jpu2016.dogfight.model;

public class Mobile {
    private int speed;
    private Direction direction;
    private Position position;
    private Dimension dimension;
    private String image;
    private int width;
    private int height;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        this.direction = direction;
        this.position = position;
        this.dimension = dimension;
        this.image = image;
        this.speed = speed;
    }
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {

    }
    public Position getPosition() {
        return position;
    }
    public Dimension getDimension() {
        return dimension;
    }
    public int getSpeed() {
        return speed;
    }
    public int getWidth() {
        return width;
    }
    public void move() {

    }
    public Boolean isPlayer(int player) {
        return player;
    }

}
