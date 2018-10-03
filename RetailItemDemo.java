/**
 *Michael Haugh
 *CH3PC6
 *AP CS
 *10-2-18
 */
public class RetailItemDemo{
    //^This is the class.^
    
    public static void main(String[] args) {
        RetailItem r = new RetailItem (0, 1, 1760);
        // ^This is the object.^
        
        System.out.println("The initial Widget count was " + r.getNumberOfWidgets() 
                + " Widgets on day " + r.getDayNumber() + ".");     
        System.out.println("On day " + r.dailyAddition() + ", there will be a total of "
                + r.production() + " Widgets produced.");
        System.out.println("On day " + r.dailyAddition() + ", there will be a total of "
                + r.production() + " Widgets produced.");
        System.out.println("On day " + r.dailyAddition() + ", there will be a total of "
                + r.production() + " Widgets produced.");
        System.out.println("On day " + r.dailyAddition() + ", there will be a total of "
                + r.production() + " Widgets produced.");
        System.out.println("It will take a total of " + r.timeRequired() + 
                " days to reach the Widget production goal of 1760 Widgets.");
        // ^This is the print command.^
        }
    }