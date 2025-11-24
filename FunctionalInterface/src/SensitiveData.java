// Custom marker interface
interface SensitiveData { }

class SalaryData implements SensitiveData {
    double salary;
}

class EncryptionService {
    void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("Storing normally...");
        }
    }
}

