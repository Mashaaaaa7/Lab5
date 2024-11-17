//Необходимо написать программу, которая будет находить все случаи в
//тексте, когда сразу после строчной буквы идет заглавная, без какого-либо
//символа между ними, и выделять их знаками «!» с двух сторон

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindCapitalAfterLowercase{

    public static void main(String[] args) {

        //регулярное выражение, которое ищет в тексте любую строчную и заглавную букву
        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher("CaPS letTerS");

        System.out.println("Найденные совпадения:");
        while (matcher.find()) {
            System.out.println("!" + matcher.group() + "!");
        }
    }
}
