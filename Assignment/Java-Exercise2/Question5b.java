package Exercise2;

public class Question5b {
    int x;
    int y;
    Question5b(int x,int y){
        super();
        this.x=x;
        this.y=y;
    }
    // copy constructor
    Question5b(Question5b b){
        this.x=b.x;
        this.y=b.y;
    }

    public static void main(String[] args) {
        Question5b Q1=new Question5b(10,20);
        Question5b Q2=new Question5b(Q1);
        System.out.println(Q1.x+"  " +Q1.y);
        System.out.println(Q2.x+"  "+Q2.y);
    }
}
