package homeWorkEsay;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class REMOVE_DUP {
    public static void main(String[] args) {
        String Instring="This is a test";
        System.out.println(remove_duplicats (Instring));
        System.out.println(remove_Duplicates (Instring));

    }
    public static String remove_duplicats (String Instring){
        if(Instring ==null){return null;}
        String str="";
        int i,j;
        for(i=0;i<Instring.length(); i++){
            for(j=0;j<i;j++){
                if(Instring.toLowerCase().charAt(j)==Instring.toLowerCase().charAt(i)){ break;}
            }
            if(j==i){str=str+Instring.toLowerCase().charAt(j);}
        }
        return str;
    }
    //Method N02:
    public static String remove_Duplicates(String Instring){
        if(Instring == null){return null;}
        String str="";
        // I will us a LinkedHasSet beacaus it's kepes the input ordere
        char [] InstingArray =Instring.toLowerCase().toCharArray();
        Set <Character> InstringSet =new LinkedHashSet<>();
        for(char InChar : InstingArray){
          if(InstringSet.add(InChar)){str=str+InChar;}
        }
        return str;
    }
}
