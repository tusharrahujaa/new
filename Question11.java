record Student (String name,int id, int age) {
    static int count=0;
    Student {
        count++;
    }
}

public class Question11 {
    public static void main(String[] args) {
        Student S1 = new Student("Tushar", 15, 22);
        Student S2 = new Student("Mohit", 16, 23);
        Student S3 = new Student("Hrithik", 17, 24);

        System.out.println(Student.count);
    }
}
