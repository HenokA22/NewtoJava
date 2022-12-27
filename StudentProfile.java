public class StudentProfile {

    String FirstName;
    String LastName;
    int GradYear;
    double GPA;
    String DeclaredMajor;

    public StudentProfile(String FirstName, String LastName, int GradYear, double GPA, String DeclaredMajor ) {

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.GradYear= GradYear;
        this.GPA = GPA;
        this.DeclaredMajor = DeclaredMajor;
    }

    public int OneGradYear() {
        return (this.GradYear + 1) ;
    }

}
