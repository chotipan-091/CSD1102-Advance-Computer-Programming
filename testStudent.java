public class testStudent {
    public static void main(String[] args) {

        Student s1 = new Student("30486", "Chris", "Computer Science", 3.00);
        Student s2 = new Student("49568", "Tangmo", "Computer Science", 3.00);
        s1.displayInfo();
        s2.displayInfo();

        Student[] students = new Student[3];
        students[0] = new Student("2331234", "Max", "Computer Science", 3.00);
        students[1] = new Student("55567123", "Ana", "Computer Science", 3.00);
        students[2] = new Student("1277456", "Jest", "Computer Science", 3.00);


        System.out.println("Student List ");
        for (Student s : students) {
            s.displayInfo();
        }
    }
}