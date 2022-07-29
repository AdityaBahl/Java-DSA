import java.util.Scanner;
//this pro

//get bit,set bit,clear bit,update bit
//get bit operation- to point at a given bit
//first, bitmasking=> 1<<i
//then, operation AND with the bitmask and n

//bitmasking- manipulation of bit
// bit shift left(<<)--> 1<<2=> 0001<<2=>0100
// bit shift right(>>)--> 1>>2=> 0100>>2=>0001

//This
//      project is for
//                      get operation of bits
public class bit_manipulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position:");
        int a = sc.nextInt();
        System.out.println("Enter number n:");
        int n = sc.nextInt();
        // n = (bool) n;
        int bitmask = 1 << a;
        if ((n & bitmask) == 0)
            System.out.println(a + " bit position was 0");
        else
            System.out.println(a + " bit position was 1");
        sc.close();
    }
}