package homework__34_r;

import homework_34_company.Employee;

import java.util.Comparator;

public class ComparatorById implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(),e2.getId());
    }
}
