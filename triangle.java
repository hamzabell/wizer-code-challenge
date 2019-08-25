public class triangle {
    public static void main(String [] args) {
        drawTriangle(60);
    }

    public static void drawTriangle(int height) {
        String starTrail = "";
        for (int i = 0; i < height; i++){
            starTrail += "*";
            int numberOfSpaces = height - starTrail.length();
            for (int j = 0; j< numberOfSpaces; j++){
                System.out.print(' ');
            }  
            System.out.print(starTrail);
            System.out.println();
        }
    }
}