import java.util.Scanner;
public class ques3{
    public static int greatnum(int a,int b){
        return (a>=b)?a:b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(greatnum(a,b));
        sc.close();
    }
}