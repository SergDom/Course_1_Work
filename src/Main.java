public class Main {
    public static int listOfEmployees(int[] employee) {
        int sum=0;
        for (int i = 0; i < employee.length; i++){
            sum += i;}
        return sum;
    }


    public static void main(String[] args) {
//        int[] employee = new int[10];

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



            Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 1500);

            System.out.println(employee1);

        }
    }
