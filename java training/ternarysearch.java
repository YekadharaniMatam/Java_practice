import java.util.Scanner;
public class ternarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key= sc.nextInt();
        int low=0;
        int high=n-1;
        boolean found=false;
        while(low<=high){
            int mid1=low+(high-low)/3;
            int mid2=high-(high-low)/3;
            if(arr[mid1]==key){
                System.out.println(mid1);
                found=true;
                break;
            }
            else if(arr[mid2]==key){
                System.out.println(mid2);
                found=true;
                break;
            }
            else if(key<arr[mid1]){
                high=mid1-1;
            }
            else if(key>arr[mid2]){
                low=mid2+1;
            }
            else{
                low=mid1+1;
                high=mid2-1;
            }
            }
             if (!found) {
            System.out.println("Element not found");
        }
        }
    }
