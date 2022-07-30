import java.util.Scanner;
//this program showcas

//get bit,set bit,clear bit,update bit
//clear bit operation- to point at a given bit and set it as 0
//first, bitmasking=> 1<<i
//then, operation AND with not with the bitmask and n

//bitmasking- manipulation of bit
// bit shift left(<<)--> 1<<2=> 0001<<2=>0100
// bit shift right(>>)--> 1>>2=> 0100>>2=>0001

//This
//      project is for
//                    clear operation of bits
public class bit_manipulation4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position:");
        int a = sc.nextInt();
        System.out.println("Enter number n:");
        int n = sc.nextInt();
        int bitmask = 1 << a;
        bitmask = ~(bitmask);
        int newnum = bitmask & n;
        if (newnum == 0)
            System.out.println(a + " bit position was 0 and it is-> " + newnum);
        else
            System.out.println(a + " bit position was 1 and it is-> " + newnum);
        sc.close();
    }
}