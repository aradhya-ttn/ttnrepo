import java.util.ArrayList;
class SpecialStack{

   Integer stack[]= new Integer[10];
   int MAXSIZE =stack.length-1;
   int top=-1;
    void push(Integer data) {
        if(!isfull()) {
            top = top + 1;
            stack[top] = data;
            System.out.println("data inserted "+stack[top]);
        } else {
            System.out.println("Could not insert data, Stack is full.\n");
        }
    }
    void pop() {
        if(!isempty()) {
            System.out.println("data removed "+stack[top]);
            stack[top]=null;
            top = top - 1;

        } else {
            System.out.println("Could not retrieve data, Stack is empty.\n");
        }

    }
    boolean isempty() {

        if(top == -1)
            return true;
        else
            return false;
    }
    boolean isfull() {

        if(top == MAXSIZE)
            return true;
        else
            return false;
    }
    int getmin(){
        int min=stack[top];
        for (int i = 0; i <top ; i++) {
            if(stack[i]<min){
                min=stack[i];
            }
        }
        return min;
    }


}
public class Question8{
    public static void main(String[] args) {

        SpecialStack specialStack= new SpecialStack();
        specialStack.push(5);
        specialStack.push(7);
        specialStack.push(2);
        specialStack.push(4);
        System.out.println(specialStack.isfull());
        System.out.println(specialStack.isempty());
        System.out.println( specialStack.getmin());
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        System.out.println( specialStack.getmin());

    }
}