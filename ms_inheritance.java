import java.util.*;

public class ms_inheritance {

    public static class CollegeStudent extends Student {
        private int year;
        private String major;

        public CollegeStudent() {
            super();
            this.year = 4;
            this.major = "Electric Engineering";
        }

        public CollegeStudent(String name, int age, int id, double gpa, int year, String major) {
            super(name, age, id, gpa);
            this.year = year;
            this.major = major;
        }

        public int getYear() {
            return year;
        }
        public String getMajor() {
            return major;
        }

        public void setYear(int year) {
            this.year = year;
        }
        public void setMajor(String major) {
            this.major = major;
        }

        public String toString() {
            return super.toString() + ", Year: " + year + ", Major: " + major;
        }
    }

    public static class Person {
        private String name;
        private int age;

        public Person() {
            this.name = "Jasmine";
            this.age = 16;
        }
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }

        public String toString() {
            return "Name: " + name + ", Age: " + age;
        }   
    }

    public static class Teacher extends Person{
        private String subject;
        private Student[] students;

        public Teacher() {
            super();
            this.subject = "Physics";
            this.students = new Student[]{new Student(), new Student("Alan", 17, 24, 4.0)};
        }

        public Teacher(String name, int age, String subject, Student[] students) {
            super(name, age);
            this.subject = subject;
            this.students = students;
        }

        public String getSubject() {
            return subject;
        }
        public String getStudents() {
            return Arrays.toString(students);
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }
        public void setStudents(Student[] students) {
            this.students = students;
        }
        
        public String toString() {
            return super.toString() + ", Subject: " + subject + ", Students: " + Arrays.toString(students);
        }
    }

    public static class Student extends Person {
        private int id;
        private double gpa;

        public Student() {
            super();
            this.id = 3;
            this.gpa = 3.92;
        }
        public Student(String name, int age, int id, double gpa) {
            super(name, age);
            this.id = id;
            this.gpa = gpa;
        }

        public int getId() {
            return id;
        }
        public double getGpa() {
            return gpa;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public String toString(){
            return super.toString() + ", Student ID: " + id + ", GPA: " + gpa;
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Samuel", 16);
        Person p3 = new Student("Mark", 19, 22, 3.87);
        Person p4 = new Teacher();

        Student s1 = new CollegeStudent("Greg", 19, 2, 3.87, 2, "Computer Science");
        Student s2 = new Student();

        CollegeStudent cs1 = new CollegeStudent();
        CollegeStudent cs2 = new CollegeStudent("April", 21, 202, 3.6, 3, "Applied Math");

        Student[] class1 = new Student[]{new Student("Shelly", 15, 39, 4.0), new Student("Lee", 16, 22, 3.72), new Student("Ajay", 18, 11, 3.95)};
        Teacher t1 = new Teacher("Walter", 52, "Chemistry", class1);
        Teacher t2 = new Teacher();

        System.out.println("toString:\n");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println(cs1);
        System.out.println(cs2);
        
        System.out.println(t1);

        
        System.out.println("\nPerson Class:\n");
        System.out.println(p3.getName());
        p3.setName("Gregory");
        System.out.println(p3.getName());

        System.out.println(cs1.getAge());
        cs1.setAge(22);
        System.out.println(cs1.getAge());

       
        System.out.println("\nStudent Class:\n");
        System.out.println(s1.getId());
        s1.setId(99);
        System.out.println(s1.getId());

        System.out.println(cs2.getGpa());
        cs2.setGpa(3.14);
        System.out.println(cs2.getGpa());

        
        System.out.println("\nCollege Student Class:\n");
        System.out.println(cs1.getYear());
        cs1.setYear(1);
        System.out.println(cs1.getYear());

        System.out.println(cs2.getMajor());
        cs2.setMajor("Gender Studies");
        System.out.println(cs2.getMajor());

        System.out.println("\nTeacher Class:\n");
        System.out.println(t1.getSubject());
        t1.setSubject("Biology");
        System.out.println(t1.getSubject());

        System.out.println(t2.getStudents());
        
        Student[] class2 = new Student[]{new Student("Joshua", 18, 85, 3.5), new Student("Connor", 15, 92, 4.0), new Student("Ed", 16, 72, 3.79)};
        
        t2.setStudents(class2);
        System.out.println(t2.getStudents());
    }
}
/*
All people have a name and an age. Some can also have a student ID, GPA, year, major, or subject.
All college students are students. All teachers and students are people. 
The roles that are derived from higher ones (person) have additional traits in their respective classes.
*/