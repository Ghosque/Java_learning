package Regex;

import java.util.regex.Pattern;

public class RegexTest1 {
    public static void main(String[] args){
        String content = "I am chinese, you too";
        String pattern = ".*chinese.*";
        boolean matchOrNot = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 \"chinese\" 子字符串? " + matchOrNot);
    }
}
