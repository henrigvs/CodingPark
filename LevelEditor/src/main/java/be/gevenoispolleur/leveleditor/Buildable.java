package be.gevenoispolleur.leveleditor;

import be.gevenoispolleur.leveleditor.items.tunnel.Tunnel;
import be.gevenoispolleur.leveleditor.items.Cody;
import be.gevenoispolleur.leveleditor.items.Skeleton;
import be.gevenoispolleur.leveleditor.items.Treasury;
import be.gevenoispolleur.leveleditor.items.obstacle.Obstacle;
import be.gevenoispolleur.leveleditor.items.surface_element.SurfaceElement;
import be.gevenoispolleur.leveleditor.items.surface_element.Theme;

public interface Buildable {

    Buildable setThemeAndDimensions(Theme theme, int width, int height);
    Buildable addCody(Cody cody) throws Exception;
    Buildable addSkeleton(Skeleton skeleton) throws Exception;
    Buildable addTreasury(Treasury treasury) throws Exception;
    Buildable addObstacle(Obstacle obstacle) throws Exception;
    Buildable addTunnel(Tunnel tunnel) throws Exception;
    Buildable addSurfaceElement(SurfaceElement surfaceElement) throws Exception;
}
