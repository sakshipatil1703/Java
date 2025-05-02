import java.util.Scanner;
import java.util.Arrays;
class Sorting{
  
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      int[] arr =new int[10];

      System.out.println("Enter the numbers: ");

      for(int i=0;i < 10;i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      
      System.out.println("Sorted numbers in ascending order :");
      for(int i=0; i<10; i++){
        System.out.print(arr[i]+ " ");
      }
      sc.close();
      
  }

}