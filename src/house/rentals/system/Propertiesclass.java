
package house.rentals.system;


public class Propertiesclass {
    

   
    public String propertyname;
    public String propertylocation;
    public String propertytype;
    public int managersid;
  
   
   public Propertiesclass (String propertyname ,String propertylocation ,String propertytype ,int managersid ){
        this.propertyname=propertyname;
        this.propertylocation=propertylocation;
        this.propertytype=propertytype;
        this.managersid=managersid;      
    }
   public String getpropertyname(){
       return propertyname;
   }
   public String getpropertylocation(){
       return propertylocation;
   }
   public String getpropertytype(){
       return propertytype;
   }
   public int getmanagersid(){
       return managersid;
   }
   
   
}

