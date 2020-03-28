import ngrammer.*;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<String> alist = new ArrayList<>();
        
        Lister ls = new Lister(args[0]);
        
        alist = ls.getList();

        NGrammer ngrammer = new NGrammer(alist, Integer.parseInt(args[1]));

        for(String str : ngrammer.getNGrams())
            System.out.println(str);
    }
}
