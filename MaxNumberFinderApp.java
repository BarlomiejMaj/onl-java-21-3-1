package loop;

public class MaxNumberFinderApp {
    public int max(int[] array){
        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, -7, -15, 13, 43, 9, 4};
        MaxNumberFinderApp n = new MaxNumberFinderApp();
        System.out.println(n.max(numbers));
    }
}
