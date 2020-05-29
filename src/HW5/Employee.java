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
}




