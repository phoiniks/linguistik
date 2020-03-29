package ngrammer;

import java.util.List;

public class NGrammer {
    String arr[], ngram;
    List<String> alist;
    int count;


    public NGrammer(){}


    public NGrammer(List<String> list, Integer cnt){
        arr   = new String [list.size()];
        alist = list;
        count = cnt;
    }


    public String[] getNGrams(){
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
        return arr;
    }
}
