package base;

import java.util.Scanner;

public class Demon02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        double sum = 0;
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m++;
            sum += x;
        }
        System.out.println("和为:"+sum);
        System.out.println("平均值为:"+sum/m);
        System.out.println("次数为:"+m);
        scanner.close();
    }
}
