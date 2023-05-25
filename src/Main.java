import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        descending();
        even();
        multiply();

    }

    private static void descending(){
        //Убыванию
        int[] num;
        num = new int[]{9991, 821923, 2832, 22, 1120, 9, 3, 33, 1233};
        int zero = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    zero = num[i];
                    num[i] = num[j];
                    num[j] = zero;
                }
            }
        }
        System.out.println("Сортировка: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    private static void even(){
        System.out.println(" ");
        int[] numbers = {10002, 293, 123, 4352, 96354, 816, 992, 984, 884, 38};
        System.out.println("Четные числа:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Не четные числа:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number+" ");
            }
        }
    }

    private static void multiply(){
        int[] numbers = {12001, 29384, 12384, 909345, 34289, 1, 2, 3};
        int product = 1;
        int sumEven = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                product *= number;
            }
        }

        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Произведение нечетных чисел: " + product);
    }

    //Остальные две я не смогу сделать самостоятельно все равно от куда нибудь вставлю
    // Но обящательно научусь 
}