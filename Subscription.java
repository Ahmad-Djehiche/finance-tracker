import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 */

public class Subscription
{
    //fields
    private int amount; //cost of subscription in pence
    private String date; //inital date that subscription started on
    private String category;
    private String description;
    private ArrayList<Integer> billableMonths; 

    /**
     * constructor for Subscription
     */
    public Subscription(int amount, String date, String category, String description)
    {
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
        billableMonths = new ArrayList<>();


        for (int i = getMonth(date);i < 13; i++){
            billableMonths.add(i);
        }

        for (int integer : billableMonths){
            System.out.println(integer);
        }
    }

    public int getAmount()
    {
        return amount;
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

    public ArrayList<Integer> getBillableMonths()
    {
        return billableMonths;
    }

    public String getDetails()
    {
        String details;
        
        details = "subscription details: 1. amount: " + getAmount() + " 2. date: " +getInitialDate()+ " 3. category: "+getCategory()+ " 4. description: "+getDescription();
        
        return details;
    }

    public int getMonth(String date)
    {
        String [] characters = date.split("/");
        int month = Integer.parseInt(characters[1]);

        return month;
    }
}
