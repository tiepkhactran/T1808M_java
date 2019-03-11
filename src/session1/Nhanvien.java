package session1;

import java.util.Scanner;

public class Nhanvien {
    public String name;
    public int age;
    public String address;
    public double salary;
    public int workingTime;
     public  void inputInfo(){
         System.out.println("nhap ten nhan vien:");
         Scanner scanner = new Scanner(System.in);
         name=scanner.nextLine();

         System.out.println("Nhap tuoi:");
         age=scanner.nextInt();
         scanner.nextLine();
         System.out.println("Nhap dia chi:");
         address=scanner.nextLine();

         System.out.println("Nhap thoi gian lam:");
         workingTime =scanner.nextInt();

     }
     public void printInfo(){
         System.out.println("Thong tin nhan vien:");
         System.out.println(name+"- tuoi:"+age);
     }

    public double tinhThuong() {
        double thuong=0;
        if (workingTime>=200){
            thuong=salary*20/100;
        }
        else if (workingTime<200 && workingTime>=100){
            thuong=salary*10/100;
        }
        return thuong;
    }
}






