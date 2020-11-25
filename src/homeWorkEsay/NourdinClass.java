package homeWorkEsay;

public class NourdinClass {


    public static void main(String[] args) {
//        NourdinClass nounou1 =new NourdinClass();
//        String K=nounou1.karim;
//        String A=nounou1.amar;
//        NourdinClass nounou =new NourdinClass(K,A);
        NourdinClass nounou =new NourdinClass(karim,amar);


    }

    public static String karim = " karimAmechtouh";
    public  static String amar = " amarAmekrane";
    public  NourdinClass(){

    }
    public  NourdinClass(String karim, String amar){

        this.amar=amar;
        this.karim=karim;

    }
}
