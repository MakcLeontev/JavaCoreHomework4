import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        MyArray myArray = new MyArray();
        String [][]array = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        try {
            myArray.arrayTransformation(array);
        }catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }
}