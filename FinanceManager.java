import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */
public class FinanceManager
{
    //fields
    private ArrayList<Transaction> transactions;
    private ArrayList<Subscription> subscriptions;

    /**
     * constructor for FinanceManager
     */
    public FinanceManager()
    {
        transactions = new ArrayList<>();
        subscriptions = new ArrayList<>();
    }

    public void addTransaction(int amount, String date, String category, String description)
    {
        Transaction transaction = new Transaction(amount, date, category, description);
        transactions.add(transaction);
    }

    public void addSubscription(int amount, String date, String category, String description)
    {
        Subscription subscription = new Subscription(amount, date, category, description);
        subscriptions.add(subscription);
    }

    public int getTotalSpendingCategory(String category)
    {   
        int total = 0; 
        for (Transaction transaction : transactions){
            if (transaction.getCategory().equalsIgnoreCase(category)){
                total = total + transaction.getAmount();
            }
        }
        for (Subscription subscription : subscriptions){
            if (subscription.getCategory().equalsIgnoreCase(category)){
                total = total + subscription.getAmount();
            }
        }
        return total;
    }

    public void getMonthlyBillables(String month)
    {
        for (Transaction transaction : transactions){
            if (transaction.getDate().contains("/"+month+"/")){
                System.out.println(transaction.getDetails());
            }
        }

        for (Subscription subscription : subscriptions){
            if (subscription.getBillableMonths().contains(Integer.parseInt(month))){
                System.out.println(subscription.getDetails());
            }
        }
    }
    

    
}
