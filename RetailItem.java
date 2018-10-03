/**
 * Michael Haugh
 * AP CS
 * CH3PC6
 * 10-2-18
 */
public class RetailItem {
    // ^This is the class.^
    
    private int numberOfWidgets;
    private int dayNumber;
    private int widgetGoal;
    // ^These are the variables.^
    
    public RetailItem(int n, int d, int w){
    // ^This is the constructor.^
        
        numberOfWidgets = n;
        dayNumber = d;
        widgetGoal = w;
    // ^These are the attributes.^
}
    public void setNumberOfWidgets(int n){
        numberOfWidgets = n;
        // ^This is the mutator method.^
    }
    
    public int getNumberOfWidgets(){
       return numberOfWidgets;
       // ^This is the accessor method.^
    }
    
    public void setDayNumber(int d){
        dayNumber = d;
        // ^This is the mutator method.^
    }
    
    public int getDayNumber(){
        return dayNumber;
        // ^This is the accessor method.^
    }
    
    public void setWidgetGoal(int w){
        widgetGoal = w;
        // ^This is the mutator method.^
    }
    
    public int getWidgetGoal(){
        return widgetGoal;
        // ^This is the accessor method.^
    }
        
    public int production(){
        numberOfWidgets += 160;
        return numberOfWidgets;
        // ^This is the mutator method.^
    }
        
    public int dailyAddition(){
        dayNumber += 1;
        return dayNumber;
        // ^This is the mutator method.^
    }
    
    public int timeRequired(){
        widgetGoal /= 160;
        return widgetGoal;
        // ^This is the mutator method.^
    }
}