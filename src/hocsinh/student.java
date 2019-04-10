package hocsinh;
import java.util.Scanner;
class Student {
    public String MaSinhVien;
    public float DiemTB;
    public int Tuoi;
    public String Lop;

    public void inputInfo() {
        Scanner add = new Scanner(System.in);
        System.out.println("MaSinhVien: ");
        MaSinhVien = add.nextLine();

        System.out.println("DiemTB: ");
        DiemTB = add.nextFloat();

        System.out.println("Tuoi: ");
        Tuoi = add.nextInt();
        Lop = add.nextLine();
        System.out.println("Lop: ");
        Lop = add.nextLine();
    }
        public void showInfo () {
            System.out.println("Thong tin sinh vien");
            System.out.println("MaSinhVien: " + MaSinhVien);
            System.out.println("DiemTB: " + DiemTB);
            System.out.println("Tuoi: " + Tuoi);
            System.out.println("Lop: " + Lop);
        }
            public void xetHB () {
                if (DiemTB > 8.0) {
                    System.out.println("Dat hoc bong");
                } else {
                    System.out.println("Khong dat hoc bong");
                }
            }
            //thay commit tất cả các tên

            public String getMaSinhVien(){
            return this.MaSinhVien;
            }

    public static void main(String[]agrs){
                    Student HocSinh = new Student();
                    HocSinh.inputInfo();
                    HocSinh.showInfo();
                    HocSinh.xetHB();


                }
            }
