
class Calc
{
    
    public int add(int nums[])
    {
       
        int result = 0; 
        for(int n : nums)
        {
            result = result + n;
        }
        return result;
    }
}



public class array_Anonymous {
    
    public static void main(String[] arg){


        Calc obj = new Calc();

// ak sathe jaji badhi value ne add karavamate array no use karavo
        int nums[] = {5,8,6,70};
        int result = obj.add(nums);
        // we write like this also for upper 2 line(27,28)
        // int result = obj.add(new int[]{5,8,6,70});
        System.out.println(result);


    }
}
