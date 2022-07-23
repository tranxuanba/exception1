import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chi so cua 1 phan tu bat ky");
        int x = sc.nextInt();
        try {
            System.out.println("gia tri cua phan tu co chi so 5" + x + "la:" + arr[x]);

        }catch (IndexOutOfBoundsException e) {
            System.out.println("chi so vuot qua gioi han cua mang");
        }
    }
}
