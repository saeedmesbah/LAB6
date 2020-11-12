
public class Doctor extends People{
    
    private String abillity;
    
    public Doctor(String lastname,String firstname,String location,String abillity,int age){
        super(firstname,lastname,location,age);
        this.abillity=abillity;
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Abillity: "+abillity);
    }
    
    
}
