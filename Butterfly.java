public class Butterfly {
    public static void main(String[] args) {

        int n = 5;
        int nost = 1;
        int noc = n*2-1;

        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= 9; col++) {
                if (col<=nost || col>=noc){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (row<n){
                nost++;
                noc--;
            }else {
                nost--;
                noc++;
            }
        }
    }
}
