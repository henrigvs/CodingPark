package be.gevenoispolleur.leveleditor.items.obstacle;

import be.gevenoispolleur.leveleditor.items.Item;
import be.gevenoispolleur.leveleditor.items.Position;

public class Obstacle extends Item {

    private final ObstacleType obstacleType;

    public Obstacle(Position position, ObstacleType obstacleType) {
        super(position);
        this.obstacleType = obstacleType;
    }

    public ObstacleType getObstacleType() {
        return obstacleType;
    }
}
