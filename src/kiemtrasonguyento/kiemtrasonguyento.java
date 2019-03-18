package kiemtrasonguyento;

import java.lang.reflect.Constructor;
import java.util.Scanner;
public class kiemtrasonguyento {
    public boolean kiemtrasonguyento(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        kiemtrasonguyento kt = new kiemtrasonguyento();
        Scanner scan = new Scanner(System.in);
        System.out.print(" Nhap so càn kiem tra:");
        int n = scan.nextInt();

        if (kt.kiemtrasonguyento(n)) {
            System.out.println("So "+ n + " la so  nguyen to");
        } else {
            System.out.println("So " + n + " khong la so nguyen to");

        }
    }
}