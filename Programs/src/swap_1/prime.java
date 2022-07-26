package swap_1;

public class prime {

    public static void main(String[] args) {
        int num=5;
        int result=prime(num);
        if(result==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    public static int prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        return c;
    }

}
