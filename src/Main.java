public class Main {
    public static int sumOfSalary(int[] employee) {
        int sum=0;
        for (int i = 0; i < employee.length; i++){
            sum += i;}
        return sum;
    }
    public static int minOfSalary(int[] employee) {
        int salary[] = new Employee(salary);
        int min=0;
        for (int i = 0; i < salary.length; i++)
            if (min>salary[i]);{
        return min;}
    }
    public static int maxOfSalary(int[] employee) {
        int salary[] = new Employee(salary);
        int max=0;
        for (int i = 0; i < salary.length; i++)
            if (max<salary[i]);{
        return max;}
    }

    public static int avrOfSalary(int[] employee) {
        int sum=0;
        for (int i = 0; i < employee.length; i++){
            sum += i/employee.length;}
        return sum;
    }

    public static void main(String[] args) {
        int[] employee = new int[10];

//        public static void numberOfEmployees () {
//            System.out.println("Количество сотрудников: " +);
//        }
//
//        public static int listOfEmployees(int[] employee) {
//             int sum=0;
//            for (int i = 0; i < employee.length; i++){
//               sum += i;}
//            return sum;
//            }



            Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 150000);
            Employee employee2 = new Employee("Dmitriev", "Sergey", "Aleksandrovich", 2, 160000);
            Employee employee3 = new Employee("Seleznev", "Aleksandr", "Alekseevich", 2, 145000);


            System.out.println(employee1);
            System.out.println(employee2);
            System.out.println(employee3);


        }
    }
