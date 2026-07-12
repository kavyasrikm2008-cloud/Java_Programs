import java.util.*;
public class Main 
{
    
public static void main (String[] args) {
    int [] arr = new int[5];
    Scanner in = new Scanner(System.in);
    System.out.println("enter sorted array: ");
    for(int i=0;i<5;i++)
    {
        arr[i] = in.nextInt();
    }
    int key;
    int found=0;
     System.out.println("enter key: ");
     key = in.nextInt();
     int mid;
     int start=0;
     int end = arr.length-1;
     while(start<=end)
     {
         mid = (start+end)/2;
         if(arr[mid]==key)
         {
          System.out.println("found" );
          found=1;
          break;
          
         }
         else if(arr[mid]<key)
         {
            start = mid+1;
         }
         else
         {
             end = mid-1;
             
         }
         
     }
     if(found==0)
     {
         System.out.println("not found");
     }
    
}
}