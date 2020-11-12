
import java.util.*;

public class MedicalRecord {
    
    private ArrayList<String> medicine;
    
    enum sickness{
        ORTHOPAEDICS,
        HEART,
        KIDNEY,
        WOMEN,
        DIGESTION,
        ETC
    }
    private sickness sick;
    
    enum level{
        HIGHT,
        MEDIUME,
        LOW
    }
    private level lev;
    
    public MedicalRecord(String sickness,String level){
        switch(sickness){
                case "digestion":
                    sick=sick.DIGESTION;
                    break;
                    
                case "heart":
                    sick=sick.HEART;
                    break;
                    
                case "kidney":
                    sick=sick.KIDNEY;
                    break;
                    
                case "orthopaedics":
                    sick=sick.ORTHOPAEDICS;
                    break;
                    
                case "women":
                    sick=sick.WOMEN;
                    break;
                
                default:
                    sick=sick.ETC;
                    break;
                    
        }
        
        switch(level){
            case "hight":
                lev=lev.HIGHT;
                break;
            
            case "mediume":
                lev=lev.MEDIUME;
                break;
                
            case "lew":
                lev=lev.LOW;
                break;
                
            default:
                break;
                        
        }
    }
    
    public void getSickness(){
        System.out.println(" "+sick);
    }
    
    public void getLevel(){
        System.out.println(" "+lev);
    }
    
    @Override
    public String toString(){
        String s="Medicines: ";
        if(medicine.isEmpty()){
            s=s+"null";
        }
        else{
            for(String i:medicine){
                s=s+"-"+i;
            }
        }
        s=s+" Sickness: "+sick+" Level: "+lev;
        return s;
    }
    
    
}
