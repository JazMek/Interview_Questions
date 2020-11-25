package arrays_Questions;

import java.util.*;

public class Duplicates_words {
    /*
    Given a String names[] = {"java","javaScript","Ruby","C","Python","java","java"};
    Print all the duplicates words
    Note: use a traditional for loop
    Note: use hashSet
     */

    public static void main(String[] args) {
        String names[] = {"java","javaScript","Ruby","C","Python","java","java","C","C","Python","java"};
        System.out.println(Arrays.toString(duplicates_words(names)));
        System.out.println(duplicates_Words (names));

    }
    public static String [] duplicates_words (String [] InputArray){
        if(InputArray==null) return null;
        int i,j;
        int index=0;
        int index1=0;
        for(i=0;i<InputArray.length;i++){
            for(j=0;j<i;j++){
                if(InputArray[j]==InputArray[i]){ break;}
            }
            if (j!=i){InputArray[index++]=InputArray[i];}
        }
        String [] dup_words= new String[index];
        for(i=0;i<index;i++){
        dup_words[i]=InputArray[i];}
        for(i=0;i<index;i++){
            for(j=0;j<i;j++){
                if(dup_words[j]==dup_words[i]){ break;}
            }
            if (j==i){dup_words[index1++]=dup_words[i];}
        }
        String [] dup_words1= new String[index1];
        for(i=0;i<index1;i++){
            dup_words1[i]=dup_words[i];}
        return dup_words1;
    }
    public static String [] Duplicates_words (String [] InputArray){
        if(InputArray==null) return null;
        int [] count =new int[InputArray.length];
        int i,j;
        int index=0;
        for(i=0;i<InputArray.length;i++){
            for(j=i+1;j<InputArray.length-1;j++){
            if(InputArray[j]==InputArray[i]){count[i]++;}
            }
        }
        for(i=0;i<InputArray.length;i++){
            if(count[i]!=1){index++;}
        }
        String []dup_words =new String[index];
        for(i=0;i<index;i++){
            if(count[i]!=0){dup_words[i]=InputArray[i];}
        }

        return dup_words;
    }
    public static Set duplicates_Words (String [] InputArray){
        if(InputArray==null) return null;
        Set<String> Removed_dup_Words = new HashSet<>();
        Set<String> Dup_Words = new HashSet<>();
        for(String Inp:InputArray ){
            if( !Removed_dup_Words.add(Inp)){Dup_Words.add(Inp);}
        }

       return  Dup_Words;
    }
    public static void duplElmUsingHashMap(String names[]) {
//3: using HashMap:O(2n)
        Map<String, Integer> storeMap = new HashMap<String, Integer>();
        for (String name : names) {
            Integer count = storeMap.get(name);
            if (count == null) {
                storeMap.put(name, 1);
            } else {
                storeMap.put(name, ++count);
            }
        }
//get the values from this HashMap we have to use entrySet:
        Set<Map.Entry<String, Integer>> entrySet = storeMap.entrySet();
//to illiterate it we have to use forLoop:
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(" duplicate element is: " + entry.getKey()+" times repeated: "+entry.getValue());
            }
        }
     }
  }
