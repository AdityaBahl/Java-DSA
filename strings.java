/
public class strings {
    
    public static void main(String[] args) {
        // string declaration
        String a = "og";
        String b = "ideology";
        System.out.println(a + " " + b);
        // to compare value in string, a<b
        if (a.compareTo("og") == 0) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        if (b.compareTo("og") == 0) {
            System.out.println("YES");
        } else
            System.out.println("NO");
        // substring
        String sentence = "My name is Aditya";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}