//this program exhibits Tower of
class TOH {
    public static void toh(int n, String src, String aux, String target) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + target);
            return;
        }
        toh(n - 1, src, target, aux);
        System.out.println("transfer disk " + n + " from " + src + " to " + target);
        toh(n - 1, aux, src, target);
    }

    public static void main(String[] args) {
        int n = 3;
        toh(n, "src", "aux", "target");
        return;
    }
}