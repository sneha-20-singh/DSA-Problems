package TwoDarrayProblems;
import java.util.*;
public class maximumWealth {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.print("enter the number of customer: ");
    int m = sc.nextInt();
 System.out.print("enter the number of banks per customer: ");
    int n= sc.nextInt();
    int [][] accounts = new int [m][n];
    //inputs for each customer accounts 
    for(int i=0;i<m;i++)
    {
        System.out.println("Customer "+(i+1)+ " balances: ");
        for(int j=0;j<n;j++)
        {
            accounts[i][j] = sc.nextInt();
        }
    }
    int maxWealthSoFar = 0; 
   for(int[] customer : accounts)
   {
     int currentWealth = 0;
     for(int bank: customer)
     {
        currentWealth +=bank;
     }
     maxWealthSoFar=Math.max(currentWealth, maxWealthSoFar);
   }

System.out.println("Maximum wealth is: "+ maxWealthSoFar);
sc.close();
    }
    
}
