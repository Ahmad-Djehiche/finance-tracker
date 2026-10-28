/**
 *
 */

public class Subscription
{
    //fields
    private int amount; //cost of subscription in pence
    private int paySchedule; //days between each payment
    private String date; //inital date that subscription started on
    private String category;
    private String description;

    /**
     * constructor for Subscription
     */
    public Subscription(int amount, int paySchedule, String category, String description)
    {
        this.amount = amount;
        this.category = category;
        this.paySchedule = paySchedule;
        this.description = description;
    }

    public int getAmount()
    {
        return amount;
    }

    public int getPaySchedule()
    {
        return paySchedule;
    }

    public String getCategory()
    {
        return category;
    }

    public String getDescription()
    {
        return description;
    }

    public String getInitialDate()
    {
        return date;
    }
}
