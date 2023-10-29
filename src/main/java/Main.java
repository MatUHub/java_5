import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(createStudent("Артем", "информатика"));
    students.add(createStudent("Иван", "физика"));
    students.add(createStudent("Андрей", "информатика"));
    students.add(createStudent("Илья", "биология"));
    students.add(createStudent("Семен", "информатика"));
    students.add(createStudent("Кирил", "математика"));
    students.add(createStudent("Сергей", "информатика"));
    students.add(createStudent("Владимир", "информатика"));
    students.add(createStudent("Антон", "информатика"));
    students.add(createStudent("Лев", "информатика"));
    students.add(createStudent("Данил", "информатика"));
    students.add(createStudent("Кратос", "информатика"));
        List<Student> stream = students.stream()
                .filter(p -> p.getAverageGrade() > 4.5)
                .filter(p -> p.getSpecialty() == "информатика")
                .sorted()
                .collect(Collectors.toList());

        for (Student st: stream){
            System.out.println(st.getName() + " " + st.getSpecialty());
        }

    }
    public static double genRenNumber(int n){
        return  Math.ceil(2 + Math.random() * n);
    }

    public static void addNumber(ArrayList<Double> arr){
        for(int i = 0; i < 9; i++){
            arr.add(genRenNumber(3));
        }
    }

    public static Student createStudent(String name, String speciality){
        ArrayList<Double> grad1 = new ArrayList<>();
        addNumber(grad1);
        Student student1 = new Student(name, grad1, speciality);
        return student1;
    }

}

