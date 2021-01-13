package ru.poz1t1v.lesson1;

public class MainApp {
    /*----- Создать пустой проект в IntelliJ IDEA
                              и прописать метод main(). -----*/
    public static void main(String[] args) {


        System.out.println(methodTwo(1, 2, 37.54f, 45));
        System.out.println(methodThree(5, 10));
        System.out.println(methodThree(15, 10));
        methodFour(5);
        methodFour(-5);
        System.out.println(methodFive(-1));
        System.out.println(methodFive(-0));
        methodSix("Дмитрий");
        methodSeven(2020);


             /*----- Создать переменные всех пройденных типов
                         данных и инициализировать их значения. -----*/


        byte b1 = 12;
        short s1 = 15151;
        int i1 = 15151;
        long l1 = 15151;
        float f1 = 151.28f;
        double d1 = 15151.548;
        char c1 = 'c';


    }

              /*----- Написать метод вычисляющий выражение a * (b + (c / d))
                        и возвращающий результат, где a, b, c, d – аргументы этого метода,
                                               имеющие тип float. -----*/

    public static float methodTwo(int a, int b, float c, int d) {
        System.out.println("Задание 2.");
        return a * (b + (c / d));
    }

    /*----- Написать метод, принимающий на вход два целых числа и проверяющий,
что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
                          в противном случае – false. -----*/
    public static boolean methodThree(int a, int b) {
        System.out.println("Задание 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;

    }

    /*----- Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом. -----*/
    public static void methodFour(int a) {

        if (a >= 0) {
            System.out.println("Задание 4.");
            System.out.println("Число " + a + " положительное");

        } else

            System.out.println("Число " + a + " отрицательное");
    }

    /*----- Написать метод, которому в качестве параметра передается целое число.
            Метод должен вернуть true, если число отрицательное,
                   и вернуть false если положительное. -----*/
    public static boolean methodFive(int a) {
        System.out.println("Задание 5.");
        if (a < 0) return true;
        return false;
    }

    /*----- Написать метод, которому в качестве параметра передается строка,
            обозначающая имя. Метод должен вывести в консоль сообщение
                             «Привет, указанное_имя!». -----*/
    public static void methodSix(String name) {
        System.out.println("Задание 6.");
        System.out.println("Привет, " + name);
    }

              /*----- Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
                             Каждый 4-й год является високосным, кроме каждого 100-го,
                                при этом каждый 400-й – високосный -----*/


    public static void methodSeven(int year) {
        System.out.println("Задание 7.");
        int a1, a2, a3;
        a1 = year % 4;
        a2 = year % 100;
        a3 = year % 400;
        String result;


        if (a1 == 0 && a2 < 0)
            result = "Год ";
        else if (a1 == 0 && a2 == 0 && a3 == 0) ;
    }
}

