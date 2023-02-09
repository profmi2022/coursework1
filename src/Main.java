public class Main {

    //БАЗОВАЯ И ПОВЫШЕННАЯ СЛОЖНОСТЬ КУРСОВОЙ РАБОТЫ

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
        indexationSalary(100);
        printEmployees();

        System.out.println("\nЗАДАНИЯ ПОВЫШЕННОЙ СЛОЖНОСТИ");
        System.out.println("\nЗадания 2.a,b,c,d");
        System.out.println("Cотрудник с минимальной зарплатой в отделе: " + employees[minSalaryDepartment(4)]);
        System.out.println("Cотрудник с максимальной зарплатой в отделе: " + employees[maxSalaryDepartment(4)]);
        System.out.println("Сумма затрат на зарплаты отдела в месяц: " + sumSalaryDepartment(4));
        System.out.println("Cреднее значение зарплат в отделе: " + averageSalaryDepartment(4));

        System.out.println("\nЗадания 2.e и 2.f");
        indexationSalaryDepartment(-20,4);
        printEmployeesDepartment(4);

        System.out.println("\nЗадание 3.а");
        printEmployeesLess(60000);

        System.out.println("\nЗадание 3.b");
        printEmployeesBetter(90000);
    }
    //Печать всех сотрудников
    public static void printEmployees(){

        for (int i = 0; i < employees.length; i++) {

            System.out.println(employees[i]);
        }
    }
    //Сумма заплат всех сотрудников
    public static float sumSalary(){
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
             sum = sum + employees[i].getSalary();
        }
        return sum;
    }
    //Минимальная заплата по всем сотрудникам
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
    //Максимальная зарплата по всем сотрудникам
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

    //Средняя зарплата по всем сотрудникам
    public static float averageSalary(){
        return sumSalary()/ employees.length;
    }

// Повышенная сложность курсовой работы

    //Индексация зарплаты всех сотрудников
    public static void indexationSalary(float index) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary()*(100+index)/100);
        }
    }

    //Минимальная заплата по сотрудникам отдела
    public static int minSalaryDepartment(int department){
        float salary = 100000000;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary && employees[i].getDepartment() == department) {
                salary = employees[i].getSalary();
                index = i;
            }
        }
        return index;
    }

    //Максимальная зарплата по сотрудникам отдела
    public static int maxSalaryDepartment(int department){
        float salary = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary && employees[i].getDepartment() == department) {
                salary = employees[i].getSalary();
                index = i;
            }
        }
        return index;
    }

    //Сумма заплат сотрудников отдела
    public static float sumSalaryDepartment(int department){
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    //Средняя зарплата по сотрудникам отдела
    public static float averageSalaryDepartment(int department){
        float sum = 0;
        int quantity = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
                quantity++;
            }
        }
        return sum/quantity;
    }

    //Индексация зарплаты всех сотрудников отдела
    public static void indexationSalaryDepartment(float index, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * (100 + index) / 100);
            }
        }
    }

    //Печать всех сотрудников
    public static void printEmployeesDepartment(int department){
        System.out.println("Сотрудники отдела №" + department);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Сотрудник " + employees[i].getId() + ", ФИО: " + employees[i].getName() +
                        ", зарплата " + employees[i].getSalary());
            }
        }
    }

    //Все сотрудники с зарплатой меньше числа
    public static void printEmployeesLess(float salary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println("Сотрудник " + employees[i].getId() + ", ФИО: " + employees[i].getName() +
                        ", зарплата " + employees[i].getSalary());
            }
        }
    }

    //Все сотрудники с зарплатой больше числа
    public static void printEmployeesBetter(float salary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salary) {
                System.out.println("Сотрудник " + employees[i].getId() + ", ФИО: " + employees[i].getName() +
                        ", зарплата " + employees[i].getSalary());
            }
        }
    }
}