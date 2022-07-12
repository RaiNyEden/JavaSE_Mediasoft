package Command;
import java.util.Scanner;

import Model.Doctor;

public class DoctorCreator {
    Scanner s = new Scanner(System.in);
    String Name;
    String Surname; 
    int id;
    public void addDoctor(){
        System.out.print("Добавление Доктора\n");
        System.out.print("Имя: ");
        Name = s.nextLine();
        System.out.print("Фамилия: ");
        Surname = s.nextLine();
        id = Doctor.listDoctors.size()+ 1;
        Doctor doctor = new Doctor(id,Name, Surname);
        doctor.addDoctor(doctor);
        System.out.println("Доктор добавлен");
    }
}
