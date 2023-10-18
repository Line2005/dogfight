package jpu2016.dogfight.model;

public class Mobile {
    private int speed;
    private Direction direction;
    private Position position;
    private Dimension dimension;
    private String image;

    public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        this.direction = direction;
        this.position = position;
        this.dimension = dimension;
        this.image = image;
        this.speed = speed;
    }

}
