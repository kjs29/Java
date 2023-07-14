package projects.pyramid;

public class Pyramid {

    static void buildPyramid(int height, String background, String bricks) {

        for (int i = 1; i <= height; i++) {
            int whitespaces = height - i;
            int stars = 2 * i - 1;

            System.out.print(background.repeat(whitespaces));
            System.out.print(bricks.repeat(stars));
            System.out.print(background.repeat(whitespaces));
    
            System.out.println();
        }
    }

    public static void main(String[] args) {
        buildPyramid(45, " ", "^");
    }
}
