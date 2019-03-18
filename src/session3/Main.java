package session3;

public class Main {

    public static void main(String args[]){
        sanpham sanPham1 = new sanpham(1,"San pham 1",1000.0,5);
        sanpham sanPham2 = new sanpham(2,"San pham 2",2000.0,2);
        sanpham sanPham3 = new sanpham(3,"San pham 3",5000.0,0);

        DonHang donHang1 = new DonHang(1);
        donHang1.themSanPham(sanPham1);
        donHang1.themSanPham(sanPham2,20);
        donHang1.themSanPham(sanPham2,20);
        donHang1.themSanPham(sanPham3,80);

        donHang1.inDonHang();


        DonHang donHang2 = new DonHang(2);
        donHang2.themSanPham(sanPham2,90);

        donHang2.inDonHang();
    }

}
