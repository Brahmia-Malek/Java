public class Car{
    private int gas;
    

public Car(){
    this.gas=10;
}
public void Status(){
     System.out.println("Gas remaining: " + gas + "/10");
}
  public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}