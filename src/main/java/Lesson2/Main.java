package Lesson2;

public class Main {

    public static void main(String[] args0){
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
//        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
//        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

        private static void compare(int x) {
            if (x >= 0) {
                System.out.println("Value is positive");
            } else {
                System.out.println("Value is negative");
            }
        }

        private static boolean checkPositive(int x){
            if (x < 0) {
                return true;
            }else{
                return false;
            }
        }

        private static void yoName(String x){

            System.out.println("Hello " + x + " !");

        }

        public static void shame(int y){
            int theYear;
            theYear = y;

            if (theYear < 100) {
                if (theYear > 40) {
                    theYear = theYear + 1900;
                } else {
                    theYear = theYear + 2000;
                }
            }

            if (theYear % 4 == 0) {
                if (theYear % 100 != 0) {
                    System.out.println("IT IS A LEAP YEAR");
                } else if (theYear % 400 == 0) {
                    System.out.println("IT IS A LEAP YEAR");
                } else {
                    System.out.println("IT IS NOT A LEAP YEAR");
                }
            } else {
                System.out.println("IT IS NOT A LEAP YEAR");
            }
        }
    }
}
