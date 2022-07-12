package Model;
import java.time.Instant;
import java.util.LinkedList;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String type;
    private Instant creationDate;
    public static LinkedList<Patient> listPatients = new LinkedList<Patient>();
    
    public int getPatientId(){
        return id;
    }  

    public String getPatientName(){
        return name;
    }

    public String getPatientType(){
        return type;
    }

    public int getPatientAge(){
        return age;
    } 

    public Instant getCreationDate() {
        return creationDate;
    }


    //Конструктор класса Пациент:
    public Patient(int Id, String Name, int Age, String Type){
        id = Id;
        name = Name;
        age = Age;
        type = Type;
        creationDate = Instant.now();
    }

    public Patient() {
    }

    public void addPatient(Patient patient){
        listPatients.add(patient);
    }

    public static void printPatients() {
        System.out.println("Пациенты: ");
        for (Patient patient : listPatients) {
            System.out.println("\t" + patient.getPatientId() + " "
                                    + patient.getPatientName() + " " 
                                    + patient.getPatientAge() + " " 
                                    + patient.getPatientType() + " "
                                    + patient.getCreationDate());
        }
    }

}
