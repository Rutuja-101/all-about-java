import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter light color (red/yellow/green): ");
        String color = sc.nextLine().toLowerCase();

        if (color.equals("red")) {
            System.out.println("STOP");

        } else if (color.equals("yellow")) {
            System.out.println("Slow Down");

        } else if (color.equals("green")) {
            System.out.println("GO");
            
        } else {
            System.out.println("Invalid color!");
        }

        sc.close();
    }
}
