import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Solution {

    public static void main(String[] args)  {
      
        
        List<Integer> aas = new ArrayList<>();
        for (String z : args) {
            String[] x = z.replaceAll("[\\[\\]]", "").split(",");
            for (String f:x){
		if(!f.equals(""))
                aas.add(Integer.parseInt(f));
            }
        }
        Collections.sort(aas);
        System.out.println(aas);
    }
}

