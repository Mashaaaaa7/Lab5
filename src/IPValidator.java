//Необходимо написать программу, которая будет проверять корректность
//ввода IP-адреса. IP-адрес должен состоять из 4 чисел, разделенных
//точками, и каждое число должно быть в диапазоне от 0 до 255. При этом
//программа должна использовать регулярные выражения для проверки
//IP-адреса и обрабатывать возможные ошибки.

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class IPValidator {
    public static void main(String[] args) {

        String text = "192.168.1.1 192.168.1.2 300.255.255.0";

        // Разделяем текст на отдельные IP-адреса по пробелам
        String[] ipAddresses = text.split("\\s+");

        try {
            //регулярное выражение для проверки корректности IP-адреса.
            Pattern pattern = Pattern.compile("^((25[0-5]|[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");

            System.out.println("Найденные IP-адреса:");


            for (String ipAddress : ipAddresses) { // Проверяем каждый IP-адрес
                Matcher matcher = pattern.matcher(ipAddress);
                if (matcher.matches()) {
                    System.out.println("Найденные IP-адреса: " + ipAddress);
                } else {
                    // Вывод сообщения об ошибке
                    System.err.println("Invalid IP-address.");
                }
            }
        } catch (PatternSyntaxException e) {
        // Обработка ошибки в регулярном выражении
        System.err.println("Error in regular expression: " + e.getMessage());
    }
}
}