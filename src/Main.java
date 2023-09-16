// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("TASK 1");
        System.out.println(Task1.calculator(1, 3, '+'));

        System.out.println("--------------------");
        System.out.println("TASK 2");
        String[] array = new String[] {
                "DeVeLoPEr",
                "JAVA",
                "a",
                "AM",
                "I",
                "WORld",
            "Hello",


        };
        Task2.sortByAmountOfBigLetters(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("--------------------");
        System.out.println("TASK 3");
        System.out.println(Task3.checkIfStringIsEmail("fdgfkgklf@gmail.com"));
        System.out.println(Task3.checkIfStringIsEmail("fdgfkgklf@gmailcom."));
        System.out.println(Task3.checkIfStringIsEmail("fdgfkgklf@gmail..com"));

        System.out.println("--------------------");
        System.out.println("TASK 4");
        int[][] matrix1 = new int[][] {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = new int[][] {
            {7, 8, 19},
            {9, 10, 18},
            {11, 12, 13}
        };
        int[][] result = Task4.Multiply(matrix1, matrix2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        System.out.println("TASK 5");

    }
}