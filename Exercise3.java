package Array;

import com.rikkei.example.Main;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array1 = getArrayFromUser();
        System.out.println(printArray(array1));
        int[] array2 = getArrayFromUser();
        System.out.println(printArray(array2));

        int lenght3 = array1.length + array2.length;
        int[] array3 = new int[lenght3];

        short currentIndex = 0;
        for (int number:array1){
            array3[currentIndex]=number;
            currentIndex++;
        }
        for (int number:array2){
            array3[currentIndex]=number;
            currentIndex++;
        }
    }

    public static int[] getArrayFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc cua mang");
        byte lenght = Byte.parseByte(scanner.nextLine());
        int[] array = new int[lenght];
        for (byte i =0; i< lenght; i++){
            System.out.println(String.format("Hay dat gia tri tai vi tri", i +1));
            array[i] = Integer.parseInt(scanner.nextLine());

        }
        return array;
    }
    public static String printArray(int[] array){
        String result = "";
        for (int number: array){
            result += number;
        }
        return result;
    }
}
