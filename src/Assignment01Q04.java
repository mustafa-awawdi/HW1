import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shift(int[] arr,int k){
        int[] temp= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            temp[(i+k)%arr.length] =arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] =temp[i];
        }
        return arr;
    }

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if ((direction != 'R' && direction != 'L') || array.length <=1)
            return array;
        move = move % array.length;
        if (move<0){
            move=-move;
            if (direction=='R') 
                direction='L';
            else 
                direction='R';
        }
        if (move == 0)
            return array;
        if (direction =='L')
            move=array.length-move;
        return shift(array, move);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}