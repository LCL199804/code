package base;

import java.util.Scanner;

public class Demon03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据:");
        int score = scanner.nextInt();
        String type = score > 80 ? "优秀" : "不优秀";
        System.out.println(type);
        scanner.close();
    }
}
