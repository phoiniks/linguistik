package lister;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

public class Lister {
    List<String> lexicon;
    Scanner      scan;
    String       string;

    public Lister(){}


    public Lister(String str){
        lexicon = new ArrayList<>();
        string  = str;
    }


    public List<String> getList(){
        try{
            scan = new Scanner(new File(string));
            while(scan.hasNext()){
                lexicon.add(scan.next());
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        return lexicon;
    }
}
