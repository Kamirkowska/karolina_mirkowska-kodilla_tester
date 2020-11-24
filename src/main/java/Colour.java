import java.util.Scanner;
public class Colour {
    public static String getUserSelection() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Select colour (W-white, B-blue, Y-yellow, R-red):");
        String calc = scanner.nextLine().trim().toUpperCase();
        switch (calc) {
            case "W": return "White";
            case "B": return "Blue";
            case "Y": return "Yellow";
            case "R": return "Red";
            default:
                System.out.println("Wrong letter. Try again.");
            }
        }
    }
}