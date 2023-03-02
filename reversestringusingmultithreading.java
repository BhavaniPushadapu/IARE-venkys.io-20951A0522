import java.util.Arrays;

public class MultithreadedStringReverse {

    public static void main(String[] args) throws InterruptedException {
        String[] strings = {"A changing magnetic field will induce a changing electric field and vice-versa—the two are linked. These changing fields form electromagnetic waves. Electromagnetic waves differ from mechanical waves in that they do not require a medium to propagate.
"};
        System.out.println("Original strings: " + Arrays.toString(strings));
        threadedReverse(strings);
        System.out.println("Reversed strings: " + Arrays.toString(strings));
    }

    public static void threadedReverse(String[] strings) throws InterruptedException {
        Thread[] threads = new Thread[strings.length];
        for (int i = 0; i < strings.length; i++) {
            final int index = i;
            threads[i] = new Thread(() -> strings[index] = reverseString(strings[index]));
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
