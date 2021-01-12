package Assignment1;

public class AmericanFlag {
    public static void main(String[] args) {
        String patt1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String patt2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(patt1);
        }
            System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(patt2);
        }
    }
}
