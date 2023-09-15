public class DiverseArray {
    public static int arraySum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int[] rowSums(int[][] array){
        int sum = 0;
        int[] array2 = new int[array.length];
        for(int i = 0; i < array.length; i++){
            array2[i] = arraySum(array[i]);
        }
        return array2;
    }

    public static boolean isDiverse(int[][] array){
        int [] array3 = rowSums(array);
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array3[i] == array3[j])
                    return false;
            }
        }
        return true;
    }
}
