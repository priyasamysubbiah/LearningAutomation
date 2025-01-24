package JavaPrograms;

import java.util.*;

public class CollectionsLearning {

    private Map<String, List<String>> hierarchy = new HashMap<>();

    public void addEmployee(String manager, String employee) {
        hierarchy.putIfAbsent(manager, new ArrayList<>());
        hierarchy.get(manager).add(employee);
    }

    public List<String> getEmployees(String manager) {
        return hierarchy.getOrDefault(manager, Collections.emptyList());
    }

    public void displayHierarchy() {
        for (Map.Entry<String, List<String>> entry : hierarchy.entrySet()) {
            System.out.println("Manager: " + entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.println("  - " + employee);
            }
        }
    }

    public static void main(String[] args) {
        CollectionsLearning org = new CollectionsLearning();
        org.addEmployee("Alice", "Bob");
        org.addEmployee("Alice", "Charlie");
        org.addEmployee("David", "Eve");

        System.out.println("Employees under Alice: " + org.getEmployees("Alice"));
        System.out.println("\nOrganization Hierarchy:");
        org.displayHierarchy();
    }

}
