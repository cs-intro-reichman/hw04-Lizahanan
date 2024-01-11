public class ArrayOps {
    public static void main(String[] args) {
        
    
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        for(int i = 0; i<=n; i++)
        {
            boolean isPresentFlag = false;
            for(int j = 0; j < array.length; j ++)
            {

                if (array[j] == i)
                {
                    isPresentFlag = true;
                }

            }
        if(!isPresentFlag)
        {
            return i;
        }

        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
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
