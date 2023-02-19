import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArr = new int[5];
        int[] twoArr = new int[7];
        firstArr[0] = 100;
        firstArr[1] = 112;
        firstArr[2] = 256;
        firstArr[3] = 349;
        firstArr[4] = 770;

        System.out.println(Arrays.toString(firstArr));

        twoArr[0] = 72;
        twoArr[1] = 86;
        twoArr[2] = 113;
        twoArr[3] = 119;
        twoArr[4] = 265;
        twoArr[5] = 445;
        twoArr[6] = 892;

        System.out.println(Arrays.toString(twoArr));
        System.out.println("Соединение массивов");
        int[] threeArr = new int[firstArr.length + twoArr.length];
        int count = 0;
        for (int i = 0; i < firstArr.length; i++) {
            threeArr[i] = firstArr[i];
            count++;
        }
        for (int j = 0; j < twoArr.length ; j++) {
            threeArr[count++] = twoArr[j];
        }
        for (int i = 0; i < threeArr.length; i++) {

            System.out.print(threeArr[i]+ " ");
        }
        System.out.println("Мой результат");
       Arrays.sort(threeArr);
        for (int values : threeArr){
            System.out.print(values + ", ");
        }
        System.out.println("Индекс №7 - " + threeArr[6]);
    }}
//Массив 1 - 100 112 256 349 770
//Массив 2 - 72 86 113 119 265 445 892
//к = 7
//Вывод : 256