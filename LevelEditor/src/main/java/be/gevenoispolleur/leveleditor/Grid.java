package be.gevenoispolleur.leveleditor;

import be.gevenoispolleur.leveleditor.items.Item;
import be.gevenoispolleur.leveleditor.items.surface_element.Theme;

import java.util.Arrays;

public class Grid {

    private final Theme theme;
    private final int width;
    private final int height;
    private final Item[][] grid;


    public Grid(Theme theme, int width, int height){
        this.theme = theme;
        this.width = width;
        this.height = height;
        this.grid = new Item[height][width];
    }

    public Theme getTheme() {
        return theme;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Item[][] getGrid() {
        return grid;
    }


    /**
     *
     * @param item {@link Item} - The item to place on the grid
     * @modifies this
     * @effects set item on the grid on its coordinates
     * @throws RuntimeException if an item is already present on this tile at coordinates provided by item
     */
    public void placeItem(Item item) throws Exception {
        int xPosition = item.getPosition().getX();
        int yPosition = item.getPosition().getY();

        if(this.grid[yPosition][xPosition] == null)
            this.grid[yPosition][xPosition] = item;
        else
            throw new Exception("An item is already present on this tile");
    }

    public Item getItemAt(int x, int y){
        return this.grid[y][x];
    }

    @Override
    public String toString() {
        return "Grid{" +
                "grid=" + Arrays.toString(grid) +
                '}';
    }
}
