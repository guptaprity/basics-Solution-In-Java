import java.util.*;
 
public class Min{
    public static int getMin(int numbers[]) {
        int min= Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(min>numbers[i]){
                min=numbers[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int numbers[] = {6, 8, 4, 3,8, 9};
        System.out.println("Min Value "+getMin(numbers));
    }
}
