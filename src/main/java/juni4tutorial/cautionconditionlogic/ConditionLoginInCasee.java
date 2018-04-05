package juni4tutorial.cautionconditionlogic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ConditionLoginInCasee {

    @Test
    public void testDictionary(){

        Map map = new HashMap();
        map.put("A",new Long(3));
        map.put("B","21");


        for (Iterator iterator = map.entrySet().iterator();iterator.hasNext();){

            Map.Entry entry = (Map.Entry) iterator.next();
            if(entry.getKey().equals("A"))
            {
                Assertions.assertEquals(3L,entry.getValue());
            }
            if(entry.getKey().equals("B"))
            {
                Assertions.assertEquals("21",entry.getValue());
            }


        }

        }

    }

