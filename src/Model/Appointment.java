package Model;
import java.util.LinkedList;
import java.util.Scanner;

public class Appointment{
    public static LinkedList<Appointment> listAppointments = new LinkedList<Appointment>();
    private Doctor doctor = new Doctor();
    private Patient patient = new Patient();
    private String date;
    private String status;
    private int id;

    public int getId() {
        return id;
    }
    public String getDate() {
        return date;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getStatus() {
        return status;
    }

    public Appointment(int Id, Doctor Doctor,Patient Patient,String Date){
        id = Id;
        doctor = Doctor;
        patient = Patient;
        date = Date;
        status = "Новый";
    }

    public static void addAppointment(Appointment appointment){
        listAppointments.add(appointment);
    }

    public static void printAllAppointments() {
        System.out.println("Записи приемов: ");
        for (Appointment appointment : listAppointments) {
            System.out.println("\t"+appointment.getId() + " Доктор:" + appointment.getDoctor().getDoctorName() + " "
                                    + appointment.getDoctor().getDoctorSurname() + " Пациент: "  
                                    + appointment.getPatient().getPatientName() + " Записан на "
                                    + appointment.getDate() + " Статус: "
                                    + appointment.getStatus());
        }
    }

    public static void printPatientAppointments() {
        Scanner s = new Scanner(System.in);
        System.out.print("Id пациента: ");
        int id = s.nextInt();
        System.out.println("Записи приемов: ");
        for(int i = 0; i < listAppointments.size(); i++){
            if (id == listAppointments.get(i).getPatient().getPatientId()){
                System.out.println("\t"+ listAppointments.get(i).getId() + " Доктор:" + listAppointments.get(i).getDoctor().getDoctorName() + " "
                                        + listAppointments.get(i).getDoctor().getDoctorSurname() + " Пациент: "  
                                        + listAppointments.get(i).getPatient().getPatientName() + " Записан на "
                                        + listAppointments.get(i).getDate() + " Статус: "
                                        + listAppointments.get(i).getStatus());
                }
            }
        }
    
    public static void editStatus(){
        Scanner s = new Scanner(System.in);
        System.out.print("Новый статус: ");
        String status = s.nextLine();
        System.out.print("Id приема: ");
        int id = s.nextInt();
        for(int i = 0; i < listAppointments.size(); i++){
            if (id == listAppointments.get(i).getId()){
                listAppointments.get(i).status = status; 
                System.out.println("\t"+ listAppointments.get(i).getId() + " Доктор:" + listAppointments.get(i).getDoctor().getDoctorName() + " "
                                        + listAppointments.get(i).getDoctor().getDoctorSurname() + " Пациент: "  
                                        + listAppointments.get(i).getPatient().getPatientName() + " Записан на "
                                        + listAppointments.get(i).getDate() + " Статус: "
                                        + listAppointments.get(i).getStatus());
                }
            }
        }
}
