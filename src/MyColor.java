/* Base UI (i.e. Grid and JPanel) Taken from StackOverflow
 * Link: https://stackoverflow.com/questions/8023468/java-grid-of-clickable-elements
 * User Link: https://stackoverflow.com/users/522444/hovercraft-full-of-eels
 */

import java.awt.Color;

public enum MyColor {
    GREEN(Color.green, "Green", "g"),
    RED(Color.red, "Red", "r"),
    BLUE(Color.blue, "Blue", "b"),
    YELLOW(Color.yellow, "Yellow", "y"),
    WHITE(Color.WHITE, "White", "w");
    private Color color;
    private String name;
    private String shortName;

    private MyColor(Color color, String name, String shortName) {
        this.color = color;
        this.name = name;
        this.shortName = shortName;
    }

    public MyColor next() {
        int index = 0;
        for (int i = 0; i < MyColor.values().length; i++) {
            if (MyColor.values()[i] == this) {
                index = (i + 1) % MyColor.values().length;
            }
        }
        return MyColor.values()[index];
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    @Override
    public String toString() {
        return shortName;
    }

}