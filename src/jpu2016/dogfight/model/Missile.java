package jpu2016.dogfight.model;

public class Missile extends Mobile {
    private final int SPEED = 4;
    private final int WIDTH = 30;
    private final int HEIGHT = 10;
    private final int MAX_DISTANCE_TRAVELLED = 1400;
    private final String IMAGE = "missile";
    private int distanceTravelled = 0;

    public Missile(Direction direction, Dimension dimension) {
        super(direction, dimension);


    }

}
