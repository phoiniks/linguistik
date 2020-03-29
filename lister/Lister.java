package lister;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class Lister {
    List<String> lexicon;
    
    public Lister(){}
    
    public Lister(String string){
        Scanner scan;
        lexicon = new ArrayList<>();
        
        try{
            scan = new Scanner(new File(string));
            while(scan.hasNext()){
                lexicon.add(scan.next());
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }


    public List<String> getList(){
        return lexicon;
    }
}
