import java.util.ArrayList;

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

    public void addTransaction(int amount, String date, String category)
    {
        Transaction transaction = new Transaction(amount, date, category);
        transactions.add(transaction);
    }

}
