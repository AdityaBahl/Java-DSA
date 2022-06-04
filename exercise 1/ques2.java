import java.util.Scanner;
public class ques2{
    public static void oddsum(int x){
        int n=0;
        for(int i=1;i<=x;i++){
            if(i%2!=0){
                n+=i;
            }
        }
        System.out.print("Sum of odd num is: "+n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oddsum(n);
        sc.close();
    }
}