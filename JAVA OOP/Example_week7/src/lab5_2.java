import java.util.Scanner;
import java.util.ArrayList;


class lab5_2{
    public void addstar(ArrayList<String> arr){
        for(int i = 1; i < arr.size()+1; i+=2){
            arr.add(i,"*");
        }
        System.out.println(arr.toString());
        // System.out.println();
    }

    public void removestar(ArrayList<String> arr){
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).equals("*")){
                arr.remove(i);
            }
        }
            System.out.println(arr.toString());
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        lab5_2 obj = new lab5_2();

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            String y = sc.nextLine();
            arr.add(y);
        }

        // for(int i = 0; i < arr.size(); i++){
        //     System.out.println(arr.get(i));
        // }
        // obj.addstar(arr);
        boolean checked = true;
        while(checked){
            System.out.print("Select: ");
            String x = sc.nextLine();
            if(x.equals("exit")){
                checked = false;
            }
            else if(x.equals("1")){
                obj.addstar(arr);
            }
            else if(x.equals("2")){
                obj.removestar(arr);
            }
            System.out.println();
        }
    }
}

