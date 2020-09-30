public class GraphicEngine {

    public static void print(int[][] grille) {
        for (int i = 0; i < grille.length; i =  i+1) {
                 System.out.println(" ");
            for (int j = 0; j < grille.length; j = j+1) {

                grille[0][j] = 99;
                grille[i][0] = 99;
                grille[grille.length - 1][j] = 99;
                grille[i][grille.length - 1] = 99;

                if(grille[i][j] == 99) {
                    System.out.print("|");
                }

                if(grille[i][j] == 0) {
                    System.out.print(" ");
                }

            }
        }

    }
}