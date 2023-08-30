package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Введите имя, или целое число, или последовательность целых чисел разделенных запятой" );
        Scanner scanner = new Scanner( System.in );
        String input = scanner.nextLine();
        System.out.println( output( input ) );
    }

    public static String output(String input) {

        String[] data = input.split( "," );

        if (data.length < 2 & isDigit( data[0] )) {

            int a = Integer.parseInt( data[0] );
            if (a > 7) {
                return "Привет";
            }
            return "Поздароваюсь если ваше число больше 7";
        }
        if (data.length < 2) {
            String s = "Вячеслав";

            if (s.equalsIgnoreCase( data[0] )) {

                return "Привет Вячеслав";
            }
            return "Нет такого имени";
        }
        if (data.length > 1 & isDigit( data[0] )) {

            System.out.println("Вот числа кратные 3 из вашей последовательности");

            int[] array = new int[data.length];
            for (int i = 0; i < data.length; i++) {
                array[i] = Integer.parseInt( data[i] );
                if (array[i] % 3 == 0)
                    System.out.println( array[i] );
            }

        }
        return "Нет числа кратного 3";
    }

    private static boolean isDigit(String input) {
        try {
            Integer.parseInt( input );
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


/*
Задание, ответ в текстовой форме:
        Дана скобочная последовательность: [((())()(())]]
        - Можно ли считать эту последовательность правильной?
        - Если ответ на предыдущий вопрос “нет”, то что необходимо в ней изменить, чтоб она стала правильной?
        Нет, данная скобочная последовательность неверна, что бы она стала правильной,
        необходимо добавить недостающие элементы [[((())()(()))]], либо удалить лишние [(())()(())], что бы все скобки имели открывающий и закрывающий элемент.

*/
