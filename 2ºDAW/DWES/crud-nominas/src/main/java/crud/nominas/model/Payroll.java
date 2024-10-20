package crud.nominas.model;

public class Payroll {

    private static final int[] SUELDO_BASE = {50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000, 230000};

    public int calculateSalary(Employee empl) {
        return (SUELDO_BASE[empl.getCategory() - 1] + empl.getWorkYears() * 5000);
    }

}