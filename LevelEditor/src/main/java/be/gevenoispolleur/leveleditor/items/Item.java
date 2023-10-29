package be.gevenoispolleur.leveleditor.items;

public abstract class Item {

    private Position position;

    public Item(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Item{" +
                "instance of " + getClass().getSimpleName() +
                ", position=" + position +
                '}';
    }
}
