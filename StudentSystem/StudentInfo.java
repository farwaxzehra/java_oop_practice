package StudentSystem;
class Student{
    String Name;
    int age;

    Student(String Name, int age){
    this.Name = Name;
    this.age = age;
    }
    void printInfo(){
        System.out.println("Student Name: " + Name);
        System.out.println("Student's Age: " + age);
    }
}

class Book{
    String title;
    String author;
    int pages;


    Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void displayBook(){
        System.err.println("Title Name: " + title);
        System.err.println("Author Name: " + author);
        System.err.println("Pages: " + pages);
    }
}
public class StudentInfo{
    public static void main(String args []){
        Student s1 = new Student("Farwa", 18);
        Book b1 = new Book("The art of not overthinking","Sylvia Plath",200);

        s1.printInfo();
        b1.displayBook();
    
    }
}