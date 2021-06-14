public class JavaBuzz {
    public static void main() {
        for (int i = 1; i < 101; i++) {
            System.out.println(javaBuzz(i));
        }
    }

    public static String javaBuzz(int number) {
        if (number % 15 == 0) { return "JavaBuzz"; }
        if (number % 5 == 0) { return "Buzz"; }
        if (number % 3 == 0) { return "Java"; }
        return Integer.toString(number);
    }
}
