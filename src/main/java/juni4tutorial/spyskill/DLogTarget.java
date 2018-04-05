package juni4tutorial.spyskill;

import java.util.logging.Level;

public interface DLogTarget {
    void write(Level level, String message);
}
