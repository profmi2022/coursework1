public class EmployeeBook {

    private final Employee[] employees = new Employee[10];

    //Печать всех сотрудников
    public void printEmployees() {

        for (int i = 0; i < employees.length; i++) {

            System.out.println(employees[i]);
        }
    }

    //Сумма заплат всех сотрудников
    public float sumSalary() {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }

    //Минимальная заплата по всем сотрудникам
    public Employee minSalary() {
        float salary = 100000000;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < salary) {
                    salary = employees[i].getSalary();
                    index = i;
                }
            }
        return employees[index];
    }

    //Максимальная зарплата по всем сотрудникам
    public Employee maxSalary() {
        float salary = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > salary) {
                    salary = employees[i].getSalary();
                    index = i;
                }
            }
        return employees[index];
    }

    //Средняя зарплата по всем сотрудникам
    public float averageSalary() {
        float sumSalary = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
                sumSalary += employees[i].getSalary();
            }
        }
        if (count > 0) {
            return sumSalary / count;
        } else {
            return 0;
        }
    }

// Повышенная сложность курсовой работы

    //Индексация зарплаты всех сотрудников
    public void indexationSalary(float index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary(employees[i].getSalary() * (100 + index) / 100);
            }
        }
    }

    //Минимальная заплата по сотрудникам отдела
    public Employee minSalaryDepartment(int department) {
        float salary = 100000000;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < salary && employees[i].getDepartment() == department) {
                    salary = employees[i].getSalary();
                    index = i;
                }
            }
        return employees[index];
    }

    //Максимальная зарплата по сотрудникам отдела
    public Employee maxSalaryDepartment(int department) {
        float salary = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > salary && employees[i].getDepartment() == department) {
                    salary = employees[i].getSalary();
                    index = i;
                }
            }
        return employees[index];
    }

    //Сумма заплат сотрудников отдела
    public float sumSalaryDepartment(int department) {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                    sum = sum + employees[i].getSalary();
                }
            }
        return sum;
    }

    //Средняя зарплата по сотрудникам отдела
    public float averageSalaryDepartment(int department) {
        float sum = 0;
        int quantity = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                sum = sum + employees[i].getSalary();
                quantity++;
            }
        }
        if (quantity > 0) {
            return sum / quantity;
        } else {
            return 0;
        }
    }

    //Индексация зарплаты всех сотрудников отдела
    public void indexationSalaryDepartment(float index, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() * (100 + index) / 100);
            }
        }
    }

    //Печать всех сотрудников
    public void printEmployeesDepartment(int department) {
        System.out.println("Сотрудники отдела №" + department);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println("Сотрудник " + employees[i].getId() + ", ФИО: " + employees[i].getName() +
                        ", зарплата " + employees[i].getSalary());
            }
        }
    }

    //Все сотрудники с зарплатой меньше числа
    public void printEmployeesLess(float salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < salary) {
                System.out.println("Сотрудник " + employees[i].getId() + ", ФИО: " + employees[i].getName() +
                        ", зарплата " + employees[i].getSalary());
            }
        }
    }

    //Все сотрудники с зарплатой больше числа
    public void printEmployeesBetter(float salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= salary) {
                System.out.println("Сотрудник " + employees[i].getId() + ", ФИО: " + employees[i].getName() +
                        ", зарплата " + employees[i].getSalary());
            }
        }
    }

    //Создание нового сотрудника
    public void createEmployee(String name, int department, float salary) {

        int index = findFreeIndex();
        if (index == -1){
            System.out.println("Вакантных мест нет");
        } else {
            employees[index] = new Employee(name, department, salary);
        }
    }

        //Поиск свободного индекса в массиве сотрудников
        private int findFreeIndex () {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] == null) {
                    return i;
                }
            }
            return -1;
        }

    //Удаление сотрудника по имени
    public void removeEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                employees[i] = null;
            }
        }
    }

    //Удаление сотрудника по id
    public void removeEmployeeId(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    //Изменение зарплаты сотрудника по имени
    public void changeEmployeeSalary(String name, float salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                employees[i].setSalary(salary);
            }
        }
    }

    //Изменение отдела сотрудника по имени
    public void changeEmployeeDepartment(String name, int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                employees[i].setDepartment(department);
            }
        }
    }

    //Печать штатного расписания
    public void printEmployeesList() {
        for (int d = 1; d <= 5; d++) {
            System.out.println("Отдел №" + d);
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDepartment() == d) {
                    System.out.println(employees[i].getName());
                }
            }
        }
    }
}
