class Laptop
{
	String model;
	int price;
//	String serial;
	
	public String toString()
	{
//		return "Hey";
		return model+ " : "+price;
	}
  
	@Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((model == null) ? 0 : model.hashCode());
    result = prime * result + price;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Laptop other = (Laptop) obj;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (price != other.price)
      return false;
    return true;
  }

//   public boolean equals(Laptop that)
// 	{
// //		if(this.model.equals(that.model) && this.price==that.price) 
// //			return true;
// //		else
// //			return false;
		
// 		return this.model.equals(that.model) && this.price==that.price ;
// 	}
}
	
 public class objectclassequals1{
    public static void main(String[] args) {

    	Laptop obj=new Laptop();
    	obj.model="Lenevo Yoga";
    	obj.price=1000;
    	
    	Laptop obj2=new Laptop();
    	obj2.model="Lenevo Yogak";
 //   	obj2.model="Lenevo Yoga1";
    	obj2.price=1000;
    	
    	boolean result = obj.equals(obj2);
    	System.out.println(result);
    	System.out.println(obj.toString());
//   	System.out.println(obj);
    	
    }
}


  

