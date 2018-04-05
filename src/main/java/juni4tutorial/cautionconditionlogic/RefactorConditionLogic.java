package juni4tutorial.cautionconditionlogic;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RefactorConditionLogic {

    @Test
    public void checkHashMapValue(){
        Map map = new HashMap();
        Iterator iterator = map.entrySet().iterator();
        map.put("A",new Long(3));
        map.put("B","21");
        assertContains(iterator,"A",3L);
        assertContains(iterator,"B","21");

    }

    private void assertContains(Iterator iterator, Object key, Object value) {
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            if(key.equals(entry.getKey())){
                Assertions.assertThat(entry.getValue()).isEqualTo(value);
                return;
            }
        Assertions.fail("Entry don't contain the key value of " + entry.getKey());
        }
    }

}
