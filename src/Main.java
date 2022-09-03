public class Main {

    public static Employee[] sumOfSalary(Employee[] employee) {
            int sum = 0;
        for (int i = 0; i < employee.length; i++){
          sum += employee[i].getSalary();}
        return employee;
    }
//    public static int minOfSalary(int[] employee) {
//        int salary[] = new Employee(salary);
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
            Employee[] employee = new Employee[10];


            employee[0] = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 150000);
            employee[1] = new Employee("Dmitriev", "Sergey", "Aleksandrovich", 2, 160000);
            employee[2] = new Employee("Seleznev", "Aleksander", "Alekseevich", 3, 145000);
            employee[3] = new Employee("Petrov", "Ilia", "Sergeevich", 4, 180000);

            for (int i = 0; i < employee.length - 1; i++)
                if (employee[i] != null)
                    System.out.println(employee[i]);

            System.out.println("Количество сотрудников: " + Employee.id);

            System.out.println(sumOfSalary());

        }
    }

