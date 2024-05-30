import java.util.Arrays;
public class bookstore {
    public static class HighSchoolStudent {
        private String name;
        private int Id;
        private static int givenId = 1;
        //total pages read by a student
        private int pagesRead;
        //total pages read by all students
        private static int totalPagesReadInSchool = 0;
        private double money;
        private static Subject[] subjects = new Subject[]{Subject.ENGLISH, Subject.HISTORY, Subject.MATH, Subject.GEOGRAPHY, Subject.BIOLOGY, Subject.CHEMISTRY, Subject.PHYSICS, Subject.COMPUTER_SCIENCE, Subject.PSYCHOLOGY, Subject.SPANISH};
        private Subject[] schedule;
        private Textbook[] bookBag;
        private static final int NUM_CLASSES = 7;


        //default constructor
        public HighSchoolStudent() {
            name = "John Wolf"; 
            Id = givenId; 
            pagesRead = 0;
            money = 301.78;
            schedule = new Subject[]{Subject.ENGLISH, Subject.COMPUTER_SCIENCE, Subject.MATH, Subject.CHEMISTRY, Subject.HISTORY, Subject.SPANISH};
            bookBag = new Textbook[NUM_CLASSES];
            givenId++;
        }
        //constructor
        public HighSchoolStudent(String name, int Id, double money, Subject[] schedule) {
            this.name = name;
            this.Id = Id;
            pagesRead = 0;
            this.money = money;
            this.schedule = schedule;
            this.bookBag = new Textbook[NUM_CLASSES];
        }
        //overloaded constructor
        public HighSchoolStudent(String name, int Id) {
            this.name = name;
            this.Id = Id;
            pagesRead = 0;
            money = 474.92;
            schedule = new Subject[]{Subject.MATH, Subject.ENGLISH, Subject.HISTORY, Subject.PHYSICS, Subject.COMPUTER_SCIENCE, Subject.PSYCHOLOGY};
            bookBag = new Textbook[NUM_CLASSES];
        }


        //accessor methods for name, Id, pagesRead, money, subjects, schedule, bookBag, and book
        //returns the name of the student
        public String getName() {
            return name;
        }
        //mutator methods for name, Id, pagesRead, money, subjects, schedule, bookBag, and book
        //changes the current object's name
        public void setName(String name) {
            this.name = name;
        }


        public int getId() {
            return Id;
        }
        public void setId(int Id) {
            this.Id = Id;
        }


        public int getPagesRead() {
            return pagesRead;
        }
        //pagesRead increments (keeps adding onto itself)
        public void setPagesRead(int pagesRead) {
            this.pagesRead += pagesRead;
        }


        public double getMoney() {
            return money;
        }
        public void setMoney(double money) {
            this.money = money;
        }
        
        //subjects is an array of enums; uses Arrays.toString() to return array
        public String getSubjects() {
            return Arrays.toString(subjects);
        }
        public void setSubjects(Subject[] subs) {
            subjects = subs;
        }


        //schedule is an array of enums; uses Arrays.toString() to return array
        public String getSchedule() {
            return Arrays.toString(schedule);
        }
        public void setSchedule(Subject[] schedule) {
            this.schedule = schedule;
        }


        //bookBag is an array of Textbook objects; uses Arrays.toString() to return array
        public String getBookBag() {
            return Arrays.toString(bookBag);
        }
        public void setBookBag(Textbook[] bookBag) {
            this.bookBag = bookBag;
        }


        //Uses index of bookBag to return specific textbook
        public Textbook getBook(int index) {
            return bookBag[index];
        }
        public void setBook(int index, Textbook text) {
            bookBag[index] = text;
        }


        //totalPagesReadInSchool shared by all HighSchoolStudent objects; combines the pages that all student objects have read
        public static int getTotalPagesReadInSchool() {
            return totalPagesReadInSchool;
        }
        public static void setTotalPagesReadInSchool(int changeTotal) {
            totalPagesReadInSchool = changeTotal;
        }


        //contains reference to a HighStudentStudent object's schedule and returns the address
        public Subject[] schoolSchedule() {
            return schedule;
        }
        //Money of the student is decremented by the cost since they are paying
        //Takes away money from the student when they pay for their textbooks at the BookStore
        public double payForBooks(double cost) {
            this.money = (float)(money - cost);
            return cost;
        }
        //current object's textbook index calls readPages() in the Textbook class since attributes of Textbook are in the Textbook class;
        //Purpose is to record and increment the pages read by the student while also incrementing the total amount of pages read by all of the students
        public void readPages(int index, int pages) {
            this.getBook(index).readPages(this, pages);
        }
        //does the same thing as the previous method, but has different requirements for parameter
        public void readPages(int pages) {
            pagesRead += pages;
            totalPagesReadInSchool += pages;
        }
        
