package tw.org.iii.javatest;

public class Java08 {
    public static void main(String[] args) {
        int year = 2016;
        int month = 2;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("29");
                    break;
                }
                if (year % 100 == 0) {
                    System.out.println("28");
                    break;
                }
                if (year % 400 == 0) {
                    System.out.println("29");
                    break;
                } else {
                    System.out.println("28");
                    break;
                }
            default:
                break;
        }
    }
}
