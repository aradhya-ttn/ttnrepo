package Exercise2;
interface bookInfo{
    public void bookName(String Name);
    public void bookPrice(int price);
    public void bookPublication(String Publisher);
}
interface LibraryInfo{
    public void bookCount(int count);
    public void memberCount(int  memCount);
}
interface memberInfo{
    public void studentCount(int stCount);
    public void teacherCount(int tCount);
}
class Book implements bookInfo{

    @Override
    public void bookName(String Name) {
        System.out.println("Book Name"+Name);
    }

    @Override
    public void bookPrice(int price) {
        System.out.println("Book Price"+price);
    }

    @Override
    public void bookPublication(String Publisher) {
        System.out.println("Book Publication" +Publisher);

    }
}
class Library implements LibraryInfo{

    @Override
    public void bookCount(int count) {
        System.out.println("Total no of books"+count);
    }

    @Override
    public void memberCount(int memCount) {
        System.out.println("Total no. of member"+memCount);
    }
}
class Member implements memberInfo{

    @Override
    public void studentCount(int stCount) {
        System.out.println("Total no of Student"+stCount);
    }

    @Override
    public void teacherCount(int tCount) {
        System.out.println("Total no of Teacher"+tCount);
    }
}
public class Question1 {
    public static void main(String[] args) {
        Book b= new Book();
        Library l= new Library();
        Member m=new Member();
        b.bookName("Professional");
        b.bookPrice(499);
        b.bookPublication("Arihant");
        l.bookCount(200);
        l.memberCount(20);
        m.studentCount(120);
        m.teacherCount(80);
    }
}
