class Student{
    String id;
    String name;
    int age;

    // Method insertData
    void insertData(String i,String n,int a){
        this.id = i;
        this.name = n;
        this.age = a;
    }

    // Method displayData
    void displayData(){
        System.out.println(id+" "+name+" "+age);
    }
}

public class TestStudent {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Todo code appliacation logic here

        // create object
        Student std1= new Student();
        Student std2= new Student();
        std1.insertData("01", "Sarif pochi", 20);
        std1.displayData();
        std2.insertData("02", "Syfaa pochi", 21);
        std2.displayData();
    }
}
