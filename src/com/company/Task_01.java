
package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_01 {
    public static void main(String[] args) {

        int startOfLine = 0;
        int result;

        Pattern pattern = Pattern.compile("\\d+");
        String word = "Methods 1 can return some value 2.For this 3 , the return statement is used 4.";
        Matcher matcher = pattern.matcher(word);

        while (matcher.find(startOfLine)) {
            String value = word.substring(matcher.start(), matcher.end());
            result = Integer.parseInt(value);

            System.out.println(result);
            startOfLine = matcher.end();
        }

    }


}