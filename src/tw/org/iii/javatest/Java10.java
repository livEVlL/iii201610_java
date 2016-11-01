package tw.org.iii.javatest;

public class Java10 {
    public static void main(String[] args) {
        for (int k = 0; k < 2; k++) {
        for (int j = 1; j < 10; j++) {
            for (int i = 2; i < 6; i++) {
                int newi = i + k * 4;
                int r = newi * j;
                System.out.print(newi + " x " + j + " =" + r + "\t");
            }
            System.out.println();
         }
        }
    }
}