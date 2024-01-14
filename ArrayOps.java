public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {1, 2, 5 ,6 , 7, 7, 8, 8};
        System.out.println(secondMaxValue(array));
        int [] arr1 = {1 , 2 , 3 , 4, 4, 4, 5,6 };
        int [] arr2 = {1, 2, 3, 4, 5,  };
        System.out.println(containsTheSameElements(arr1, arr2));
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
        int b = array2.length - 1 ;
        int  existcount = 0;
        for (int i = 0; i<= a; i++) {
            for (int j = 0 ; j<= b; j++){
                if (array1[i]==array2[j])
                existcount++;
            }
        } if (existcount==array1.length){
            return true;
        }  else
        return false;
    }  

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
