//Необходимо написать программу, которая будет проверять корректность
//ввода пароля. Пароль должен состоять из латинских букв и цифр, быть
//длиной от 8 до 16 символов и содержать хотя бы одну заглавную букву и
//одну цифру. При этом программа должна использовать регулярные
//выражения для проверки пароля и обрабатывать возможные ошибки.

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class checkPassw0rd{

    public static void main(String[] args) {
        try {
        // Регулярное выражение, проверяющее, что пароль содержит
        // хотя бы одну заглавную букву, одну цифру и не менее 8 символов

            Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");
            // Создание объекта Matcher для поиска совпадений в тексте
            Matcher matcher = pattern.matcher("1AaBb112");

            // Проверка, соответствует ли пароль шаблону
            if (matcher.matches()) {
                System.out.println("Valid password!");
            } else {
                // Вывод сообщения об ошибке
                System.err.println("Invalid password. Password must contain at least one uppercase letter, one digit and be between 8 and 16 characters long.");
            }

        } catch (PatternSyntaxException e) {
            // Обработка ошибки в регулярном выражении
            System.err.println("Error in regular expression: " + e.getMessage());
        }
    }
}