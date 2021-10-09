package practise.Task_1;

public class Main {
    public static void main(String[] args) {
        Employer president = new President();
        Employer manager = new Manager();
        Employer worker = new Worker();
        Employer[] employee = new Employer[3];
        employee[0] = president;
        employee[1] = manager;
        employee[2] = worker;
        for (int i = 0; i < employee.length; i++) {
            employee[i].Print();
        }
    }
}
