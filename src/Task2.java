public class Task2 {
    public static void sortByAmountOfBigLetters(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int amountOfBigLetters = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if (Character.isUpperCase(array[i].charAt(j))) {
                    amountOfBigLetters++;
                }
            }
            for (int l = i + 1; l < array.length; l++) {
                int amountOfBigLetters2 = 0;
                for (int k = 0; k < array[l].length(); k++) {
                    if (Character.isUpperCase(array[l].charAt(k))) {
                        amountOfBigLetters2++;
                    }
                }
                if (amountOfBigLetters2 > amountOfBigLetters) {
                    String temp = array[i];
                    array[i] = array[l];
                    array[l] = temp;
                    amountOfBigLetters = amountOfBigLetters2;
                }
            }
        }
    }
}
