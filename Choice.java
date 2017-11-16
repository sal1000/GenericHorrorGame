
/**
 * Write a description of class Choice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Choice
{
    private String choiceText;
    private String locationPointer;
    
    public Choice() {
        this.choiceText = "";
        this.locationPointer = "";
    }
    
    public String getChoiceText() {
        return this.choiceText;
    }
    
    public String getLocationPointer() {
        return this.locationPointer;
    }
    
    public String toString() {
        return this.getChoiceText();
    }
}
