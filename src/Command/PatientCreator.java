package Command;
import java.util.Scanner;

import Model.Patient;

public class PatientCreator {
    int id;
    String Name;
    int Age;
    String Type;
    Scanner s = new Scanner(System.in);
    public void addPatient(){
        System.out.print("Добавление Пациента\n");
        System.out.print("Кличка: ");
        Name = s.nextLine();
        System.out.print("Возраст: ");
        Age = Integer.parseInt(s.nextLine());
        System.out.print("Вид животного: ");
        Type = s.nextLine();
        id = Patient.listPatients.size()+ 1;
        Patient patient = new Patient(id, Name, Age, Type);
        patient.addPatient(patient);
        System.out.println("Пациент добавлен");
    }
}
