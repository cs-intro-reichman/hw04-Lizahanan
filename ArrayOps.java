public class ArrayOps {
    public static void main(String[] args) {
        int [] arr = {4 ,4, 2 , 1, 3};
        int [] arr2 = {4 , 1, 2, 2 ,2 ,2,3};
        System.out.println(containsTheSameElements(arr, arr2));
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
        int a = array1.length - 1;
        int b = array2.length - 1;
        boolean firstDirection = true;
        boolean secondDirection = true;
        for (int i = 0; i<= a; i++) {
            boolean isPresentFlag = false;
            for (int j = 0 ; j<= b; j++){
                if (array1[i]==array2[j]){
                    isPresentFlag = true;
                    break;
                }

            }
            if (!isPresentFlag){
                firstDirection = false;
            }
        } 
        for (int i = 0; i<= b; i++) {
            boolean isPresentFlag = false;
            for (int j = 0 ; j<= a; j++){
                if (array2[i]==array1[j]){
                    isPresentFlag = true;
                    break;
                }

            }
            if (!isPresentFlag){
                secondDirection = false;
            }
        } 
        return (firstDirection && secondDirection);
    }

    public static boolean isSorted(int [] array) {
        int n = array.length;
        int max = array [0];
        int min = array [0];
        for (int i = 0; i<n;i++){
           if (max<=array[i]){
            max = array[i];
           } else if (min>=array[i]){
            min = array[i];
           } else break;
        } if (max == array[n-1] || min == array[n-1]) {
            return true;
        } else 
        return false;
    }

}
