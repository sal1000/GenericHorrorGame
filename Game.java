import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author Shelby Lutjen
 * @version 11/11/2017
 */
public class Game
{
    //All game variables declared here
    private boolean didWin;
    private Player player1;
    private String currentLocation;
    
    public Game() {
        //Initialize all game values to start defaults 
        this.didWin = false;
        this.player1 = new Player();
        this.currentLocation = ""; //Set initial location here
        //Add ability to save progress?
    }
    
    public void run() {
        //Print out dialogue "Hello, welcome to this generic game!" etc.
        //Now it's time to create your character...
        gameLoop(player1);
    }
    
    public void gameLoop(Player player) {
        //Loop until "win" boolean is true, then game is done!
        while(!didWin) {
            findStoryText(player1, currentLocation);
        }
    }
    
    public void findStoryText(Player player, String location) {
        ArrayList<Choice> choices = new ArrayList<Choice>();
        
        switch(location.toLowerCase()) {
            case "l1": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;
                
            case "l2": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;  
                
            case "l3": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;
                
            case "l4": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;
                
            case "l5": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;  
                
            case "l6": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;
                
            case "l7": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;
                
            case "l8": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;
                
            case "l9": //change to actual location name
                //what happens at this location?
                /*
                if() {
                    
                } else if() {
                    
                } else {
                    
                }
                */;
                break;
                
            //Add more location cases here
            
            default:
                ;
                break;
        }
        
        this.currentLocation = giveChoice(choices);
    }
    
    public String giveChoice(ArrayList<Choice> choices) {
        Choice selectedChoice = new Choice(); //Change this to choice made by player
        Scanner keyboard = new Scanner(System.in);
        //Get player's choice here, and use to set which choice they selected
        
        return selectedChoice.getLocationPointer();
    }
}
