import java.util.*;

public class Subject {
    private String name;
    private List<Module> modules;

    public Subject(String name) {
        this.name = name;
        this.modules = new ArrayList<>();
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public String getName() {
        return name;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void displayModules() {
        System.out.println("\n" + name + " Modules:");
        for (int i = 0; i < modules.size(); i++) {
            System.out.println((i + 1) + ". " + modules.get(i).getTitle());
        }
    }
}
