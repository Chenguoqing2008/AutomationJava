package juni4tutorial.spyskill;

import java.util.logging.Level;

public class DLog {
    private DLogTarget[] targets;

    public DLog(DLogTarget... targets){
        this.targets = targets;
    }

    public void write(Level level,String message){
        for(DLogTarget target:targets){
            target.write(level,message);
        }
    }
}
