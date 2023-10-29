package be.gevenoispolleur.leveleditor.items;

public class Skeleton extends Item{

    private final boolean isAggressive;

    public Skeleton(Position position, boolean isAggressive) {
        super(position);
        this.isAggressive = isAggressive;
    }

    public boolean isAggressive() {
        return isAggressive;
    }
}