        //returns a string of all attributes
        public String toString() {
            return "\nName: " + name + "\nID Number: " + Id + "\nMoney: " + String.format("$%.2f", money) + "\nPages Read: " + pagesRead + "\nSchedule: " + Arrays.toString(schedule) + "\nSchool Subjects Offered at School: " + Arrays.toString(subjects) + "\n\nTextbooks: \n" + schedule[0] + " Textbook:" + bookBag[0] + "\n" + schedule[1] + " Textbook:" + bookBag[1] + "\n" + schedule[2] + " Textbook:" + bookBag[2] + "\n" + schedule[3] + " Textbook:" + bookBag[3] + "\n" + schedule[4] + " Textbook:" + bookBag[4] + "\n" + schedule[5] + " Textbook:" + bookBag[5] + "\n" + schedule[6] + " Textbook:" + bookBag[6];
        }    
    }
    //The purpose of this class is to assign names, page numbers, total pages, and cost to a Textbook object. Also, there is the variable, pagesRead, which is only used for the purpose of storing values and adding/incrementing onto a student object's pagesRead.
    public static class Textbook {
        private String name;
        private static int startingPage = 1;
        private int pageNum;
        private int totalPages;
        private double cost;
        private int pagesRead;


        public Textbook() {
            name = "BLANK";
            pageNum = 0;
            totalPages = 0;
            cost = 0.00;
        }
        //overloaded constructor
        public Textbook(String name, int pageNum, int totalPages) {
            this.name = name;
            this.pageNum = startingPage;
            this.totalPages = totalPages;
            cost = 50.00;
        }
        //constructor
        public Textbook(String name, int pageNum, int totalPages, double cost) {
            this.name = name;
            this.pageNum = startingPage;
            this.totalPages = totalPages;
            this.cost = cost;
        }


        //accessor methods for name, startingPage, pageNum, totalPages, and cost
        public String getName() {
            return name;
        }
        //mutator methods for name, startingPage, pageNum, totalPages, and cost
        public void setName(String name) {
            this.name = name;
        }
        
        //startingPage is page 1 in most cases
        public int getStartingPage() {
            return startingPage;
        }
        public void setStartingPage(int page) {
            startingPage = page;
        }
        
        //pageNum is the current page number that the book is on
        public int getPageNum() {
            return pageNum;
        }
        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }   


