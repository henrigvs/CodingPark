package be.gevenoispolleur;

import be.gevenoispolleur.leveleditor.Grid;
import be.gevenoispolleur.leveleditor.GridBuilder;
import be.gevenoispolleur.leveleditor.items.Cody;
import be.gevenoispolleur.leveleditor.items.Position;
import be.gevenoispolleur.leveleditor.items.Skeleton;
import be.gevenoispolleur.leveleditor.items.Treasury;
import be.gevenoispolleur.leveleditor.items.surface_element.Theme;

import java.util.List;

public class LevelEditorApplication {

    public static void main(String[] args) {
        // Initialization of elements
        Theme theme = Theme.GRASS;
        int width = 10;
        int height = 10;
        Cody cody = new Cody(new Position(0, 0));
        Treasury treasury = new Treasury(new Position(9, 9));
        List<Skeleton> skeletonList = List.of(
                new Skeleton(new Position(1, 1), true),
                new Skeleton(new Position(2, 2), false),
                new Skeleton(new Position(5,6), true)
        );

        // Use grid builder to build grid
        GridBuilder builder = new GridBuilder();
        try {
            builder.setThemeAndDimensions(theme, width, height)
                    .addCody(cody)
                    .addTreasury(treasury);

            for (Skeleton skeleton : skeletonList) {
                builder.addSkeleton(skeleton);
            }

            Grid finalGrid = builder.build();
            System.out.println(finalGrid);


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred during building grid: " + e.getMessage());
        }
    }

}
