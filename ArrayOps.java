public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {1, 2, 5 ,6 , 7, 7, 8, 8};
        System.out.println(secondMaxValue(array));
    
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        for(int i = 0; i<=n; i++){
        
            boolean isPresentFlag = false;
                for(int j = 0; j < array.length; j ++){
                     if (array[j] == i){
                    
                    isPresentFlag = true;
                  }

                 }   

            if(!isPresentFlag){
         
            return i;
            }

        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max = array [0];
        int countmax = 0;
        int secondMax = 0;
        for (int i = 0; i<= array.length - 1; i++) {
            if (array[i] > max){
                secondMax=max;
                max = array[i];
                countmax = 1;
            } else if (array[i]==max){
                countmax++;
            } else if (array[i]>secondMax && array[i] < max ){
                secondMax=array[i];
            } 
        } if (countmax >=2 ){
            return max;
        } else
        return  secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
