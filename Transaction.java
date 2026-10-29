/**
 *
 */

public class Transaction
{
    //fields
    private int amount; //cost of transaction in pence
    private String date; // dd/mm/yyyy
    private String category;
    private String description;

    /**
     * constructor for Transaction
     */
    public Transaction(int amount, String date, String category, String description)
    {
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public int getAmount()
    {
        return amount;
    }

    public String getDate()
    {
        return date;
    }

    public String getCategory()
    {
        return category;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDetails()
    {
        String details;
        
        details = "transaction details: 1. amount: " + getAmount() + " 2. date: " +getDate()+ " 3. category: "+getCategory()+ " 4. description: "+getDescription();
        
        return details;
    }
}
