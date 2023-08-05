public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item( String name, double price){
        this.name=name;
        this.price=price
    }
    
    // GETTERS & SETTERS  - for name and price
    public String getName(){
  return this.name;
}

public void setName(String newName){
  this.name = newName;
}
  public String getPrice(){
  return this.price;
}

public void setName(String newPrice){
  this.name = newPrice;
}  
}
