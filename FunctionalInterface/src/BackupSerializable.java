
interface BackupSerializable { }
class UserData implements BackupSerializable {
    String name;
    int age;
}
class BackupManager {
    void backup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up object...");
        } else {
            System.out.println("Object NOT allowed for backup.");
        }
    }
}

