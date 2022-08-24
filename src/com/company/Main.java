package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student[] students = new Student[10];
        students[0] = new Student("Ормонов А.");
        students[1] = new Student("Арапов А.");
        students[2] = new Student("Кадыров Л.");
        students[3] = new Student("Сапаров Ш.");
        students[4] = new Student("Шахов О.");
        students[5] = new Student("Закиров К.");
        students[6] = new Student("Даиров М.");
        students[7] = new Student("Ширшов К.");
        students[8] = new Student("Петров А.");
        students[9] = new Student("Иваноы Ж.");

        Class[] classes = new Class[3];
        classes[0] = new Class("First");
        classes[1] = new Class("Second");
        classes[2] = new Class("Third");

        Professor[] professors = new Professor[2];
        professors[0] = new Professor("Sokolov K");
        professors[1] = new Professor("Lomonosov M");
        Department department = new Department("Economic", classes,professors,students);
        System.out.println(department);

        System.out.println();
        Student[] students1 = new Student[10];
        students1[0] = new Student("Ормонов А.");
        students1[1] = new Student("Арапов А.");
        students1[2] = new Student("Кадыров Л.");
        students1[3] = new Student("Сапаров Ш.");
        students1[4] = new Student("Шахов О.");
        students1[5] = new Student("Закиров К.");
        students1[6] = new Student("Даиров М.");
        students1[7] = new Student("Ширшов К.");
        students1[8] = new Student("Петров А.");
        students1[9] = new Student("Иваноы Ж.");

        Class[] classes1 = new Class[3];
        classes1[0] = new Class("First A");
        classes1[1] = new Class("Second B");
        classes1[2] = new Class("Third C");

        Professor[] professors1 = new Professor[2];
        professors1[0] = new Professor("Ostrov K");
        professors1[1] = new Professor("Durov M");
        Department department1 = new Department("Banks", classes1,professors1,students1);
        System.out.println(department1);

        System.out.println();
        Student[] students2 = new Student[10];
        students2[0] = new Student("Ормонов А.");
        students2[1] = new Student("Арапов А.");
        students2[2] = new Student("Кадыров Л.");
        students2[3] = new Student("Сапаров Ш.");
        students2[4] = new Student("Шахов О.");
        students2[5] = new Student("Закиров К.");
        students2[6] = new Student("Даиров М.");
        students2[7] = new Student("Ширшов К.");
        students2[8] = new Student("Петров А.");
        students2[9] = new Student("Иваноы Ж.");

        Class[] classes2 = new Class[3];
        classes2[0] = new Class("First D");
        classes2[1] = new Class("Second E");
        classes2[2] = new Class("Third H");

        Professor[] professors2 = new Professor[2];
        professors2[0] = new Professor("Krasnov F");
        professors2[1] = new Professor("Chernov T");
        Department department2 = new Department("Teacher", classes2,professors2,students2);
        System.out.println(department2);
    }
}
