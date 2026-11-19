import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pmt = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat bharatFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        String us = usFormat.format(pmt);
        String bharat = bharatFormat.format(pmt);
        String china = chinaFormat.format(pmt);
        String france = franceFormat.format(pmt);
        
        System.out.println("US: " + us);
        System.out.println("India: " + bharat);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
