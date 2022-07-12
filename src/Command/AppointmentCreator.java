package Command;
import java.util.Scanner;

import Model.Appointment;
import Model.Doctor;
import Model.Patient;

public class AppointmentCreator {
    Scanner s = new Scanner(System.in);
    int doctorId;
    int buf;
    int patientId;
    String Date;
    Patient patient = new Patient();
    Doctor doctor = new Doctor();
    public void addAppointment(){
        patient = null;
        doctor = null;
        System.out.print("Назначение приема\n");
        System.out.print("Дата, время: ");
        Date = s.nextLine();
        System.out.print("Id пациента: ");
        patientId = s.nextInt();
        System.out.print("Id доктора: ");
        doctorId = s.nextInt();
        for(int i = 0; i < Doctor.listDoctors.size(); i++){
            if (doctorId == Doctor.listDoctors.get(i).getDoctorId()){
                doctor = Doctor.listDoctors.get(i);
            }
        }
        for(int i = 0; i < Patient.listPatients.size(); i++){
            if (patientId == Patient.listPatients.get(i).getPatientId()){
                patient = Patient.listPatients.get(i);
            }
        }
        if(patient != null && doctor != null){
            int id = Appointment.listAppointments.size() + 1;
            Appointment appointment = new Appointment(id,doctor, patient, Date);
            Appointment.addAppointment(appointment);
            System.out.println("Прием назначен");
        } else {
            System.out.print("Ошибка. Какие-то из данных введены неверно\n");
        }
    }
}
