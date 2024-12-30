//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int index = MyArrays.binarySearch(new int[]{1, 3, 5, 7, 9}, 5);
        System.out.println("Index of 5: " + index); 

    }
}