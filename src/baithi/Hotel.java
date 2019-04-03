package baithi;

import javax.naming.Name;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public Hotel(String name,String location,String ownerName){
        this.setName(name);
        this.setLocation(location);
        this.setOwnerName(ownerName);

    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void KetQua(){
        System.out.println("Hotel:"+this.getName()+" ---- "+this.getLocation()+" of "+this.getOwnerName());
    }
}
