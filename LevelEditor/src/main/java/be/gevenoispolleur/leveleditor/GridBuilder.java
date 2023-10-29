package be.gevenoispolleur.leveleditor;

import be.gevenoispolleur.leveleditor.items.Cody;
import be.gevenoispolleur.leveleditor.items.Item;
import be.gevenoispolleur.leveleditor.items.Position;
import be.gevenoispolleur.leveleditor.items.Skeleton;
import be.gevenoispolleur.leveleditor.items.Treasury;
import be.gevenoispolleur.leveleditor.items.tunnel.Tunnel;
import be.gevenoispolleur.leveleditor.items.obstacle.Obstacle;
import be.gevenoispolleur.leveleditor.items.surface_element.SurfaceElement;
import be.gevenoispolleur.leveleditor.items.surface_element.Theme;

public class GridBuilder implements Buildable {

    private Grid grid;

    @Override
    public Buildable setThemeAndDimensions(Theme theme, int width, int height) {
        grid = new Grid(theme, width, height);
        return this;
    }

    @Override
    public Buildable addCody(Cody cody) throws Exception {
        doubleCheck(cody.getPosition());
        this.grid.placeItem(cody);
        return this;
    }

    @Override
    public Buildable addSkeleton(Skeleton skeleton) throws Exception {
        doubleCheck(skeleton.getPosition());
        this.grid.placeItem(skeleton);
        return this;
    }

    @Override
    public Buildable addTreasury(Treasury treasury) throws Exception {
        doubleCheck(treasury.getPosition());
        this.grid.placeItem(treasury);
        return this;
    }

    @Override
    public Buildable addObstacle(Obstacle obstacle) throws Exception {
        doubleCheck(obstacle.getPosition());
        this.grid.placeItem(obstacle);
        return this;
    }

    @Override
    public Buildable addTunnel(Tunnel tunnel) throws Exception {
        doubleCheck(tunnel.getGateA());
        doubleCheck(tunnel.getGateB());
        this.grid.placeItem(tunnel);
        return this;
    }

    @Override
    public Buildable addSurfaceElement(SurfaceElement surfaceElement) throws Exception {
        if(surfaceElement.getTheme().equals(this.grid.getTheme()))
            throw new Exception("The theme of surfaceElement is not equal at the level theme");
        doubleCheck(surfaceElement.getPosition());
        this.grid.placeItem(surfaceElement);
        return this;
    }

    public Grid build(){
        return this.grid;
    }

    private void doubleCheck(Position position) throws Exception {
        checkEmptyPosition(position);
        checkUnderBoundPosition(position);
    }

    private void checkUnderBoundPosition(Position position) throws Exception {
        if(position.getX() < 0 || position.getY() < 0 || position.getX() >= this.grid.getWidth() || position.getY() >= this.grid.getHeight()) {
            throw new Exception("The position " + position + " is out of bounds");
        }
    }

    private void checkEmptyPosition(Position position) throws Exception {
        Item item = this.grid.getGrid()[position.getY()][position.getX()];
        if(item != null)
            throw new Exception("The position " + position + " is already occupied by item " + item);
    }

}
