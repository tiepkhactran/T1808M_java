package baithi;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] scores = new int[10];
        int smallest, highest,temp,total=0;
        double average =0.0;

        //ask the user to enter 10 scores
        for (int i = 0;i<= scores.length-1;i++)
        {
            System.out.print("\n\nEnter Score " + (i+1) + ": ");
            scores[i] = name.getName();
        }

        //find the lowest score
        smallest = scores[0];

        for (int i = 1; i <= scores.length-1;i++)
            if (scores[i] < smallest)
                smallest = scores[i];

        System.out.println("\nThe lowest score is : " + smallest);

        //find the highest score
        highest = scores[0];

        for (int i = 1; i <= scores.length-1;i++)
            if (scores[i] > highest)
                highest = scores[i];

        System.out.println("\nThe highest score is : " + highest);

        //find the average score
        for (int i = 0; i<=scores.length-1;i++)
            total = total + scores[i];

        average = total/10.0;
        System.out.println("\nThe average score is : " + average);

    }
}
