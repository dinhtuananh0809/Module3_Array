package Array;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so phan tu muon tao mang");
        byte number = scanner.nextByte();
        byte[] arr = new byte[number];
        for (byte i = 0; i < number ; i++){
            System.out.printf("Phan tu thu %d : ",i + 1);
            arr[i] = scanner.nextByte();
        }
        System.out.println("Mang du lieu ma ban da nhap la: ");
            for(byte value : arr){
                System.out.print(value + " " );
            }
        System.out.println();
        System.out.println("Nhap vao chu so ma ban muon dem");
            byte numberCount = scanner.nextByte();
             byte count = 0;
             for ( byte i = 0; i < arr.length; i++){
                 if (numberCount == arr[i]){
                     count += 1;
                 }
             }
             System.out.printf("Chu so ma ban da nhap dc lap lai %d lan",count);

    }
}
