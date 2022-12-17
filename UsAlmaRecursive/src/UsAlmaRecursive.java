import java.util.Scanner;

public class UsAlmaRecursive {
    static int usAlma(int base, int power) {

        if (power < 1) {
            return 1;
        } else {
            return base * usAlma(base, power - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(usAlma(5,9));
    }
}
