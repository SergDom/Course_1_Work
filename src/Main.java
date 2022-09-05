public class  Main {

    public static void listOfEmployee (Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println((arr[i]));}
            }
        }
    public static double sumOfSalary(Employee [] arr) {
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sumSalary = sumSalary + arr[i].getSalary();
            } else break;}
            return sumSalary;
        }

    public static double minOfSalary(Employee[] arr) {
        double min = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()){
                    min = arr[i].getSalary();
                }
            }else break;}
            return min;
        }
    public static double maxOfSalary(Employee[] arr) {
        double max = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()){
                    max = arr[i].getSalary();
                }
            }else break;}
            return max;
        }

    public static double avrOfSalary(Employee[] arr) {
        double avrSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                avrSalary = avrSalary + arr[i].getSalary()/arr.length;
            } else break;}
        return avrSalary;
    }

    public static void employeeNames (Employee [] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != null) {
                System.out.println(arr[i].getLastName() +" " + arr[i].getFirstName() + " " + arr[i].getSurName());
            }
        }
        public static void indexOfSalary (Employee [] arr, double index) {
        for (int i = 0; i < arr.length; i++){
              arr[i].getSalary()= arr[i].getSalary() * index + arr[i].getSalary();}

                }

        public static void main (String[]args){

           Employee[] employees = new Employee[10];


            Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 150000);
            Employee employee2 = new Employee("Dmitriev", "Sergey", "Aleksandrovich", 2, 160000);
            Employee employee3 = new Employee("Seleznev", "Aleksander", "Alekseevich", 3, 145000);
            Employee employee4 = new Employee("Petrov", "Ilia", "Sergeevich", 4, 180000);
            Employee employee5 = new Employee("Vasechkin", "Anton", "Genadeivich", 5, 170000);
            Employee employee6 = new Employee("Ivanova", "Ylia", "Viktorovna", 5, 185000);
            Employee employee7 = new Employee("Osipova", "Galina", "Sergeevna", 2, 143000);
            Employee employee8 = new Employee("Smirnova", "Sofia", "Dmitreevna", 1, 167000);
            Employee employee9 = new Employee("Fedorova", "Diana", "Vladimirovna", 3, 125000);
            Employee employee10 = new Employee("Pavlova", "Elena", "Aleksandrovna", 4, 171000);

            employees[0] = employee1;
            employees[1] = employee2;
            employees[2] = employee3;
            employees[3] = employee4;
            employees[4] = employee5;
            employees[5] = employee6;
            employees[6] = employee7;
            employees[7] = employee8;
            employees[8] = employee9;
            employees[9] = employee10;

            listOfEmployee(employees);
            System.out.println("Количество сотрудников: " + Employee.id);
            System.out.println("==================================");
            System.out.println("Сумма затрат по зарплате: " + sumOfSalary(employees));
            System.out.println("Минимальная зарплата сотрудников: " + minOfSalary(employees));
            System.out.println("Максимальная зарплата сотрудников: " + maxOfSalary(employees));
            System.out.println("Средняя зарплата сотрудников: " + avrOfSalary(employees));
            System.out.println("==================================");
            employeeNames(employees);
            System.out.println("==================================");
//            System.out.println(indexOfSalary(employees, 0.2));


        }
    }

