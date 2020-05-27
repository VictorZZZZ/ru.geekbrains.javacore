package Lesson1;

import java.sql.SQLOutput;

public class Main {
    //        1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args){

//        2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        int x = 15;
        char a = 'A';
        long c = 1524323;
        byte b = 1;
        float z = 4;
        short n = 24;
        double m = 64.5;

//        3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println("Result of calculating a * (b + (c / d)) = " + calculate(56, 65, 22,11));
//        4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println("Does this value between 10 and 20 ? : " + difference(116, 4));
//        5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        compare(642);
//        6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println( "Value is Negative? : " + checkPositive(0));
//        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        yoName("Ingwaar");
//        8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        shame();
    }
    private static int calculate(int a, int b, int c, int d){
        int x = a * (b + (c / d));

        return x;
    }

    private static boolean difference(int x, int y){
        if ((x+y >= 10) && (x+y <= 20)){
            return true;
        }else{
            return false;
        }

    }

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

    public static void shame(){
        System.out.println("К своему стыду, единственной проблемой при решении 8й задачи, оказалась моя бездарность");
    }


}
