//Необходимо написать программу, которая будет искать все слова в
//заданном тексте, начинающиеся с заданной буквы, и выводить их на
//экран. При этом программа должна использовать регулярные выражения
//для поиска слов и обрабатывать возможные ошибки

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

    public class WordFinder {

        public static void main(String[] args) {

            char letter = 'b'; // Буква для поиска

            try {
                // Регулярное выражение для поиска слов, начинающихся с заданной буквы
                Pattern pattern = Pattern.compile("\\b" + letter + "\\w+\\b");

                // объект Matcher для поиска совпадений в тексте
                Matcher matcher = pattern.matcher("The world is full of beauty, waiting to be discovered.");

                System.out.println("Words starting with '" + letter + "':");

                // Поиск совпадений в тексте
                while (matcher.find()) {
                    // Вывод найденного слова на экран
                    System.out.println(matcher.group());
                }
            } catch (PatternSyntaxException e) {
                // Обработка ошибки в регулярном выражении
                System.err.println("Error in regular expression: " + e.getMessage());
            }
        }
    }
