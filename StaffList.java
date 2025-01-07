import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Staff {
    private String id;
    private String name;
    private String password;
    private int role;

    public Staff(String id, String name, String password, int role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getPassword() { return password; }
    public int getRole() { return role; }
}

public class Main {
    private Map<String, Staff> staffMap;
    private Scanner scanner;

    public Main() {
        staffMap = new HashMap<>();
        scanner = new Scanner(System.in);
        initializeStaff();
    }

    private void initializeStaff() {
        staffMap.put("A0", new Staff("A0", "Monica Farrow", "1234", 1));
        staffMap.put("A1", new Staff("A1", "David Browning", "1234", 2));
        staffMap.put("A3", new Staff("A3", "John Anderson", "3456", 3));
        staffMap.put("A4", new Staff("A4", "Helen Read", "4567", 3));
        staffMap.put("A5", new Staff("A5", "Emma White", "5678", 2));
        staffMap.put("A6", new Staff("A6", "Kate Green", "6789", 2));
        staffMap.put("A7", new Staff("A7", "Chris Black", "7890", 4));
        staffMap.put("A8", new Staff("A8", "Ruth Grey", "8901", 1));
    }

    public void login() {
        System.out.print("Enter Staff ID: ");
        String staffId = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (staffMap.containsKey(staffId)) {
            Staff staff = staffMap.get(staffId);
            if (staff.getPassword().equals(password)) {
                System.out.println("Login successful!");
                System.out.println("Welcome, " + staff.getName() + " (Role: " + staff.getRole() + ")");
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        } else {
            System.out.println("Invalid staff ID. Please try again.");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.login();
    }
}
