import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai bao doi tuong
        TriangleEdgesCheck triangleEdgesCheck = new TriangleEdgesCheck();
        //nhap du lieu
        try {
            System.out.println("nhap vao canh thu nhat");
            int a = sc.nextInt();
            System.out.println("nhap vao canh thu hai");
            int b = sc.nextInt();
            System.out.println("nhap vao canh thu ba");
            int c = sc.nextInt();
            try {
                triangleEdgesCheck.checkTriangleEdges(a, b, c);
            }catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        }catch (Exception e) {
            System.out.println("sai: khong dung dinh dang");
        }
        sc.close();
    }
}
