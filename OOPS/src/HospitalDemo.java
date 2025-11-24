
import java.util.*;
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();
    public void getPatientDetails() {
        System.out.printf("%s | %s | Age %d | Bill: %.2f%n", patientId, name, age, calculateBill());
    }
}

interface MedicalRecord {
    void addRecord(String entry);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRoomCharge;
    private List<String> records = new ArrayList<>();
    private String diagnosis; // sensitive -> encapsulated

    public InPatient(String id, String name, int age, int days, double roomCharge, String diagnosis) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyRoomCharge = roomCharge;
        this.diagnosis = diagnosis;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRoomCharge + 2000; // treatment flat
    }


    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    @Override
    public void addRecord(String entry) { records.add(entry); }

    @Override
    public List<String> viewRecords() { return Collections.unmodifiableList(records); }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String entry) { records.add(entry); }
    @Override
    public List<String> viewRecords() { return Collections.unmodifiableList(records); }
}

public class HospitalDemo {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient ip = new InPatient("P100", "Kiran", 45, 5, 3000, "Appendicitis");
        OutPatient op = new OutPatient("P101", "Meera", 30, 500);

        ip.addRecord("Surgery done on 2025-10-01");
        op.addRecord("Prescribed medication A");

        patients.add(ip);
        patients.add(op);

        for (Patient p : patients) {
            p.getPatientDetails();
            if (p instanceof MedicalRecord) {
                System.out.println(" Records: " + ((MedicalRecord) p).viewRecords());
            }
            System.out.println();
        }
    }
}

