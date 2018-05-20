package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEqualContract_Map {

    public static void main(String[] args) {
        Map<EmployeeKey,String> cache = loadEmployeeMap();
        EmployeeKey Bob = new EmployeeKey("Bob","1001");
        String name = cache.get(Bob);
        System.out.println(name);
    }

    static Map<EmployeeKey,String> loadEmployeeMap(){
        Map<EmployeeKey,String> map = new HashMap<>();
        EmployeeKey employeeKey1 = new EmployeeKey("Bob","1001");
        EmployeeKey employeeKey2 = new EmployeeKey("Steve","1002");
        EmployeeKey employeeKey3 = new EmployeeKey("Lora","1003");
        EmployeeKey employeeKey4 = new EmployeeKey("Hans","1004");

        map.put(employeeKey1,"Bob");
        map.put(employeeKey2,"Steve");
        map.put(employeeKey3,"Lora");
        map.put(employeeKey4,"Hans");

        return map;
    }
}

class EmployeeKey{

    String name;
    String id;

    public EmployeeKey(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
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