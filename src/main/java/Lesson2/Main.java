package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        q1();
//        2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        q2();
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньше 6 умножить на 2;
        q3();
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        //q4();
//        5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//        6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
//        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.


    }
    public static void q1(){

        int[] udir = {1, 1, 0, 1, 0, 0, 1, 0};
            System.out.println(("Starting array value : ") + Arrays.toString(udir));

        for (int i = 0; i < udir.length; i++) {
            if(udir[i] == 1){
                udir[i]--;
            } else if (udir[i] == 0) {
                udir[i]++;
            }


        }
        System.out.println(("Value after cycle of change : ") + Arrays.toString(udir));


    } //Метод создающий массив udir на 8 ячеек заполненными 11010010 и заменяющший 1 на 0 , а 0 на 1
    public static void q2(){
        int[] iona = new int[8];
            System.out.println(("Starting array value : ") + Arrays.toString(iona));

        for (int i = 0; i > iona.length; i++) {

            }
            System.out.println(("Value after cycle of change : ") + Arrays.toString(iona));
    }
    public static void q3(){
        int[] aine = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(("Starting array value : ") + Arrays.toString(aine));

        for (int i = 0; i < aine.length; i++) {
            if(aine[i] <=6){
                aine[i] = aine[i]*2;
            }


        }
        System.out.println(("Value after cycle of change : ") + Arrays.toString(aine));

    }//Метод проходит по массиву [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] и умножает числа меньше 6 на 2
    public static void q4(){
        
    }
}
