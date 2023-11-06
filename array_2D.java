public class array_2D {
    
    public static void main(String[] arg){

        int nums[][] = new int[3][2];
        // value assain work
        nums[0][0] = 5;
        nums[0][1] = 4;
        nums[1][0] = 7;
        nums[1][1] = 10;
        nums[2][0] = 85;
        nums[2][1] = 99;

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=1; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }









        // If we write element when we create array

        int num[][] = {
            {1,2},
            {4,5},
            {7,8}
        };

        for(int a=0; a<=2; a++)
        {
            for(int b=0; b<=1; b++)
            {
                System.out.print(num[a][b] + " ");
            }
            System.out.println();
        }













        // jecma array (when number of rows are different numbers of capacity)


        int number[][] = {
            {1,2,9,10},
            {4,5},
            {7,8,13}
        };

        for(int x=0; x<=2; x++)
        {
            for(int y=0; y<number[x].length; y++)
            {
                System.out.print(number[x][y] + " ");
            }
            System.out.println();
        }

        // if jecma is come in after write array so we can write like...
        // int number[][] = new int[3][];
        // nums[0] = new int[4];
        // nums[0] = new int[2];
        // nums[1] = new int[3];
        // now declare value...


    }
}
