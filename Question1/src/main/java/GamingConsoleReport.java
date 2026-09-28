public class GamingConsoleReport {
    public static void main(String[] args) {

        // List of cities and console
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
String[] consoles = {"PS5", "XBOX", "SWITCH"};

        //Sales table
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
        };

        // This will hold total for each city
        int[] cityTotals = new int[3];

        //Adds the 3 numbers in each row
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                cityTotals[row] += sales[row][col];
            }
        }

        //Finds which city is biggest
        int highestIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[highestIndex]) {
                highestIndex = i;
            }
        }

        //Prints everything out nicely
        System.out.println("---------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------");

        System.out.printf("%-18s", ""); // empty space for cities
        for (String console : consoles) {
            System.out.printf("%8s", console);
        }
        System.out.println();

        for (int row = 0; row < sales.length; row++) {
            System.out.printf("%-18s", cities[row]);
            for (int col = 0; col < sales[row].length; col++) {
                System.out.printf("%8d", sales[row][col]);
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[highestIndex]);
        System.out.println("---------------------------------------------");
    }
}
