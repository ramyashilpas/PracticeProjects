package java.StringTopic;

import java.util.*;

//Complete the code
public class SortingEasyProblem12 {

    static class Student {

        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
          //  System.out.println("Student id");
            int id = in.nextInt();
           // System.out.println("Student name");
            String fname = in.next();
          //  System.out.println("Student gpa");
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getId));
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

