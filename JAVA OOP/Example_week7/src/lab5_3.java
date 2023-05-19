import java.util.Scanner;
import java.util.ArrayList;

public class lab5_3 {
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    ArrayList<Integer> resultArr = new ArrayList<Integer>();

    public void Sort(ArrayList<Integer> arr1, ArrayList<Integer> arr2){

        for(int i = 0; i < arr1.size(); i++){
            for(int j = i + 1; j < arr1.size(); j++){
                if(arr1.get(i) > arr1.get(j)){
                    int temp = arr1.get(i);
                    arr1.set(i, arr1.get(j));
                    arr1.set(j, temp);
                }
            }
        }

        for(int i = 0; i < arr2.size(); i++){
            for(int j = i + 1; j < arr2.size(); j++){
                if(arr2.get(i) > arr2.get(j)){
                    int temp = arr2.get(i);
                    arr2.set(i, arr2.get(j));
                    arr2.set(j, temp);
                }
            }
        }
    }

    public void Same(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        for(int i = 0; i < arr1.size(); i++){
            for(int j = 0; j < arr2.size(); j++){
                if(arr1.get(i) == arr2.get(j)){
                    resultArr.add(arr1.get(i));
            }
        }
    }
    }

    public static void main(String[] args) {
        lab5_3 obj = new lab5_3();
        Scanner sc = new Scanner(System.in);
        int x1 = 1;
        int x2 = 1;

        System.out.print("Input Array1: ");
        while(x1 != 0){
            x1 = sc.nextInt();
            if(x1 == 0){
                break;
            }
            obj.arr1.add(x1);
        }
        System.out.print("Input Array2: ");
        while(x2 != 0){
            x2 = sc.nextInt();
            if(x2 == 0){
                break;
            }
            obj.arr2.add(x2);
        }

        obj.Sort(obj.arr1, obj.arr2);
        obj.Same(obj.arr1, obj.arr2);

        //Print
        for(int i = 0; i < obj.resultArr.size(); i++) {
            System.out.print(obj.resultArr.get(i) + " ");
        }
    }
}
