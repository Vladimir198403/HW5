package HW5;

public class Employee {

    String name;
    String profession;
    String email;
    String telephone;
    int salary;
    int age;

    public Employee(String name, String profession, String email, String telephone, long salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.telephone = telephone;
        this.salary = (int) salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + "; Профессия: " + profession + "; Номер телефона:  " + telephone + "; email: " + email + "; Уровень дохода: " + salary + "; age: " + age);
    }

    public int getAge() {  //Создали "геттер" для "age"
        return age;
    }


    public static class Main {
        public static void main(String[] args) {
            Employee[] peoples = new Employee[5];
            //для каждой ячейки массива задаем объект 2. Конструктор класса должен заполнять эти поля при создании объекта;
            peoples[0] = new Employee("ivan ivanov", "Tokar", "ivanov@yandex.ru", "+79451233211", 80000, 36);
            peoples[1] = new Employee("Aleksandr Aleshin", "Chef engeneer", "aleshin@yandex.ru", "+79451233212", 100000, 41);
            peoples[2] = new Employee("Antonov Anton", "Worker", "antonov@yandex.ru", "+79451233213", 60000, 25);
            peoples[3] = new Employee("Petrov Petr", "Director", "petrov@yandex.ru", "+79451233214", 1000000, 68);
            peoples[4] = new Employee("Andreev Andrey", "Driver", "driver@yandex.ru", "+7945123321", 60000, 45);
            for (Employee employee : peoples) {
                if (employee.getAge() > 40) {
                    employee.printInfo();
                }
            }
        }
    }
}



