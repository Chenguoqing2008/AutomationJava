package LearnGuava;


import com.google.common.base.Objects;
import com.google.common.base.MoreObjects;

public class StringHelper {
    private String name;
    private String sex;

    public StringHelper(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name","Robin")
                .add("sex","male").toString();
    }

    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper("Robin","male");
        System.out.println(stringHelper);
    }
}
