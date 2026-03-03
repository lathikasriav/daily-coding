import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            int intValue = ch;
            float floatValue = ch;
            byte byteValue = (byte) ch;
            short shortValue = (short) ch;
            
            System.out.println("int:" + intValue);
            System.out.println("float:" + floatValue);
            System.out.println("byte:" + byteValue);
            System.out.println("short:" + shortValue);
        } else {
            System.out.println("Invalid");
        }
        
        sc.close();
    }
}