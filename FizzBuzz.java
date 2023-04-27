public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " Fizz");
            }
            if (i % 7 == 0) {
                System.out.println(i + " Buzz");
            }
            if (i % 5 == 0 && i % 7 == 0)
                System.out.println(i + " FizzBuzz");
        }
    }
}
