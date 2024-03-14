package Array;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so dong ");
        byte row = scanner.nextByte();
        System.out.println("Moi ban nhap so cot");
        byte col = scanner.nextByte();
        byte[][] numberArr = new byte[row][col];
        for ( byte rowIndex=0; rowIndex<row; rowIndex++){
            for (byte colIndex = 0; colIndex < col; colIndex++){
                System.out.printf("Moi ban nhap dong thu %d, cot thu %d: ",rowIndex+1,colIndex+1);
                numberArr[rowIndex][colIndex] = scanner.nextByte();
            }
        }

        System.out.println("Mang du lieu ma ban da nhap la");
        for (byte[] rowArray : numberArr){
            for (byte value : rowArray){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int mainDiagonal = 0;
        for ( byte rowIndex =0; rowIndex < row; rowIndex++ ){
            for (byte colIndex = 0; colIndex <col; colIndex++){
                if (rowIndex == colIndex){
                    mainDiagonal += numberArr[rowIndex][colIndex];

                }
            }
        }
        System.out.printf("Tong gai tri tren duong cheo chinh la: %d \n", mainDiagonal);

        int subDiagonal = 0;
        for ( byte rowIndex =0; rowIndex < row; rowIndex++ ){
            for (byte colIndex = 0; colIndex <col; colIndex++){
                if (rowIndex + colIndex == row - 1){
                    subDiagonal += numberArr[rowIndex][colIndex];

                }
            }
        }
        System.out.printf("Tong gai tri tren duong cheo phu la: %d \n", subDiagonal);

    }
}
