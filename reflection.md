Use this file to record your reflection on this assignment.

- Tell me about your class! What does it represent?

I made a drone class because I remember seeing ads from various fast food places i.e. Domino's about using drones for delivery services due to the growing popularity in drone services Amazon uses and thought it'd be interesting! Ideally, a drone must function well enough to deliver its packages to the correct person and make sure the package isn't damaged or unusable in any way and must be able to handle weather conditions (i.e. flying if it's snowy or muddy or walking if it's raining or snowing). It also must be able to accomodate different neighborhoods and living situations by manipulating its size. 

- What additional methods (if any) did you implement alongside those listed in the interface?

I didn't implement any additional methods, but I did add other attributes like an ArrayList to store all of the items so that when a drone picks up an item, it makes sure it isn't picking up a duplicate and that when a drone drops off an item, it makes sure the item is within its inventory. I also added a String lastAction whose value is that of the last used method, making the undo function work a lot smoother. 

- What worked, what didn't, what advice would you give someone taking this course in the future?
Figuring out how to store and access the lastAction was more difficult than I imagined. I first made it as an ArrayList so that if the last string to be appended into the ArrayList was equal to a specific action, that last action would be undone. However, I couldn't figure out how to determine if the last index of the ArrayList was equal to a method because I wasn't sure how or if I could convert the integer value of the index into its string value. Ultimately, I decided to make a String instead that updated itself every time a method is called, which I feel worked out best in the end. Overall, I thought this assignment went a lot more smoothly and I really enjoyed having the freedom to implement the methods how I wanted to and create my own class! 
