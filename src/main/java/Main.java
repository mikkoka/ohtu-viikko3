import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
    	final int k = 3;
    	int l = 2;
        Scanner scanner = new Scanner(System.in);
        Multiplier kolme = new Multiplier(k);
        System.out.println("anna luku ");
        int luku = scanner.nextInt();

        System.out.println("luku kertaa kolme on "+kolme.multipliedBy(luku) );
    }
}