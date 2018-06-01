package LearnGuava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class StringJoiner {
    private static final Joiner joiner = Joiner.on(",").skipNulls();

    public static void main(String[] args) {
        String[] joinlist = {"Berlin", "China", "Japan",null};
        System.out.println(joiner.join(joinlist));
    }
}
