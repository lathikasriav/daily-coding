import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale usLocale=Locale.US;
        Locale chinaLocale=Locale.CHINA;
        Locale franceLocale=Locale.FRANCE;
        Locale indiaLocale=new Locale("en","IN");
        
        NumberFormat indiaFormat=NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat usFormat=NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat chinaFormat=NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat=NumberFormat.getCurrencyInstance(franceLocale);
        
        String us=usFormat.format(payment);
        String india=indiaFormat.format(payment);
        String china=chinaFormat.format(payment);
        String france=franceFormat.format(payment);
        
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
