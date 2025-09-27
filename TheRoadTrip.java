public class TheRoadTrip {
    public static void main(String[] args) {
        double gallons = Double.parseDouble(args[0]);
        double mpg = Double.parseDouble(args[1]);
        boolean isRaining = Boolean.parseBoolean(args[2]);
        boolean hasMountainPass = Boolean.parseBoolean(args[3]);
        int numPassengers = Integer.parseInt(args[4]);
        boolean isWeekend = Boolean.parseBoolean(args[5]);

        double currentmpg = mpg;
        if(isWeekend == true) {
            currentmpg *= 0.70;
        }
        if (isRaining == true) {
            currentmpg *= 0.85;
        }
        if (hasMountainPass == true) {
            currentmpg *= 0.90;
        }
        if (numPassengers >= 3) {
            currentmpg *= 1.05;
        }
        
        double distance = gallons * currentmpg;
        System.out.println("You can travel " + distance + " miles.");}
}


