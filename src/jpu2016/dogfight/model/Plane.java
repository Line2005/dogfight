package jpu2016.dogfight.model;

public class Plane {
    private final int SPEED = 2;
    private final int WIDTH = 100;
    private final int HEIGHT = 30;
    private int player = 10;
    private Direction direction;
    private Position position;
    private String image;
    public Plane(int player, Direction direction, Position position, String image) {
        this.player = player;
        this.direction = direction;
        this.position = position;
        this.image = image;
    }
}
