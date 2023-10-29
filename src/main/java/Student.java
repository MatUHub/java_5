import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private ArrayList<Double> grades;
    private String specialty;

    public Student(String name, ArrayList<Double> grades, String specialty){
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return specialty;
    }

    public String getName(){
        return name;
    }



    public double getAverageGrade(){
        double count = 0;
        for(double grade: grades){
            count += grade;
        }
        count = count / grades.size();
        return Math.ceil(count);
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
