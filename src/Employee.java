public class Employee {
   private String surname;
   private String name;
   private String patronymic;
   private String email;
   private String phoneNumber;
   private int salary;
   private int age;

    public Employee (String surname, String name, String patronymic, String email,
                     String phoneNumber, int salary, int age) {
this.surname = surname;
this.name = name;
this.patronymic = patronymic;
this.email = email;
this.phoneNumber = phoneNumber;
this.salary = salary;
this.age = age;
    }    // 2. Конструктор класса должен заполнять эти поля при создании объекта.

   String getEmployee () {
        return this.surname + " " + this.name + " " + this.patronymic + " " + this.email + " " +
                this.phoneNumber + " " + this.salary + " " + this.age;
    }    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    int getAge() {
        return age;
}
}               // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
