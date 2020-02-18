package exercise1;

public class Question10 {
    int Add(int a,int b){
        int c= a+b;
        return c;
    }
    double Add(double a, double b){
        double c= a+b;
        return c;
    }
    float multiplying(float a, float b){
        float c= a*b;
        return c;
    }
    int multiplying(int a, int b){
        int c= a*b;
        return c;
    }
    String Concat(String a,String b){
        String c=a.concat(b);
        return c;
    }
    String concat (String a,String b,String c){
        String d =a.concat(b.concat(c));
        return d;
    }

    public static void main(String[] args) {
        Question10 q= new Question10();
        int c=q.Add(23,34);
        double d=q.Add(4.32424,657.433);
        int m=q.multiplying(32,34);
        float ml=q.multiplying(16.21f,32.67f);
        String A=q.Concat("incredible ","india");
         String B=q.concat("i love "," my ","india");
        System.out.println(c);
        System.out.println(d);
        System.out.println(m);
        System.out.println(ml);
        System.out.println(A);
        System.out.println(B);
    }
}
