import java.util.*;

abstract class JobRole { }

class SoftwareEngineer extends JobRole { }
class DataScientist extends JobRole { }
class ProductManager extends JobRole { }

class Resume<T extends JobRole> {
    T role;
    Resume(T r) { role = r; }
}

class ScreeningSystem {
    public static void processRoles(List<? extends JobRole> list) {
        for (JobRole r : list)
            System.out.println("Processing: " + r.getClass().getSimpleName());
    }
}

