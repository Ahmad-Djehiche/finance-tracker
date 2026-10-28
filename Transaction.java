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
    public Transaction(int amount, String date, String category)
    {
        this.amount = amount;
        this.date = date;
        this.category = category;
    }


     // ----- acessor methods -----


    /**
     * returns the cost of the transaction
     */
    public void getAmount()
    {
        return amount;
    }

    /**
     * returns the date of the transaction
     */
    public void getDate()
    {
        return date;
    }

    /**
     * returns the category
     */
    public void getCategory()
    {
        return category;
    }

    /**
     * return the description
     */
    public void getDescription()
    {
        return description;
    }

}
