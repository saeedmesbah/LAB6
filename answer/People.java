
public class People {
    
    private String firstname;
    private String lastname;
    private String location;
    private int age;
    
    
    public People(String firstname,String lastname,String location,int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.location=location;
        this.age=age;
    }
    
    
    public void setFirstName(String firstname){
        this.firstname=firstname;
    }
    public String getFirstName(){
        return firstname;
    }
    
    public void setLastName(String lastname){
        this.lastname=lastname;
    }
    public String getLastName(){
        return lastname;
    }
    
    public void setLocation(String location){
        this.location=location;
    }
    public String getLocation(){
        return location;
    }
    
    public void showInfo(){
        System.out.println("First Name: "+firstname);
        System.out.println("Last Name: "+firstname);
        System.out.println("Age: "+age);
        System.out.println("Location: "+location);
    }
    
}
