package LearnGuava;

import com.google.common.base.Splitter;

public class StringSpliter {
    private static final Splitter SPLITTER = Splitter.on(",").omitEmptyStrings().trimResults();

    public static void main(String[] args) {
        String splitterString = "Berlin, China, Japan, , ";
        System.out.println(SPLITTER.split(splitterString));
    }
}
