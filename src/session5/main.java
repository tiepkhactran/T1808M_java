package session5;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        int age;
        int year;
        Person person=new Person();
        person.inputInfo();
        person.showInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm sinh: ");
        year = scanner.nextInt();
//         Xác định độ tuổi tương ứng
         age = 2019 - year;
        if (age >=18) {
            System.out.println("Sinh viên đủ 18 tuổi");
        }
    else{
        System.out.println("sinh viên dưới 18 tuổi");
        }
    }

}

