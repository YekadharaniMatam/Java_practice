public class recursion{
    public static void main(String[]args){
       recurssion(1);
    }
        static void recurssion(int n){
            if(n==6){
                System.out.println(6);
                return;
            }
            System.out.println(n);
            recurssion(n+1);
        }
    }
