public class Main {

    public static Employee[] employees= new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Илья Петрович", 1,50000);
        employees[1] = new Employee("Уточкин Томас Сомович", 1,45000);
        employees[2] = new Employee("Клопова Матильда Томовна", 2,30000);
        employees[3] = new Employee("Зорькин Владлен Бамович", 2,25000);
        employees[4] = new Employee("Сиропин Аркадий Эзопович", 3,45000);
        employees[5] = new Employee("Борода Тамара Кащеевна", 3,70000);
        employees[6] = new Employee("Цуканов Артем Сергеевич", 4,15000);
        employees[7] = new Employee("Коллайдер Сирано Ваганович", 4,40000);
        employees[8] = new Employee("Порода Жанна Агузаровна", 5,50000);
        employees[9] = new Employee("Пароход Василий Енисеевич", 5,50000);

        printEmployees();

        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary());

        System.out.println("Cотрудник с минимальной зарплатой: " + employees[minSalary()]);

        System.out.println("Cотрудник с максимальной зарплатой: " + employees[maxSalary()]);

        System.out.println("Cреднее значение зарплат: " + averageSalary());

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());

        }
    }

    public static void printEmployees(){

        for (int i = 0; i < employees.length; i++) {

            System.out.println(employees[i]);
        }
    }
    public static float sumSalary(){
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
             sum = sum + employees[i].getSalary();
        }
        return sum;
    }
    public static int minSalary(){
        float salary = 100000000;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                salary = employees[i].getSalary();
                index = i;
            }
        }
            return index;
    }
    public static int maxSalary(){
        float salary = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary) {
                salary = employees[i].getSalary();
                index = i;
            }
        }
        return index;
    }
    public static float averageSalary(){
        return sumSalary()/ employees.length;
    }

}