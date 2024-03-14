package Array;

public class array {
    public static void main(String[] args) {
        byte sizeRow = 5;
        byte sizeColumn = 2;
        String[][] studenArr = new String[sizeRow][sizeColumn];
        String[] studentNames = {"nguyen van a", "nguyen van b", "nguyen van c", "nguyen van f", "nguyen van d", "nguyen van e"};
        for (byte i = 0; i < sizeRow; i++) {
            for (byte j = 0; j < sizeColumn; j++) {
                studenArr[i][j] = j == 0 ? String.format("sv000%d", i) : studentNames[i];

            }
            for (String[] item:studenArr ){
                System.out.println(String.format(" ma so sinh vien la : %s :ten sinh vien la %s :",item[0],item[1] ));
            }
        }

    }
}
