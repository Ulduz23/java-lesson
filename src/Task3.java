import java.util.HashMap;
import java.util.Map;

public class Task3 {
    static void main(String[] args) {

        /* task 1 */
        /*int[] numbers = {4, 7, -2, 15, 0, 99, -100};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i< numbers.length; i++){
            if (numbers[i] > max) {
                max = numbers[i];

            }

            if (numbers[i] < min) {
                min = numbers[i];

            }

        }

        System.out.println("Ən böyük ədəd: " + max);
        System.out.println("Ən kiçik ədəd: " + min);*/


        /* task 2 */

        /*int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int fisrtDiaqonal = 0;
        int secondDiaqonal = 0;

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            fisrtDiaqonal += matrix[i][i];
            secondDiaqonal += matrix[i][n-1-i];
        }

        System.out.println("Əsas diaqonalın cəmi: " + fisrtDiaqonal);
        System.out.println("Köməkçi diaqonalın cəmi: " + secondDiaqonal);*/



        /*task 3*/
        /*int[][][] cube = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };

        int x  = 6;

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    if (cube[i][j][k] > 6) {
                        System.out.println("6-dan boyukler " + cube[i][j][k]);
                    }
                }
            }

        }*/

        /* task 4 (help) */

        /*int[] arr = {10, 5, 8, 3, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Artan sıra: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        System.out.print("Tərs sıra: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }*/

        /* task 5 */

        /*String input = "OpenAI";
        String ters = "";

        for (int i = input.length()-1; i >=0; i--) {
                ters = ters + input.charAt(i);
        }

        System.out.println("İvers edilmiş string: " + ters);*/

        /* task 6 */

        /*String word = "madam";
        String ters = "";

        for (int i = word.length()-1; i >=0; i--) {
            ters = ters + word.charAt(i);
        }

        if (word.equals(ters)) {
            System.out.println("Polindromdur");
        }
        else {
            System.out.println("Polindrom deyil");
        }*/


        /* task 7 */

        String sentence = "Java is awesome";

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(charCount);
    }
}
