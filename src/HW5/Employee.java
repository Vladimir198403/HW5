package HW5;

public class Employee {


    String Name;
    String Profession;
    String email;
    String Telephone;
    int Salary;
    int Age;

//    //ввод данных о сотруднике
//    void GetData() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("\n\tEnter Employee Name : ");
//        Name = sc.nextLine();
//
//        System.out.print("\n\tEnter Employee Profession : ");
//        Profession = sc.nextLine();
//
//        System.out.print("\n\tEnter Employee email : ");
//        email = sc.nextLine();
//
//        System.out.print("\n\tEnter Employee Telephone : ");
//        Telephone = Long.parseLong(sc.nextLine());
//
//        System.out.print("\n\tEnter Employee Salary : ");
//        Salary = Long.parseLong(sc.nextLine());
//
//        System.out.print("\n\tEnter Employee Age : ");
//        Age = Integer.parseInt(sc.nextLine());
//    }
//
//    //выводим информацию об объекте в консоль
//    void PutData() {
//        System.out.print("\n\tEmployee Name : " + Name);
//        System.out.print("\n\tEmployee Profession : " + Profession);
//        System.out.print("\n\tEmployee email : " + email);
//        System.out.print("\n\tEmployee Telephone : " + Telephone);
//        System.out.print("\n\tEmployee Salary : " + Salary);
//        System.out.print("\n\tEmployee Age : " + Age);
//    }


// 2. это конструктор, он будет прописывать Name, Profession ...автоматический, при создании обьекта в ячейке массива E[0], E[1]...

//    public Employee(String Name, String Profession, String email, String Telephone, long Salary, int Age) {
//    }


    public Employee(String name, String profession, String email, String telephone, long salary, int age) {
        this.Name = name;
        Profession = profession;
        this.email = email;
        this.Telephone = telephone;
        Salary = (int) salary;
        Age = age;
    }

    public void printInfo() {

        System.out.println("Имя: " + Name + "; Профессия: " + Profession + "; Номер телефона:  " + Telephone + "; email: " + email + "; Уровень дохода: " + Salary + "; age: " + Age);

    }

    public int getAge() {  //Создали "геттер" для "age"

        return Age;

    }


    public static class Main {
        public static void main(String[] args) {

//создаем массив на 5 человек, и заполняем ячейки массива при помощи конструктора

            Employee[] E = new Employee[5];
            //для каждой ячейки массива задаем объект 2. Конструктор класса должен заполнять эти поля при создании объекта;

            E[0] = new Employee("ivan ivanov", "Engineer", "ivanov@mailbox.com", "+79451233211", 80000, 36);
            E[1] = new Employee("Aleksandr Aleshin", "Chef engeneer", "aleshin@mailbox.com", "+79451233212", 100000, 41);
            E[2] = new Employee("Antonov Anton", "Worker", "antonov@mailbox.com", "+79451233213", 60000, 25);
            E[3] = new Employee("Petrov Petr", "Director", "petrov@mailbox.com", "+79451233214", 1000000, 68);
            E[4] = new Employee("Andreev Andrey", "Driver", "driver@mailbox.com", "+7945123321", 60000, 45);

            for (int i = 0; i < E.length; i++) {

                if (E[i].getAge() > 40) {

                    E[i].printInfo();
                }
            }
        }
    }
}



