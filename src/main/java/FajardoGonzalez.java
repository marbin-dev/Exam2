import java.util.Scanner;

public class FajardoGonzalez {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
boolean running = true;
while (running) {
    System.out.println("""
               MAIN MENU
            
               1) Calculate Square Area
               2) Calculate Square Perimeter
               0) Exit
            
               Choose an Option
            
            """);
    String choice = scanner.nextLine();

    switch (choice) {

        case "1":
            calculateArea();
            return;
        case "2":
            calculatePerimeter();
            return;
        case "0":
            return;
        default:
            System.err.println("PICK A VALID OPTION");
    }
}
    }
    public static void calculateArea() {
        System.out.println("Please put the side length of the square: ");
        double choice = scanner.nextInt();

        double area = choice * choice;

        System.out.println("The Area of the square is: " + area);
    }
    private static void calculatePerimeter() {
        System.out.println("Please put the side length of the square: ");
        double choice = scanner.nextInt();

        double perimeter = 4 * choice;

        System.out.println("The perimeter is: " + perimeter);
    }


    
}
