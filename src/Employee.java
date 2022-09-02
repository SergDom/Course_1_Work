public class Employee {
    private String lastName;
    private String firstName;
    private String surName;

    private int department;
    private int salary;
    static int id=1;

    public static int howManyEmployees() {
       return id++;
    }



    public Employee (String lastName, String firstName, String surName, int department, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.department = department;
        this.salary=salary;

    }
    public String getLastName() {return lastName;}
    public String getFirstName() {return firstName;}
    public String getSurName() {return surName;}

    public int getDepartment() {return department;}
    public void setDepartment(int department) {this.department = department;}

    public int getSalary() {return salary;}
    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public String toString() {
        return "Сотрудник: " + "Фамилия: " + lastName + " Имя: " + firstName + " Отчество: " + surName + " Отдел №: " + department +
                " Зарплата: " + salary + " номер сотрудника: " + howManyEmployees();
    }


}

