// Binary search is used to find the position of a target value within a sorted array.
// we find the middle element of the array and compare it with the target value.
// if the target value is equal to the middle element, we return the position of the middle element.
// if the target value is less than the middle element, we search in the left half of the array.
// if the target value is greater than the middle element, we search in the right half of the array.
// we repeat this process until we find the target value or the search space is empty.
// Time complexity O(log n) for average and worst case
// Timecomplexity O(n) for best case
// Space complexity O(1)
import java.util.*;
public class binarysearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=sc.nextInt();
        int low=0;
        int high=n-1;
        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element found at position "+(mid+1));
                found=true;
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
