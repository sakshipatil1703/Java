import java.util.Scanner;
//import java.util.Arrays;
class Array_Merge{
  
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the toatl no. of elements of array1: ");
      int n1=sc.nextInt();
      int[] arr1 =new int[n1];
     
      System.out.println("Enter the elements of array1: ");
      for(int i=0;i < n1;i++){
        arr1[i]=sc.nextInt();
      }
    
      System.out.println("Enter the toatl no. of elements of array2: ");
      int n2=sc.nextInt();
      int[] arr2 =new int[n2];
      System.out.println("Enter the elements of array2: ");

      for(int i=0;i < n2;i++){
        arr2[i]=sc.nextInt();
      }
      int size=n1 + n2;
      int[] m1=new int[size];

      System.arraycopy(arr1, 0, m1,0, n1); 
      System.arraycopy(arr2, 0, m1, n1, n2);
      System.out.println("Displaying Merged Array :");
      for(int i=0; i<size; i++){
        System.out.print(m1[i]+ " ");
      }
      sc.close();
    }
}

