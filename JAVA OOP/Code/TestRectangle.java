class Rectangle{
    int width;
    int height;
    int area=0;
    void insertData(int w,int h){
        width = w;
        height = h;
        
    }
    // method
    void calculatorArea(){
        area = width*height;
    }
    // method
    void displayData(){
        System.out.println("width => "+width+"\theight => "+height+"\tarea => "+area);
    }
}


public class TestRectangle {
    public static void main(String[] args) {
        // create obj 
        Rectangle obj1 = new Rectangle();
        obj1.insertData(200, 200);
        obj1.calculatorArea();
        obj1.displayData();
        Rectangle obj2 = new Rectangle();
        obj2.insertData(300, 300);
        obj2.calculatorArea();
        obj2.displayData();
    }
}
