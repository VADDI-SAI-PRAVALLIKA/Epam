package HouseConstructionCost;

public class Gentrate{  
    public double cla(String s,int cost1){  
      Material planFactory = new Material();    
  
      TotalCost p = planFactory.Type(s);  
      p.getCost();
           double d=p.Calculate(cost1); 
           return (d);
            }  
    }