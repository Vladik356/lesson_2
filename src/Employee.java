public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee(String name, String position, String email, String phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Сергей Лазарев", "Электрик", "lazarev@gmail.com", "89993289999", 40000, 48);
        employees[1] = new Employee("Эван Питорс", "Актер", "pitors@gmail.com", "89993289998", 100000, 37);
        employees[2] = new Employee("Михал Зубенко", "Прараб", "Zybenko@yandex.com", "89993289997", 500, 35);
        employees[3] = new Employee("Андрей Голубев", "Стример", "Golybev@gmail.com", "89993289996", 200000, 39);
        employees[4] = new Employee("Алексей Березин", "Киберспортсмен", "Berezin@rambler.com", "89993289995", 5000, 39);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }
}
