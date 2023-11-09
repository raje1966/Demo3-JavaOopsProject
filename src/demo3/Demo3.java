package demo3;

class Bike 
{
    private String name;
    private int cost;
    private int mileage;
    
    public void setData(String x, int y, int z) 
    {
        name = x;
        cost = y;
        mileage = z;
    }
    
    public String getName()
    {
        return name;
    } 
    
    public int getCost() 
    {
        return cost;
    }
    
    public int getMileage() 
    {
        return mileage;
    }
    
}

public class Demo3 {

    
    public static void main(String[] args) {
        
        Bike bk = new Bike();
        bk.setData("Triump", 200000, 20);
        System.out.println(bk.getName());
        System.out.println(bk.getCost());
        System.out.println(bk.getMileage());
    }
    
}
