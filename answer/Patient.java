import java.util.*;

public class Patient extends People{
    
    private MedicalRecord medical;
    private ArrayList<Doctor> patientDoctor;
    private String insurance;
    private String education;
    
    public Patient(String lastname,String firstname,String location,String insurance,String education,int age){
        super(firstname,lastname,location,age);
        this.insurance=insurance;
        this.education=education;
    }
    
    public void getMedicalRecord(MedicalRecord medical){
        this.medical=medical;
    }
    
    public void addDoctor(Doctor doctor){
        patientDoctor.add(doctor);
    }
    
    public void showPatientDoctorInfo(String firstname,String lastname){
        for(Doctor d:patientDoctor){
            if(d.getFirstName().equals(firstname)){
                if(d.getLastName().equals(lastname)){
                    d.showInfo();
                }
            }
        }
    }
    
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Education: "+education);
        System.out.println("Isurance: "+insurance);
        System.out.println(""+medical.toString());
        for(Doctor d:patientDoctor){
            d.showInfo();
        }
    }
    
    
}
