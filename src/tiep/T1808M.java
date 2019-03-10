package tiep;

public class T1808M {
    int y = 3;
    static int z = 5;
    final static int k = 7;

    public static void main(String[] args){
        int x = 10;
        System.out.println("Hello Java");
        T1808M obj = new T1808M();
        x = x+ obj.y;
        x = x+ T1808M.z;
        T1808M.z = 30;
        x = x + T1808M.k;
        x = x > 50?100:50;
        int[] arr = {1,2,3};
        for (int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        for (int i:arr){
            System.out.println(i);
        }
    }
}