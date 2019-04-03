package baithi;



import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        ArrayList<Hotel> hotels = new ArrayList<>();
        for (int i=0; i<10; i++){
            hotels.add(new Hotel());
        }

        int j=1;
        for(Hotel ht: Hotel){
            System.out.println("Input for hotel "+j+" :");
            Scanner info = new Scanner(System.in);
            System.out.println("Input hotel name:");
            ht.setName(info.nextLine());

            System.out.print("Input owner's name: ");
            ht.setOwnerName(info.nextLine());

            System.out.print("Input location: ");
            ht.setLocation(info.nextLine());
            j++;
        }


        }
    }

