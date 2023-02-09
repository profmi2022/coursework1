public class MainDifficult {

    //ОЧЕНЬ СЛОЖНЫЙ УРОВЕНЬ КУРСОВОЙ РАБОТЫ

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println("\nЗадание 4.a - Создание сотрудников\n");

        employeeBook.createEmployee("Иванов Илья Петрович", 1, 50000);
        employeeBook.createEmployee("Уточкин Томас Сомович", 1, 45000);
        employeeBook.createEmployee("Клопова Матильда Томовна", 2, 30000);
        employeeBook.createEmployee("Зорькин Владлен Бамович", 2, 25000);
        employeeBook.createEmployee("Сиропин Аркадий Эзопович", 3, 45000);
        employeeBook.createEmployee("Борода Тамара Кащеевна", 3, 70000);
        employeeBook.createEmployee("Цуканов Артем Сергеевич", 4, 15000);
        employeeBook.createEmployee("Коллайдер Сирано Ваганович", 4, 40000);
        employeeBook.createEmployee("Порода Жанна Агузаровна", 5, 50000);
        employeeBook.createEmployee("Пароход Василий Енисеевич", 5, 50000);

        employeeBook.printEmployees();

        System.out.println("\nЗадание 4.b - Удаление сотрудников\n");

        employeeBook.removeEmployee("Уточкин Томас Сомович");
        employeeBook.removeEmployeeId(4);
        employeeBook.printEmployees();

        System.out.println("\nЗадание 5.a и 5.b - Изменение зарплаты и отдела сотрудника\n");

        employeeBook.changeEmployeeSalary("Пароход Василий Енисеевич", 100000);
        employeeBook.changeEmployeeDepartment("Пароход Василий Енисеевич", 3);
        employeeBook.printEmployees();

        System.out.println("\nЗадание 6 - Печать ФИО сотрудников с сортировкой по отделам\n");

        employeeBook.printEmployeesList();


    }
}