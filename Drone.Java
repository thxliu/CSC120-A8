public class Drone implements Contract{

    String name
    int size 

    public Drone(String name, int size) {
        this.name = name;
        this.size = size 
        System.out.println("Your drone " + name + "of size " + size + " has been created!")
    }

    void grab(String item){
        System.out.println(name + " has grabbed " + item + ".")
    }

    String drop(String item){
        System.out.println(name + " has dropped " + item ".")
    }

    void examine(String item){
        
    }
    void use(String item);
    boolean walk(String direction);
    boolean fly(int x, int y);
    Number shrink();
    Number grow();
    void rest(){

    }
    void undo(){
        String lastAction; 
        if (this.lastAction.equals("grow")){
            shrink()
        }
        else if 
    }

    
}