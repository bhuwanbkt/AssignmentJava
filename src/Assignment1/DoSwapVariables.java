package Assignment1;

public class DoSwapVariables {
    static int a = 2;
    static int b = 3;
    public static void main(String[] args) {
        doSwap();
        }
    static public void doSwap() {
        int temp = 0;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}
