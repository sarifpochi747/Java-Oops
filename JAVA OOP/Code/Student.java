
// Copy Contructor
public class Student{
    String id;
    String name;
    int age;
    double gpa;
    
    // Copy values without contructor
    public Student(String i,String n,int a,double g){
        id = i;
        name = n;
        age = a;
        gpa = g;
    }
    // Contructor 
    public Student(){
        
    }
    // Method Display
    public void Display(){
        System.out.println(id+"\t"+name+"\t"+age+"\t"+gpa); 
    }
    public static void main(String[] args) {
        Student std1= new Student("01","sarif pochi",20,3.3);
        Student std2 = new Student();
        std2.id = "3";
        std2.name = "sarif pochi";
        
        std1.Display();
        std2.Display();
    }
}