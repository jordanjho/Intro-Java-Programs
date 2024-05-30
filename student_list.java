public class student_list {

    public static class stu_homogeneity {
        private String name;
        private static int numOfStudents;
        public static String EMOTION = "Calm";
        public stu_homogeneity(String nameInit) {
            name = nameInit;
            numOfStudents++;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmotion() {
            return EMOTION;
        }
        public void setEmotion(String emote) {
            EMOTION = emote;
        }
        public static int getNumOfStudents() {
            return numOfStudents;
        }
        public void staticMethods() {
            System.out.println("1) static variables are used with the class name and the dot operator");
            System.out.println("2) all objects of a class share a single static variable");
            System.out.println("3) static methods cannot access or change the value of instance variables");
            System.out.println("4) static methods cannot call non-static methods");
        }
        public String toString() {
            return "Student Name: " + name;

        }
    }
    public static void main(String[] args) {
        stu_homogeneity student1 = new stu_homogeneity("John");
        stu_homogeneity student2 = new stu_homogeneity("Joe");
        stu_homogeneity student3 = new stu_homogeneity("Jim");
        stu_homogeneity.EMOTION = "Angry";

        System.out.println("Student Emotion: " + stu_homogeneity.EMOTION);
        System.out.println("The Total Number of Students is: " + stu_homogeneity.getNumOfStudents());
        System.out.println("Student Names: ");
        
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(student3.getName());
    }
/*
Each student has a different name but they each increment the total # of students by 1 for each newly created object.
The emotion of the students is the same. (ex. If the emotion is angry, all student objects are angry)
*/
}