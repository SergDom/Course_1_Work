public class  Main {


    public static int sumOfSalary(Employee [] arr) {
        int sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sumSalary = sumSalary + arr[i].getSalary();
            } else break;}
            return sumSalary;
        }

//    public static int minOfSalary(Employee[] salary) {
//        int salary[] = new Employee().getSalary();
//        int min=0;
//        for (int i = 0; i < salary.length; i++)
//            if (min>salary[i]);{
//        return min;}
//    }
//    public static int maxOfSalary(int[] employee) {
//        int salary[] = new Employee(salary);
//        int max=0;
//        for (int i = 0; i < salary.length; i++)
//            if (max<salary[i]);{
//        return max;}
//    }
//
//    public static int avrOfSalary(int[] employee) {
//        int sum=0;
//        for (int i = 0; i < employee.length; i++){
//            sum += i/employee.length;}
//        return sum;
//    }

        public static void main (String[]args){

           Employee[] employees = new Employee[10];

//            public static int listOfEmployee (Employee employee){
//                for (int i = 0; i < employees.length - 1; i++) {
//                    if (employees[i] != null)
//                         employees[i]=employee;
//                        break;
//                }
//            }
            Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 150000);
            Employee employee2 = new Employee("Dmitriev", "Sergey", "Aleksandrovich", 2, 160000);
            Employee employee3 = new Employee("Seleznev", "Aleksander", "Alekseevich", 3, 145000);
            Employee employee4 = new Employee("Petrov", "Ilia", "Sergeevich", 4, 180000);



            employees[0] = employee1;
            employees[1] = employee2;
            employees[2] = employee3;
            employees[3] = employee4;

//            toString(employees);

            for (int i = 0; i < employees.length - 1; i++)
                if (employees[i] != null)
                    System.out.println(employees[i]);

//            System.out.println(listOfEmployee());
            System.out.println("Количество сотрудников: " + Employee.id);

            System.out.println("Сумма затрат по зарплате: " + sumOfSalary(employees));

//            sumOfSalary(Employee(employees[i].getSalary()));

        }
    }

