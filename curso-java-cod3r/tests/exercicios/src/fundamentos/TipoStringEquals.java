package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println(s == "2");
        System.out.println(s.equals("2"));

        Scanner entrada = new Scanner(System.in);
        String s2 = entrada.next();
        System.out.println(s == s2);

        entrada.close();
    }
}