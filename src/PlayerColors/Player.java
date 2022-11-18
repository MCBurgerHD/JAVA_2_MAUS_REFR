package PlayerColors;

import java.util.Arrays;

public class Player {
    private String name;
    private Color color;
    private int playerID;
    public static int playerCount;
    public static Color[] assingedColors;

    public Player(String name, Color color) {
        this.name = name;
        this.playerID = playerCount;
        playerCount++;

        for (int i = 0; i < assingedColors.length; i++) {
            if (assingedColors[i] == color) {
                throw new IllegalArgumentException();
            }
        }
        assingedColors = Arrays.copyOf(assingedColors, assingedColors.length+1);
        assingedColors[assingedColors.length-1] = color;
    }

    public int compareTo(Player player) {
        return 0;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\nID:" + this.playerID + "\nColor:" + this.color;
    }
    public static void main(String[] args) {
        String[] playerNames = {"MCBurgerHD_", "RomanxBobax", "Frizboxx", "DKS118", "EhrenRTL", "Eliasboss", "oliverpk",
                "G3rrit", "Pengu", "Sua"};
    }
}
