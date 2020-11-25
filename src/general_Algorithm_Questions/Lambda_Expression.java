package general_Algorithm_Questions;
import java.util.function.Predicate;

public class Lambda_Expression {

    public static void main(String[] args) {


        //Example Using  Predicate predefined interface
        Predicate<Integer> p=i-> i<30;
        p.test(20);
        System.out.println(p.test(20));
        //using simple condition
        Predicate<String> ps=s -> s.length()>4 ;
       //using multiples conditions
        Predicate<String> ps1=s -> (s.length()>4 && s.length()<6);
        String [] names={"karim","ibrahi","amar","rachid","aghilas","nourdin","kiki","joy","darbouka"};
        for(String name : names){
            if(ps1.test(name)) System.out.println(name);
        }


    }


}
