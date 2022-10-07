import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getNumberFromUser();
    }

    private static void getNumberFromUser() {
        int min = 5;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число в пределах от %d до %d: ", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber < max && userNumber > min) {
            System.out.println("Good job!");
        } else {
            System.out.println("Think again!");
            getNumberFromUser();
        }

    }

}