import java.util.Scanner;

public class TimeToEquality {
    public static  int secondsToEqual(int[]array,int size){
        int seconds=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        for (int i = 0; i < size; i++) {
            seconds+=(max-array[i]);
        }
        return seconds;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println("The Time Taken To equal the values: "+secondsToEqual(array,size));
    }
}
