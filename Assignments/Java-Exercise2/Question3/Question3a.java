package Exercise2.Question3;

public class Question3a {
    public static void main(String[] args) {
        try{
            Class.forName("Assessment");
        }
        catch(ClassNotFoundException cne){
            cne.printStackTrace();
        }
    }
}
