import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double branding = sc.nextDouble();
        double travel = sc.nextDouble();
        double food = sc.nextDouble();
        double logistics = sc.nextDouble();

        double total = branding + travel + food + logistics;

        double brandingPercent = (branding / total) * 100;
        double travelPercent = (travel / total) * 100;
        double foodPercent = (food / total) * 100;
        double logisticsPercent = (logistics / total) * 100;

        System.out.printf("Total expenses: Rs.%.2f\n", total);
        System.out.printf("Branding expenses percentage: %.2f%%\n", brandingPercent);
        System.out.printf("Travel expenses percentage: %.2f%%\n", travelPercent);
        System.out.printf("Food expenses percentage: %.2f%%\n", foodPercent);
        System.out.printf("Logistics expenses percentage: %.2f%%\n", logisticsPercent);

        sc.close();
    }
}