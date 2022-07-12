package Command;
import java.util.Scanner;

import Model.Appointment;
import Model.Doctor;
import Model.Patient;

public class CommandReader {
    public static int startReading(){
        System.out.println("Ожидание команд");
        Scanner s = new Scanner(System.in);
        String command;
        while(true){
            command = s.nextLine();
            switch(command){
                case "CREATE_DOCTOR":
                    createDoctor();
                    break;
                case "CREATE_PATIENT":
                    createPatient();
                    break;
                case "CREATE_APPOINTMENT":
                    createAppointment();
                    break;
                case "0":
                    return 0;
                case "VIEW_DOCTORS":
                    Doctor.printDoctors();
                    break;
                case "VIEW_PATIENTS":
                    Patient.printPatients();
                    break;
                case "VIEW_APPOINTMENTS":
                    Appointment.printAllAppointments();
                    break;
                case "VIEW_APPOINTMENTS_BYID":
                    Appointment.printPatientAppointments();
                    break;
                case "EDIT_STATUS":
                    Appointment.editStatus();
                    break;           
                }
        }
    }
    private static void createDoctor(){
        DoctorCreator createDoctor = new DoctorCreator();
        createDoctor.addDoctor();
    }
    private static void createPatient(){
        PatientCreator createPatient = new PatientCreator();
        createPatient.addPatient();
    }
    private static void createAppointment(){
        AppointmentCreator createAppointment = new AppointmentCreator();
        createAppointment.addAppointment();
    }
}