package Ss15.Exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static boolean tamGiac(int a, int b, int c) throws Main {
        if (a < 0 || b < 0 || c < 0) {
            throw new Main("Day la so am");
        } else if (a + b < c || a + c < b || c + b < c) {
            throw new Main("2 canh khong lon hon canh canh con lai");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Canh a: ");
        int a = scanner.nextInt();
        System.out.println("Canh b: ");
        int b = scanner.nextInt();
        System.out.println("Canh c: ");
        int c = scanner.nextInt();

        try {
            if (tamGiac(a, b, c)) {
                System.out.println("OK");
            }
        } catch (Main e) {
            e.printStackTrace();
        }
    }
}
