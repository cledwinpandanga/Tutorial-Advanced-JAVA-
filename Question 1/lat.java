import java.util.*;

public class lat
{
    public static void main(String[] argv)
    {
        System.out.println("Bayar survey Jimmy");

        Scanner key = new Scanner(System.in);
        
        double cost = 10.0, pay = 0;
        int survey;

        System.out.println("Masukkan Jumlah : ");
        survey = key.nextInt();

        if (survey < 5)
        {
            pay += cost*survey;
        }

        else if (survey >= 5)
        {
            int val = survey%5;
            int val2 = survey/5;

            pay += val2*70.0 + val*10;
        }

        System.out.println("Pay = " + pay);

    }
}