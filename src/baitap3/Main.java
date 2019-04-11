package baitap3;

public class Main {
    public static void main(String args[]){
        Subthread s1=new Subthread();
        s1.start();

        for (int i=1; i<=50;i++){
            System.out.println(i);
        }

        System.out.println("CountDown  ---->>>");
    }

}

