package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Кодирование длин серий. Дана строка AAAABBB будет сжата в строку A4B3, а строка AAAAAAAAAAAAAAABAAAAA — в строку A15BA5.
 * Вам дана сжатая строка, найдите длину исходной строки.
 */
public class Task2 {
    public static void main(String[] args) {
        String someString1 = "A15BA5"; //out 21
        String someString2 = "ABCDR"; // out 5
        String someString3 = "Z123XY"; //out 125
        System.out.print(new Task2().rlf(someString3));
    }

    public int rlf(String someString) {
        int sumNumber = 0;
        int countNumber = 0;
        int countChar = 0;
        String text = "";
        Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = pat.matcher(someString);
        while (matcher.find()) {
            sumNumber += Integer.parseInt(matcher.group());
            countNumber++;
        }
        Pattern pat1 = Pattern.compile("[\\D]+");
        Matcher matcher1 = pat1.matcher(someString);
        while (matcher1.find()) {
            text += matcher1.group();
        } countChar = text.length();
        return sumNumber+=countChar-countNumber;
    }
}