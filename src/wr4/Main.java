package wr4;

import java.util.Scanner;


class worker
{
    private String name;
    private String position;
    private String email;
    private String tel;
    private double salary;
    private int age;


    worker(String name, String position, String email,String tel, double salary,int age) {
        //Scanner sc = new Scanner(System.in);
       /* System.out.print("Выберите сколько человек вы планируете записать ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print("\nЗапишите возраст ");
            age = sc.nextInt();
            System.out.print("\nЗапишите ФИО с _ между ");
            name = sc.next();
            System.out.print("\nЗапишите майл ");
            email = sc.next();
            System.out.print("\nЗапишите должность ");
            position = sc.next();
            System.out.print("\nзапишите зп ");
            salary = sc.nextInt();
            if (age<18){
                System.out.printf("Слишком молод");
                System.out.print("\nЗапишите возраст ");
                age = sc.nextInt();
            } */
        this.tel=tel;
        this.age=age;
        this.name=name;
        this.email=email;
        this.position=position;
        this.salary=salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }




        //System.out.printf("Rabotnik "+i+"Name: %s Age: %d Email: %s Position: %s Salary: %d", name, age,email,position,salary);






    }


    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(name + " " + position + " " +  email + " " + tel + " " + salary + " " + age);
    }








}

// void displayInfo() {

// System.out.printf("Name: %s Age: %d Email: %s Position: %s Salary: %d", name, age,email,position,salary);

// }

public class Main {

    public static void main(String[] args) {


        worker[] persArray = new worker[5]; // Вначале объявляем массив объектов
        persArray[0] = new worker("a", "b", "c", "12", 33, 19);
        persArray[1] = new worker("ab", "ac", "ad", "2", 44, 40);
        persArray[2] = new worker("abc", "abcd", "abcde", "333", 321234, 50);
        persArray[3] = new worker("g", "ag", "agd", "3562", 764, 33);
        persArray[4] = new worker("bbbsrfs s", "sfsf", "gsm", "dfdf", 70000, 70);

        for (worker item : persArray) {
            if (item.GetAge() > 40) item.Show();


        }


    }
}