import java.util.Scanner;

public class githubTest {

    public static void main(String[] args) {
        System.out.println("This is a test of github. I am learning!");
        System.out.println("Here is another string");

        Scanner scanner = new Scanner(System.in);
        print100Times(scanner.next(), 100);
    }



    private static void print100Times (String input, int number) {

        for (int i = 0; i < 100; i++) {
            System.out.println(input);
            if (i == 99) {
                System.out.println(input + number);
            }
        }
    }

}
