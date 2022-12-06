public class Main {
    public static void main(String[] args) {
//Урок: массивы 1
//Задача 1
        System.out.println("Задача 1");
        //Целочисленый массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями
        double[] sizes = {1.57, 7.654, 9.986};
        //Произвольный массив
        int[] temp = {-3, -6, -4, -5, -2};
//Задача 2
        System.out.println("Задача 2");
        //распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        System.out.printf("%d, %d, %d \n", +numbers[0], numbers[1], numbers[2]);
        System.out.printf("%.2f, %.3f, %.3f \n", +sizes[0], sizes[1], sizes[2]);
        System.out.printf("%d, %d, %d, %d, %d \n", temp[0], temp[1], temp[2], temp[3], temp[4]);
//Задача 3
        System.out.println("Задача 3");
        //элементы массива в обратном порядке
        System.out.printf("%d, %d, %d \n", +numbers[2], numbers[1], numbers[0]);
        System.out.printf("%.3f, %.3f, %.2f \n", +sizes[2], sizes[1], sizes[0]);
        System.out.printf("%d, %d, %d, %d, %d \n", temp[4], temp[3], temp[2], temp[1], temp[0]);
//Задача 4
System.out.println("Задача 4");
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 == 0) {
                System.out.print(numbers[j] + ", ");
            } else {
                System.out.print((numbers[j] + 1) + ", ");
            }
        }
    }
}