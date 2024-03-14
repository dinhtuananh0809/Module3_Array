package Array;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
//       cho phep ng dung nhap vao so dong va so cot
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so dong");
        byte row = scanner.nextByte();
        System.out.println("Vui long nhap so cot");
        byte col = scanner.nextByte();
//        khoi tao mang 2 chieu tu gtri ng dung nhap vao
        byte[][] numberArr = getArrayFromUser(row,col,scanner);
//        tim gia tri lon nhat trong mang khoi tao
        byte max = findMaxValue(numberArr,row,col);

        System.out.printf("Gia tri lon nhat cua mang ban vua nhap la: %d",max);
    }
    public static byte[][] getArrayFromUser(byte row, byte col,Scanner scanner){
        byte[][] numberArr = new byte[row][col];
//        cho ng dung khoi tao cac gia tri cua mang
        for ( byte rowIndex = 0; rowIndex < row; rowIndex++){
            for(byte colIndex = 0; colIndex < col; colIndex++ ){
                System.out.printf("Vui long nhap phan tu tai hang %d, cot %d \n",rowIndex + 1,colIndex + 1);
                numberArr[rowIndex][colIndex] = scanner.nextByte();
            }
        }
        return numberArr;

    }

    public static byte findMaxValue(byte[][] numberArr,byte row, byte col){
        byte max = numberArr[0][0];
        byte item;
        for ( byte rowIndex = 0; rowIndex < row; rowIndex++){
            for(byte colIndex = 0; colIndex < col; colIndex++ ){
                item = numberArr[rowIndex][colIndex];
                if (max < item){
                    max = item;
                }

            }
        }
        return max;
    }
//    public static byte findMaxValue(byte[][] array) {
//        byte max = array[0][0];
//        for (byte[] row : array) {
//            for (byte item : row) {
//                if (max < item) {
//                    max = item;
//                }
//            }
//        }
//        return max;
//    }
}

