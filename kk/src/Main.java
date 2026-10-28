public class Main {
    public static String truncate(String text, int length) {
        return text.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        var text = "it works!";
        System.out.println(truncate(text, 2));

    }
}