import java.util.Scanner;

//get bit,set bit,clear bit,update bit
//update bit operation- to point at a given bit and change it
//first, bitmasking=> 1<<i
//then,(clear) for 0-->operation AND with not with the bitmask and n
//(set)for 1-->operation OR with the bitmask and n

//bitmasking- manipulation of bit
// bit shift left(<<)--> 1<<2=> 0001<<2=>0100
// bit shift right(>>)--> 1>>2=> 0100>>2=>0001

//This
//      project is for
//                    update operation of bits
public class bit_manipulation5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt();
        System.out.println("Enter position:");
        int a = sc.nextInt();
        System.out.println("Enter operation to convert to bit(0/1):");
        int u = sc.nextInt();
        int bitmask = 1 << a;
        if (u == 0) {
            bitmask = ~(bitmask);
            int newnum = bitmask & n;
            if (newnum == 0)
                System.out.println(a + " bit position was 0 and it is-> " + newnum);
            else
                System.out.println(a + " bit position was 1 and it is-> " + newnum);
        } else if (u == 1) {
            int newnum = bitmask | n;
            if (newnum == 0)
                System.out.println(a + " bit position was 0 and it is-> " + newnum);
            else
                System.out.println(a + " bit position was 1 and it is-> " + newnum);
        }
        sc.close();
    }
}