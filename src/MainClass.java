import sun.management.snmp.jvminstr.JvmOSImpl;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Иванов", "Иван", "Иваныч", "ivanov@yandex.ru",
                "8 800 000 00 00", 50000, 35);

        System.out.println(employee.getEmployee());
        System.out.println("-------------------------------------------------------------");

        Employee[] employees = {employee,
                new Employee("Петров", "Сергей", "Андреевич", "sergey@ya.ru",
                        "8 800 252 00 00", 55000, 45),
                new Employee("Сидоров", "Александр", "Сергеевич", "alex@ya.ru",
                        "8 800 353 00 00", 45000, 55),
                new Employee("Быков", "Тимур", "Александрович", "timur@mail.ru",
                        "8 800 898 00 00", 30000, 25),
                new Employee("Агарков", "Роман", "Анатольевич", "roman@rambler.ru",
                        "8 800 456 00 00", 40000, 60),
        };

        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].getEmployee());
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");

            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getAge() > 40) {
                    System.out.print(employees[i].getEmployee());
                    System.out.println();
                }
            }
            System.out.println("-------------------------------------------------------------");
        }
    }

