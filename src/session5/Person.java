package session5;

import java.util.Scanner;

public class Person {
    public String Name;
    public String Gender;
    public String Birthday;
    public String Address;


    public Person(String name, String gender, String birthday, String address) {
        Name = name;
        Gender = gender;
        Birthday = birthday;
        Address = address;

    }

    public Person() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void inputInfo() {
        Scanner add = new Scanner(System.in);
        System.out.println("Name: ");
        Name = add.nextLine();

        System.out.println("Gender: ");
        Gender = add.nextLine();

        System.out.println("Birthday: ");
        Birthday= add.nextLine();

        System.out.println("Address: ");
        Address= add.nextLine();
    }
    public void showInfo () {
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("Birthday: " + Birthday);
        System.out.println("Address: " + Address);
    }

    public void Birthday() {
System.out.println("Birthday:");

    }
}
