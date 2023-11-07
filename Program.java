import java.util.Arrays;
import java.util.Random;

class Program
{
    public static void shuffle(int numb[])
    {
        for(int i=numb.length-1;i>=1;i--)
        {
            Random rand=new Random();
            int j=rand.nextInt(i+1);
            swaping(numb,i,j);
        }
    }
    private static void swaping(int numb[],int i,int j)
    {
        int temp=numb[i];
        numb[i]=numb[j];
        numb[j]=temp;
    }
    public static void main(String[] args)
    {
        int numb[]={1,2,3,4,5,6};
        System.out.println("Array "+Arrays.toString(numb));
        shuffle(numb);
        System.out.println("Shuffled "+Arrays.toString(numb));
    }

}