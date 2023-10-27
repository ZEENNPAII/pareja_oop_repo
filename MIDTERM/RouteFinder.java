import java.util.Scanner;
public class RouteFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Barili, Dumanjug = "";
        String Route = "";
        System.out.print("Input the speed in km/hr: ");
        double speed = sc.nextDouble();
        sc.nextLine();
        double distance;
        System.out.print("Is Barili Blocked? (Yes or No?)-> ");
        Barili = sc.nextLine().trim();
        if(Barili.equalsIgnoreCase("yes")) {
            System.out.print("Is Dumanjug Blocked? (Yes or No?)-> ");
            Dumanjug = sc.nextLine().trim();
        }
        if(Barili.equalsIgnoreCase("yes") && Dumanjug.equalsIgnoreCase("yes")) {
            Route = "Cebu City -> START\nMinglanilla -> Route 1\nSan Fernando -> Route 2\nCarcar -> Route 3\nSibonga -> Route 4\nArgao -> Route 5\nRonda -> Route 5.1\nAlcantara -> Route 5.2\nMoalboal -> END";
            distance = 108;
        } else if(Dumanjug.equalsIgnoreCase("no")){
            Route = "Cebu City -> START\nMinglanilla -> Route 1\nSan Fernando -> Route 2\nCarcar -> Route 3\nSibonga -> Route 4.2\nDumanjug -> Route 4.2.1\nAlcantara -> Route 4.2.2\nMoalboal -> END";
            distance = 98;
        } else {
            Route = "Cebu City -> START\nMinglanilla -> Route 1\nSan Fernando -> Route 2\nCarcar -> Route 3\nBarili -> Route 4.1\nDumanjug -> Route 4.1.1\nAlcantara -> Route 4.1.2\nMoalboal -> END";
            distance = 84.9;
        }
        int hours = (int)(distance/speed);
        int minutes = (int)((distance/speed - Math.floor(distance/speed))*60);
        System.out.println("\nOutput: \nRecommended Route:\n" + Route);
        System.out.println("Speed: "+speed+" km/hrs.");
        System.out.println("distance: " + distance+" km.");
        System.out.println("Estimated Time of Arrival: " + hours + " hour(s) " +
                minutes + " minute(s).");
    }
    
}