// Removing duplicates in
public class Remove_duplicates_in_string {
    public static boolean[] map = new boolean[26];

    public static void remdupli(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            remdupli(str, idx + 1, newString);
        } else {
            newString += currchar;
            map[currchar - 'a'] = true;
            remdupli(str, idx + 1, newString);
        }
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        String str = "abbccda";
        remdupli(str, 0, "");
        // sc.close();
    }
}
