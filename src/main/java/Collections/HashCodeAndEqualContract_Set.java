package Collections;

import com.google.common.collect.Lists;

import java.util.*;

public class HashCodeAndEqualContract_Set {

    public static void main(String[] args) {
        EmployeeSetKey employeeKey1 = new EmployeeSetKey("Bob", "1001");
        EmployeeSetKey employeeKey2 = new EmployeeSetKey("Bob", "1002");
        EmployeeSetKey employeeKey3 = new EmployeeSetKey("Tom", "1003");
        EmployeeSetKey employeeKey4 = new EmployeeSetKey("Bob", "1004");

        Set<EmployeeSetKey> set = new HashSet<>();
        List<EmployeeSetKey> employeeSetKeyList = Lists.newArrayList(employeeKey1,employeeKey2,employeeKey3,employeeKey4);

        set.addAll(employeeSetKeyList);
        System.out.println(set);

    }
}

class EmployeeSetKey{

    String name;
    String id;

    public EmployeeSetKey(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "EmployeeSetKey{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeKey that = (EmployeeKey) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return id != null ? id.equals(that.id) : that.id == null;
    }

}