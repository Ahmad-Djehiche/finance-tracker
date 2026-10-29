import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        FinanceManager account = new FinanceManager();
        account.addTransaction(200, "29/10/2026", "Technology", null);
        account.addSubscription(15, "29/10/2026" , "Entertainment", null);
        account.addTransaction(130, "29/10/2026", "Technology", null);
        account.addTransaction(98, "29/10/2026", "entertainment", null);
        
        System.out.println(account.getTotalSpendingCategory("enTertainment"));
        System.out.println(account.getTotalSpendingCategory("technology"));

        account.getMonthlyBillables("11");
    }
}
