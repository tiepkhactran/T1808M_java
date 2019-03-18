package session3;

public class ThoiTrang extends sanpham{
    public String brand;

    public ThoiTrang(Integer ID, String name, Double price, Integer qty,String brand){
        super(ID,name,price,qty);
        this.brand = brand;
    }
}