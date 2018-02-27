
package house.rentals.system;

public class Rentclass{
    public int houseID;
    public int rentpaid;
    public int tenantid;
    public int rentarreas;
    public int rentduedate;
    
    public Rentclass(int houseID,int tenantid,int rentpaid,int rentarreas,int rentduedate){
        this.houseID=houseID;
        this.tenantid=tenantid;
        this.rentpaid=rentpaid;
        this.rentarreas=rentarreas;
        this.rentduedate=rentduedate;
    }
    
    public int gethouseID(){
        return houseID;
    }
    public int gettenantid(){
        return tenantid;
    }
    public int getrentpaid(){
        return rentpaid;
    }
    public int getrentarreas(){
        return rentarreas;
    }
    public int getrentduedate(){
        return rentduedate;
    }
    
}

