
package game;

import java.io.Serializable;

/**
 *
 * @author JGUTIERRGARC
 */
public class Potato implements Serializable {
    
        private String id;
        private int remainingTime;
        
        public Potato(String anId, int aRemainingTime){
            id = anId;
            remainingTime = aRemainingTime;
        }
        
        public String getId(){
            return id;
        }

        public void decreaseRemainingTime(){
            remainingTime--;
        }
        
        public boolean isDropped(){
            return (remainingTime==0);
        }
 }

