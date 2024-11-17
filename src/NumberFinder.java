//Необходимо написать программу, которая будет искать все числа в
//заданном тексте и выводить их на экран. При этом программа должна
//использовать регулярные выражения для поиска чисел и обрабатывать
//возможные ошибки

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class NumberFinder {

    public static void main(String[] args) {
        try {
            // Регулярное выражение для поиска чисел
           Pattern pattern = Pattern.compile("[-+]?\\d+(\\.\\d+)?");
            // Создание объекта Matcher для поиска совпадений в тексте
            Matcher matcher = pattern.matcher("В этом тексте есть числа: 123, 456 и 789, а также дробные: 1.234, 56.789 и 0.987" +
                    "Ещё отрицательные числа: -10, -2.5 и -3456" +
                    "И большие числа: 1000000 и 1234567890.");

            System.out.println("Найденные числа:");
            // Поиск совпадений в тексте
            while (matcher.find()) {
                // Вывод найденного числа на экран
                System.out.println("Match found: " + matcher.group());
            }
        } catch (PatternSyntaxException e) {
            // Обработка ошибки в регулярном выражении
            System.err.println("Ошибка в регулярном выражении: " + e.getMessage());
        }
    }
}