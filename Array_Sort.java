import java.util.Arrays;
public class Array_Sort{
    public static void main(String args[]){ 
        int array[] = new int[] { 2,3,23,5,1,};
        Arrays.sort(array);  
        System.out.println("array are sorted");
        for(int i=0;i<array.length;i++)
        {  
            System.out.println(array[i]);


        }

    }
}
