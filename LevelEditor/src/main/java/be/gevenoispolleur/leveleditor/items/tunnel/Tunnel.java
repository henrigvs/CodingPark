package be.gevenoispolleur.leveleditor.items.tunnel;

import be.gevenoispolleur.leveleditor.items.Item;
import be.gevenoispolleur.leveleditor.items.Position;

public class Tunnel extends Item {

    private final Position gateB;
    private final TunnelColor color;

    public Tunnel(Position gateA, Position gateB, TunnelColor color) {
        super(gateA);
        this.gateB = gateB;
        this.color = color;
    }

    public Position getGateA() {
        return getPosition();
    }

    public Position getGateB() {
        return gateB;
    }

    public TunnelColor getColor() {
        return color;
    }
}
