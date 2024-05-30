import java.io.*;
import java.util.*;

public class seating_chart {

    public static class SeatingChart {
        // private instance variables
        private ArrayList<Student> students;
        private Student[][] chart = new Student[6][6];

        //SeatingChart constructor
        SeatingChart(ArrayList<Student> students) {
            this.students = students;

            int counter = 0;
            for (int row = 0; row < chart.length; row++) {
                for (int col = 0; col < chart[row].length; col++) {
                    if (counter < students.size()) {
                        chart[row][col] = new Student(students.get(counter).getFirstName(), students.get(counter).getLastName());
                        counter++;
                    }
                }
            }
        }
        //alphabetical chart method
        public void alphabeticalSort() {
            int nameCounter = 0;
            int nullCounter = 0;
            ArrayList<Student> s = new ArrayList<Student>();

            for (int col = chart[0].length - 1; col >= 0; col--) {
                for (int row = 0; row < chart.length; row++) {
                    if (chart[row][col] != null) {
                        nameCounter++;
                        s.add(chart[row][col]);
                    }
                    else if (chart[row][col] == null) {
                        nullCounter++;
                    }
                }
            }
            Student[] tempS = new Student[nameCounter];

            for (int i = 0; i < nameCounter; i++) {
                tempS[i] = s.get(i);
            }
            
            for (int j = 0; j < tempS.length - 1; j++) {
                int minIndex = j;
                for (int k = j + 1; k < tempS.length; k++) {
                    if (tempS[k].getLastName().compareTo(tempS[minIndex].getLastName()) < 0) {
                        minIndex = k;
                    }
                }
                Student temp = tempS[j];
                tempS[j] = tempS[minIndex];
                tempS[minIndex] = temp;
            }
            System.out.println(Arrays.toString(tempS));
            
            
            //Student[][] temp = new Student[6][6];
            int totalCounter1 = 0;
            int totalCounter2 = 0;
            for (int col = 0; col < chart[0].length; col++) {
                for (int row = 0; row < chart.length; row++) {
                    if (totalCounter1 < nameCounter) {
                        chart[col][row] = tempS[totalCounter1];
                        totalCounter1++;
                    }
                    else if (totalCounter1 >= nameCounter && totalCounter2 < nullCounter) {
                        chart[col][row] = null;
                    }
                }
            }
            System.out.println(Arrays.deepToString(chart));
            //chart = temp;
            /*
            int counter = 0;
            for (int i = 0; i < students.size(); i++) {
                int index = alphabetHelp(students, i);
                Student name = students.get(i);
                int tempNum = i;
                
                students.set(tempNum, students.get(index));
                students.set(index, name);
            }
            Student[][] temp = new Student[6][6];
            
            for (int col = temp[0].length - 1; col >= 0; col--) {
                for (int row = 0; row < temp.length; row++) {
                    if (counter < students.size()) {
                        temp[row][col] = students.get(counter);
                        counter++;
                    }
                    else {
                        temp[row][col] = null;
                    }
                }
            }
            chart = temp;
            */
        }

        //random chart method
        public void randomChart() {
            for (int row = 0; row < chart.length; row++) {
                for (int col = 0; col < chart[row].length; col++) {
                    int numRow = (int)(Math.random() * 6);
                    int numCol = (int)(Math.random() * 6);
                    Student temp = chart[row][col];
                    chart[row][col] = chart[numRow][numCol];
                    chart[numRow][numCol] = temp;
                }
            }
        }

        //clear chart method
        public void clearChart() {
            for (int row = 0; row < chart.length; row++) {
                for (int col = 0; col < chart[row].length; col++) {
                    chart[row][col] = null;
                }
            }
        }

        //add any other methods you would like, would help
        
        public void drawChart() {
        for (int j = chart[0].length - 1; j >= 0; j--) {
            System.out.println("\n");
            for (int i = 0; i < chart.length; i++) {
                System.out.printf("%-20s", chart[i][j]);
            }
        }
        System.out.println("\n\n");
        }
    }
    //Student class specs
    public static class Student {
    //instance variables for firstName and lastName
        private String firstName;
        private String lastName;
        
    //write default constructors explicitly sets first and last name to null
        public Student() {
            this.firstName = null;
            this.lastName = null;
        }

    //write parameterized constructor - for first Name and last Name initialization for Student object
        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

    //accessor methods
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
    //mutator methods 
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    //toString method
        public String toString() {
            return firstName + " " + lastName;
        }
    }
    public static void main (String[] args) throws IOException {
		
        ///*
        Scanner scanner = new Scanner(new FileReader("student_seats.txt")); //point to correct period text file
		String line = null;
		
        ArrayList<Student> students = new ArrayList<Student>(); //create an ArrayList of Students
		
		
			while (scanner.hasNextLine()) { //create Student objects as you read in the textfile lines, 
				line = scanner.nextLine();
				String[] names = line.split(","); //split method returns an array
				students.add(new Student(names[1], names[0]));  //adds new Student  firstName- names[1] and lastName- names[0]
			}
		//*/
		SeatingChart chart = new SeatingChart(students); //pass up ArrayList of Student objects to the SeatingChart constructor
        
        chart.drawChart();
        ///*
		Scanner s = new Scanner(System.in);
		int choice;
		
		while (true) {
			System.out.println("Hi. How would you like to arrange your seating chart?");
			System.out.println("1: alphabetical order");
			System.out.println("2: random order");
			System.out.println("3: clear it");
			System.out.println("Or, press 4 to quit.");
			System.out.print("Please enter 1, 2, 3, or 4: ");
			choice = s.nextInt();
			

			if (choice == 1) {
				//call your sort chart alphabetically method
				//you can create an additional drawChart method if you like every time you need to print chart, your option
                chart.alphabeticalSort();
                chart.drawChart();
            }
            else if (choice == 2) {
                chart.randomChart();
                chart.drawChart();
            }
            //write choice 2 option
                //call your random seating chart method
                //display chart
            else if (choice == 3) {
                chart.clearChart();
                chart.drawChart();
            }
            //write choice 3 option
                //call your clear chart method
                //display seating chart

            if(choice == 4){
                //goodbye message
                s.close();
                System.exit(0); //terminates the program
            }
        }
    //*/
    }
}