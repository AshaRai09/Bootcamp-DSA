import java.util.*;

public class SortTemperatureAndFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of temperatures: ");
        int n = sc.nextInt();

        double[] temp = new double[n];

        System.out.println("Enter temperatures:");
        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextDouble();
        }

        Arrays.sort(temp);

        System.out.println("Sorted Temperatures:");
        for (double t : temp) {
            System.out.print(t + " ");
        }

        System.out.println("\nColdest Temperature: " + temp[0]);
        System.out.println("Hottest Temperature: " + temp[n - 1]);

        sc.close();
    }
}