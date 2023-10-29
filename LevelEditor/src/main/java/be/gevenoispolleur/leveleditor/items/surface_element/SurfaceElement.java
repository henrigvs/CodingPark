package be.gevenoispolleur.leveleditor.items.surface_element;

import be.gevenoispolleur.leveleditor.items.Item;
import be.gevenoispolleur.leveleditor.items.Position;

public class SurfaceElement extends Item {

    private final Theme theme;

    public SurfaceElement(Position position, Theme theme) {
        super(position);
        this.theme = theme;
    }

    public Theme getTheme() {
        return theme;
    }
}