        //totalPages is the total amount of pages in the textbook
        public int getTotalPages() {
            return totalPages;
        }
        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }
        
        //cost is the total amount that the textbook manufacturing company costs for a new bookbag;
        public double getCost() {
            return cost;
        } 
        public double setCost(double cost) {
            this.cost = cost;
            return cost;
        }


        //to record the Bookbag array index and to return the page number of the Bookbag array index
        //In first if statement, it checks to see if pageNum & pages are greater than the total amount of pages in the book, and resets them to the total amount of pages in the book if it's true
        //In first else if statement, it checks to see if pageNum & pages are less than the starting page in the book and resets them to the starting page in the book if it's true.
        //If none of these are true, then pageNum is set equal to pageNum + pages.
        public void readPages(HighSchoolStudent student, int pages) { 
            int tempPage = pageNum;
            if ((this.getPageNum() + pages) > (this.getTotalPages())) {
                this.setPageNum(this.getTotalPages());
            }
            else if ((this.getPageNum() + pages) < (this.getStartingPage())) {
                pageNum = startingPage;
            }
            else {
                this.setPageNum(this.getPageNum() + pages);
            }
            int temp = this.getPageNum() - tempPage;
            this.pagesRead += temp;
            System.out.println(this.pagesRead + " pages read by " + student.getName() + " in " + this.getName());
            student.readPages(temp);
        }


        //Changes the page number of the book, but does not directly affect the amount of pages read
        //Checks to see if the page is in bounds between the starting page and the total amount of pages. 
        public void fliptoPage(int page) {
            if (page > this.getTotalPages()) {
                this.setPageNum(this.getTotalPages());
            }
            else if (page < startingPage) {
                this.setPageNum(startingPage);
            }
            else {
                this.setPageNum(page);
            }
        }


        //returns a string of all attributes
        public String toString() {
            return "\nName: " + name + "\nStarting Page: " + startingPage + "\nPage Number: " + pageNum + "\nTotal Pages: " + totalPages + "\nCost: $" + cost + "\n";
        }
    }


    //The purpose of this class is to hold the values of how many textbooks in each subject are in stock and how much money/revenue the bookstore made.
    public static class BookStore {
        //The subjects will be the same for any bookstore in this program
        private static Subject[] textbookTypes = {Subject.ENGLISH, Subject.HISTORY, Subject.MATH, Subject.GEOGRAPHY, Subject.BIOLOGY, Subject.CHEMISTRY, Subject.PHYSICS, Subject.COMPUTER_SCIENCE, Subject.PSYCHOLOGY, Subject.SPANISH};
        private int[] textbooksInStock = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        private double money = 0;
        //empty without student's schedule
        private Subject[] schedule;
        //generated for each student buying textbooks corresponding to their schedule
        private Textbook[] bookBag;


        //accessor methods for textbookTypes, textbooksInStock, money, schedule, and bookBag()
        public String getTextbookTypes() {
            return Arrays.toString(textbookTypes);
        }
        //mutator methods for textbookTypes, textbooksInStock, money, schedule, and bookBag()
        public void setTextbookTypes(Subject[] types) {
            textbookTypes = types;
        }
        //textbooksInStock is an array of integers that holds the amount of textbooks that the bookstore is holding; uses Arrays.toString() to return array
        public String getTextbooksInStock() {
            return Arrays.toString(textbooksInStock);
        }
        public void setTextbooksInStock(int[] textbooksInStock) {
            this.textbooksInStock = textbooksInStock;
        }
        public double getMoney() {
            return money;
        }
        public void setMoney(double money) {
            this.money = money;
        }  


        //empty without student's schedule; expresses as null without pointing towards a specific student's schedule
        public String getSchedule() {
            return Arrays.toString(schedule);
        }
        public void setSchedule(Subject[] schedule) {
            this.schedule = schedule;
        }


        //empty without implementing the buyTextbooks method; generates a new bookbag for each student buying textbooks corresponding to their schedule
        public String getBookBag() {
            return Arrays.toString(bookBag);
        }
        public void setBookBag(Textbook[] bookBag) {
            this.bookBag = bookBag;
        }
        
        //To check how many types of each textbook and how much money the bookstore owns
        //for loop that prints out all elements of the textbooksInStock array and total revenue of the bookstore outside of the loop
        public void getInventory() {
            System.out.print("Bookstore Inventory:");
            for (int i = 0; i < textbookTypes.length; i++) {
                System.out.print("\n" + textbookTypes[i] + " textbooks in stock: " + textbooksInStock[i]);
            }
            System.out.print("\n\nRevenue: ");
            System.out.printf("$%.2f", money);
            System.out.print("\n");
        }


        //To fill the student's bookbag up with textbooks corresponding to their school schedule
        //double for loop that iterates through the length of the schedule array and textbookTypes array (all of the subjects) that checks for a match/equality between the two arrays to add elements accordingly
        public void buyTextbooks(HighSchoolStudent student) {
            double totalCost = 0;
            Textbook[] bookBag = new Textbook[7];
            Subject[] schedule = student.schoolSchedule();
            //Subject[] textbookTypes = student.getSubjects();
            
            System.out.println(student.getName() + " bought:");
            for (int i = 0; i < schedule.length; i++) {
                for (int j = 0; j < textbookTypes.length; j++) {
                    if (schedule[i].equals(textbookTypes[j])) {
                        bookBag[i] = textbookTypes[j].getTextbook();
                        Subject type = textbookTypes[j];
                        totalCost += bookBag[i].getCost();
                        textbooksInStock[j] -= 1;
                        System.out.println("+1 " + type + " Textbook! ($" + bookBag[i].getCost() + ")");
                        break;
                    }
                }
            }
            student.setBookBag(bookBag);
            money += student.payForBooks(totalCost);
            System.out.println("Total Cost: $" + (float)totalCost);
        }


        //returns a string of all attributes
        public String toString() {
            return "Bookstore:\nTypes of Textbooks:\n" + textbookTypes[0] + textbookTypes[0].getTextbook() + "Textbooks in Stock: " + textbooksInStock[0] + "\n\n" + textbookTypes[1] + textbookTypes[1].getTextbook() + "Textbooks in Stock: " + textbooksInStock[1] + "\n\n" + textbookTypes[2] + textbookTypes[2].getTextbook() + "Textbooks in Stock: " + textbooksInStock[2] + "\n\n" + textbookTypes[3] + textbookTypes[3].getTextbook() + "Textbooks in Stock: " + textbooksInStock[3] + "\n\n" + textbookTypes[4] + textbookTypes[4].getTextbook() + "Textbooks in Stock: " + textbooksInStock[4] + "\n\n" + textbookTypes[5] + textbookTypes[5].getTextbook() + "Textbooks in Stock: " + textbooksInStock[5] + "\n\n" + textbookTypes[6] + textbookTypes[6].getTextbook() + "Textbooks in Stock: " + textbooksInStock[6] + "\n\nRevenue: " + String.format("$%.2f", money) + "\nSchedule: " + Arrays.toString(schedule) + "\nBookBag: " + Arrays.toString(bookBag);
        }
    }


    //Not a class, but serves the purpose of determining what textbooks to add to the bookBag. The enum values serve as conditions that give the correct textbook to the student's bookbag, which is created upon buying textbooks.
    enum Subject {
            ENGLISH,
            HISTORY,
            MATH,
            GEOGRAPHY,
            BIOLOGY,
            CHEMISTRY,
            PHYSICS,
            COMPUTER_SCIENCE,
            PSYCHOLOGY,
            SPANISH;


            //checks each switch to determine what textbooks to add to the bookbag
            //returns new textbook based on the subject requested through the students' schedules
            public Textbook getTextbook() {
                switch(this) {
                    case ENGLISH:
                        return new Textbook("English Grammar & Composition", 1, 308, 29.25);
                    case HISTORY:
                        return new Textbook("America's History", 1, 704, 66.86);
                    case MATH:
                        return new Textbook("Probability and Permutation", 1, 729, 69.23);
                    case GEOGRAPHY:
                        return new Textbook("Geography of Eastern Asia", 1, 592, 56.22);
                    case BIOLOGY:
                        return new Textbook("Concepts of Biology", 1, 681, 64.67);
                    case CHEMISTRY:
                        return new Textbook("Introductory Chemistry", 1, 834, 79.21);
                    case PHYSICS:
                        return new Textbook("Fundamentals of Quantum Physics", 1, 945, 89.74);
                    case COMPUTER_SCIENCE:
                        return new Textbook("Programming in C++", 1, 575, 54.61);
                    case PSYCHOLOGY:
                        return new Textbook("Mind and Behavior", 1, 627, 59.54);
                    case SPANISH:
                        return new Textbook("Encuentros Maravillosos", 1, 272, 25.83);
                    default:
                        return new Textbook();       
                }
            }
        }
    //The purpose of this class is to run all of the methods that are in the other classes. This class is the driver class, which contains the main method and serves as a method of testing functionalities in the program. HighSchoolDriver also contains the checkpoint() method, which creates a dotted line for the purpose of splitting methods in the output for testing.
    //Students can create a schedule array upon creating a new student object with a length of 7 and buy textbooks based on which classes they have on their schedule. bookbags are created upon calling the buyTextbooks method. Various statistics are also stored such as the total amount of pages in a textbook, what the current page in the textbook is, and how many total pages a student has read
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        
        Subject[] schedule1 = new Subject[]{Subject.MATH, Subject.ENGLISH, Subject.HISTORY, Subject.PHYSICS, Subject.COMPUTER_SCIENCE, Subject.PSYCHOLOGY, Subject.SPANISH};
        Subject[] schedule2 = new Subject[]{Subject.BIOLOGY, Subject.HISTORY, Subject.ENGLISH, Subject.GEOGRAPHY, Subject.MATH, Subject.PSYCHOLOGY, Subject.CHEMISTRY};
        
        HighSchoolStudent student1 = new HighSchoolStudent("Juan Pizza", 204, 502.67, schedule1);
        HighSchoolStudent student2 = new HighSchoolStudent("Jimmy Cook", 695, 761.98, schedule2);
        
        
        bookstore.getInventory();
        checkpoint();
        
        bookstore.buyTextbooks(student1);
        checkpoint();


        bookstore.buyTextbooks(student2);
        checkpoint();


        bookstore.getInventory();
        checkpoint();
        
        student1.readPages(0, 730);
        checkpoint();
        
        student2.readPages(2, 658);
        checkpoint();


        student1.readPages(5, 429);
        checkpoint();
        
        student2.readPages(6, 821);
        checkpoint();


        student1.readPages(3, 211);
        checkpoint();
        
        student2.readPages(1, 563);
        checkpoint();
        
        System.out.println("Total Pages Read in School = " + HighSchoolStudent.getTotalPagesReadInSchool());
        checkpoint();


        System.out.println(student1);
        checkpoint();


        System.out.println(student2);
        checkpoint();
        
    }
    
    //for loop that prints '-' 40 times and utilizes an escape sequence to bump down to the next line
    //Used to create a dotted line to make output more readable
    public static void checkpoint() {
        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}