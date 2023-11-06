public class array_2D_EnhancedLoop {
    
    public static void main(String[] arg){

        int nums[][] = {
            {1,2,3,4},
            {7,8},
            {11,13,15},
            {36,87,25,75,27}
        };

        for(int a[] : nums)
        {
            for(int b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
