public class EvaluateExpressions {
    public static void main(String[] args) {
        // Speed = Distance / Time
        double distance = 150.0; // in km
        double time = 3.0;       // in hours
        double speed = distance / time;
        System.out.println("Speed = " + speed + " km/h");

        // Simple Interest = (P × R × T) / 100
        double principal = 10000; // P
        double rate = 5;          // R in %
        double timePeriod = 2;    // T in years
        double simpleInterest = (principal * rate * timePeriod) / 100;
        System.out.println("Simple Interest = " + simpleInterest);

        // Volume of Cylinder = π × r² × h
        double radius = 7;   // in cm
        double height = 10;  // in cm
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume + " cm³");
    }
}

