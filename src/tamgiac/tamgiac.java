package tamgiac;

import java.util.Scanner;

public class tamgiac {
    int x = 3;
    int y = 4;
    int z = 5;

    public tamgiac(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.checkTg();
    }

    private void checkTg() {
        while (this.x + this.y <= this.z || this.x + this.z <= this.y || this.y + this.z <= this.x) {
            Scanner info = new Scanner(System.in);
            System.out.println("nhap 3 canh:");
            this.x = info.nextInt();
            this.y = info.nextInt();
            this.z = info.nextInt();
        }
    }

    public double chuvi() {
        return this.x + this.y + this.z;
    }

    public double dientich() {
        double p = (this.z + this.y + this.z) / 2.0;
        double x = p * (p - this.x) * (p - this.y) * (p - this.z);
        return java.lang.Math.sqrt(x);
    }

    public static void main(String[] args) {
        tamgiac tg = new tamgiac(1, 2, 3);
        System.out.println(tg.dientich());
    }
}
