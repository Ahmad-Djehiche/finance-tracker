/**
 *
 */

public class Transaction
{
    //fields
    private int amount; //cost of transaction in pence
    private String date;
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

}
