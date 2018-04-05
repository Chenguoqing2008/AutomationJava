package juni4tutorial.spyskill;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DLogTest {

    @Test
    public void writesEachMessageToTarge(){
        SpyTarget spy1 = new SpyTarget();
        SpyTarget spy2 = new SpyTarget();

        DLog dLog = new DLog(spy1,spy2);
        dLog.write(Level.FINE,"message");
        assertTrue(spy1.receive(Level.FINE,"message"));
        assertTrue(spy2.receive(Level.FINE,"message"));
    }

    private class SpyTarget implements DLogTarget {

        private List<String> log = new ArrayList<String>();

        @Override
        public void write(Level level, String message) {
            log.add(concatenated(level,message));
        }

        public boolean receive(Level level,String message){
            return log.contains(concatenated(level,message));
        }

        private String concatenated(Level level, String message) {
            return level+":"+message;
        }
    }
}
