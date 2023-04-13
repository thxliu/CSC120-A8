import java.util.ArrayList;
/**
 * public class to create a drone using methods described in the contract class
 */
public class Drone implements Contract{

    String name;
    int size; 
    ArrayList<String> myItems;
    String lastAction;

    /**
     * Constructor for a drone 
     * @param name name of drone
     * @param size size of drone 
     */
    public Drone(String name, int size) {
        this.name = name;
        this.size = size; 
        ArrayList<String> myItems = new ArrayList<String>();
        this.myItems = myItems;
        this.lastAction = lastAction;
        System.out.println("Your drone " + name + " of size " + size + " has been created!");
    }

    /**
     * Drone grabs an item
     * @param item item to be grabbed
     */
    public void grab(String item){
        if (!this.myItems.contains(item)){
            this.myItems.add(item);
            System.out.println(name + " has grabbed " + item + ".");
        }
        else{
            System.out.println(name + " has already grabbed " + item + ".");
        }
        this.lastAction = "grab";
    }

    /**
     * Drone drops an item 
     * @param item item to be dropped
     */
    public String drop(String item){
        if (this.myItems.contains(item)){
            System.out.println(name + " has dropped " + item + ".");
            this.lastAction = "drop";
            return item;
        }
        else {
            System.out.println(name + " cannot drop " + item + " because " + item + " was not picked up.");
            this.lastAction = "drop";
            return item;
        }
    }

    /**
     * Drone examines an item 
     * @param item item to be examined 
     */
    public void examine(String item){
        if (this.myItems.contains(item)) {
            System.out.println(name + " has examined " + item + ". Examination cleared.");

        }
        else {
            System.out.println("Error. " + name + " cannot examine an item it does not have.");
        }
        this.lastAction = "examine";
    }

    /**
     * Drone uses an item 
     * @param item item to be used
     */
    public void use(String item){
        if (this.myItems.contains(item)){
            System.out.println(item + " is being used. Usage complete.");
        }
        else {
            System.out.println("Error. " + name + " cannot use an item it does not have.");
        }
        this.lastAction = "use";
    }

    /**
     * Drone walks a certain direction if the direction is recognized 
     * @param direction direction to be walked in 
     * @return true if the direction is recognized, false if not 
     */
    public boolean walk(String direction){
        if (direction == "Forward"){
            System.out.println(name + " is moving " + direction + "." + name + " has moved " + direction + ".");
            this.lastAction = "walk";
            return true;
        }
        else if (direction == "Backward"){
            System.out.println(name + " is moving " + direction + "." + name + " has moved " + direction + ".");
            this.lastAction = "walk";
            return true;
        }
        else if (direction == "Left") {
            System.out.println(name + " is moving " + direction + "." + name + " has moved " + direction + ".");
            this.lastAction = "walk";
            return true;
        }
        else if (direction == "Right") {
            System.out.println(name + " is moving " + direction + "." + name + " has moved " + direction + ".");
            this.lastAction = "walk";
            return true;
        }
        else{
            System.out.println(direction + " not recognized. Please instruct " + name + " to move: Forward, Backward, Left, Right");
            this.lastAction = "walk";
            return false;
        }
    }

    /**
     * Drone flies to a specific coordinate if the coordinate is recognized
     * @param x x value (horizontal or longitude)
     * @param y y value (vertical or latitude)
     * @return true if the coordinates are recognized, false if not
     */
    public boolean fly(int x, int y){
        if (x >= 1 && y >= 1) {
            System.out.println(name + " has flown to coordinates " + x + ", " + y);
            this.lastAction = "fly";
            return true;
        }
        else {
            System.out.println("Coordinates " + x + ", " + y + " unrecognized. Please enter a number greater than or equal to 1.");
            this.lastAction = "fly";
            return false;
        }
    }

    /**
     * Drone shrinks
     */
    public Number shrink(){
        this.size = size - 2;
        System.out.println(name + " is now size " + size + ".");
        this.lastAction = "shrink";
        return this.size;
    }

    /**
     * Drone grows
     */
    public Number grow(){
        this.size = size + 2;
        System.out.println(name + " is now size " + size + ".");
        this.lastAction = "grow";
        return this.size;
    }

    /**
     * Drone rests by pausing the program for 2 seconds 
     */
    public void rest(){
        try {
            System.out.println(name + " is taking a rest.");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.lastAction = "rest";
    }

    /**
     * Last action of drone is undone 
     */
    public void undo(){
        if (this.lastAction.equals("grow")){
            this.shrink();
            System.out.println("Grow undone. " + name + " is now at size " + size + ".");
        }
        else if (this.lastAction.equals("shrink")) {
            this.grow();
            System.out.println("Shrink undone. " + name + " is now at size " + size + ".");
        }
        else if (this.lastAction.equals("grab")) {
            this.myItems.clear();
            System.out.println("Grab undone.");
        }
        else if (this.lastAction.equals("drop")) {
            this.myItems.retainAll(null);
            System.out.println("Drop undone.");
        }
        else if (this.lastAction.equals("examine")) {
            System.out.println("Examination undone.");
        }
        else if (this.lastAction.equals("use")) {
            System.out.println("Usage undone.");
        }
        else if (this.lastAction.equals("walk")) {
            System.out.println(name + " has returned to original position.");
        }
        else if (this.lastAction.equals("fly")) {
            System.out.println(name + " has returned to original position.");
        }
        else if (this.lastAction.equals("rest")) {
            System.out.println(name + " has returned to work.");
        }
        
    }

    public static void main(String[] args) {
        Drone myDrone = new Drone("Terry", 10);
        myDrone.grab("spoon");
        myDrone.drop("spoon");
        myDrone.drop("fork");
        myDrone.examine("spoon");
        myDrone.use("spoon");
        myDrone.walk("Forward");
        myDrone.walk("Sideways");
        myDrone.fly(12, 3);
        myDrone.fly(-1, 3);
        myDrone.rest();
        myDrone.shrink();
        myDrone.grow();
        myDrone.undo();
    }

    
}