
package listproject;

import java.util.*;

public class Activity1 {
    
    public static void main(String[] args) {
        List hl = new ArrayList();
        hl.add("Model Steam Locomotive");
        hl.add("Track");
        hl.add("Transformer");
        
        for(int i=0;i < hl.size(); i++){
            String s = (String)hl.get(i);
            System.out.println(s);
        }
    }
}
