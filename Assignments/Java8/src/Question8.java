
interface  inter1{
    default  void Default(){
        System.out.println("this is inter1 default");
    }
}
interface  inter2{
    default  void Default(){
        System.out.println("this is inter2 default");
    }
}

public class Question8 implements inter1,inter2 {

    @Override
    public void Default() {
        System.out.println("this is Overridden");
    }

    public static void main(String[] args) {
        Question8 question8= new Question8();
        question8.Default();
    }
}
