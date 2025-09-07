public class course {
    static int maxCapacity=100;
    String courseName;
    int enrollments;
    
    String[] enrolledStudents=new String[maxCapacity];

    course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents=new String[maxCapacity];
    }

    

    void enrolledStudents(String StudentName){
        enrolledStudents[enrollments] = StudentName;
        enrollments++;
    }

    void unenrolledStudents(String StudentName){
        System.out.println("student removed");
        enrollments--;
    }
    public static void main(String[] args) {
        
    }
}
