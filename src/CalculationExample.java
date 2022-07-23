import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap vao so x");
        int x = sc.nextInt();
        System.out.println("moi ban nhap vao so y");
        int y = sc.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.caculate(x, y);
    }

    public void caculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tong cua x va y la:" + a);
            System.out.println("hieu cua x va y la:" + b);
            System.out.println("tich cua x va y la:" + c);
            System.out.println("thuong cua x va y la:" + d);
        }catch (Exception e) {
            System.out.println("so ban nhap vao khong hop le" + e.getMessage());
        }
    }
}
