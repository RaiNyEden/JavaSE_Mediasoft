package Model;
import java.time.Instant;
import java.util.LinkedList;

public class Doctor {
    private int id;
    private String name;
    private String surname;
    private Instant creationDate;
    public static LinkedList<Doctor> listDoctors = new LinkedList<Doctor>();

    public String getDoctorName(){
        return name;
    }

    public int getDoctorId(){
        return id;
    }  

    public String getDoctorSurname(){
        return surname;
    }
    
    public Instant getCreationDate() {
        return creationDate;
    }

    //Конструктор класса Доктор:
    public Doctor(int Id, String Name, String Surname){
        id = Id;
        name = Name;
        surname = Surname;
        creationDate = Instant.now();
    }

    public Doctor() {
    }

    public void addDoctor(Doctor doctor){
        listDoctors.add(doctor);
    }
    public static void printDoctors() {
        System.out.println("Доктора: ");
        for (Doctor doctor : listDoctors) {
            System.out.println("\t" + doctor.getDoctorId() + " " 
                                    + doctor.getDoctorName() + " " 
                                    + doctor.getDoctorSurname() + " "
                                    + doctor.getCreationDate());
        }
    }

}
