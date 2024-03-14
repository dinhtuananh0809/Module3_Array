package Array;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so phan tu cua mang");
        byte number = scanner.nextByte();
        byte[] arr = new byte[number];
        for (byte i = 0; i < number; i ++){
            System.out.printf("Moi ban nhap vao phan tu thu %d: ", i + 1);
            arr[i] = scanner.nextByte();
        }
        System.out.println("Mang du lieu ma ban da nhap la");
        for ( byte value : arr){
            System.out.print( value + " ");
        }
        System.out.println();
        byte max = arr[0];
        byte max2 = arr[0];
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        System.out.println("So lon thu hai trong mang la: " + max2);

    }



}
