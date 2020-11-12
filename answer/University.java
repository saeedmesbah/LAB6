
import java.util.*;

public class University {
    
    private String name;
    
    private ArrayList<Doctor> doctor;
    private ArrayList<Patient> patient;
    
    
    public University(String name){
        this.name=name;
    }
    
    public void addDoctor(Doctor doctor){
        this.doctor.add(doctor);
    }
    
    public void addPatient(Patient patient){
        this.patient.add(patient);
    }
    
    
    public void showUniversityInfo(){
        
        System.out.println("University Name: "+name);
        System.out.println("Number of Doctors: "+doctor.size());
        System.out.println("Number of Patient: "+patient.size());
        
        System.out.println("Patients: ");
        for(Patient p:patient){
            p.showInfo();
        }
        
        System.out.println("Doctors: ");
        for(Doctor d:doctor){
            d.showInfo();
        }
        
    }
    
    
}
