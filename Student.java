public class Student {
// Using different data types, E.X int, double,boolean,char, boolean
    public static void main(String[] args) {
       int studentage = 18;
       double studentGPA = 3.9;

       boolean hasperfectattendence = true;
       String studentname = "Henok Assalif";
       String studentfirstname = "Henok";
       String studentlastname = "Assalif";
        char studentFirstInitial = studentfirstname.charAt(0);
        char studentLastInitial = studentlastname.charAt(0);

        System.out.println(studentage);
        System.out.println(studentGPA);
        System.out.println(hasperfectattendence);

        System.out.println(studentfirstname);
        System.out.println(studentlastname);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
    }
}
