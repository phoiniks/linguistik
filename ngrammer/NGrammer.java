package ngrammer;

import java.util.List;

public class NGrammer {
    String arr[], ngram;
    
    public NGrammer(){}

    public NGrammer(List<String> alist, Integer count){
        arr = new String [alist.size()];
            for(int i = 0; i < alist.size(); i++){
                ngram = new String("");
                for(int j = 0; j < count; j++){
                    try{
                        if((i + count) > alist.size())
                            break;
                        ngram += alist.toArray()[i + j];
                        ngram += " ";
                    }catch(ArrayIndexOutOfBoundsException e){
                        System.exit(0);
                    }
                }
                arr[i] = ngram;                
            }
    }


    public String[] getNGrams(){
        return arr;
    }
}
