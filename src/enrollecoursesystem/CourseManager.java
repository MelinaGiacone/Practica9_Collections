package enrollecoursesystem;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CourseManager {
    private HashMap<String, Student> students;

    public CourseManager() {
        students = new HashMap<>();
    }

    public void enrollStudent(String idStudent, Student student) {//yo creo que en esta funcion hay que crear el string id porque no hay que pasarlo como parametro
        if (students.containsKey(idStudent)) {
            System.out.println("Student is already enrolled");
        } else {
            students.put(idStudent, student);
            System.out.println("Student added successfully.");
        }
    }

    public void unenrollStudent(String idStudent) {
        if (students.containsKey(idStudent)) {
            Student student = students.get(idStudent);
            students.remove(idStudent);
            System.out.println(student.getName() + " was successfully unenrolled");
        } else {
            System.out.println("Student with that id does not exist");
        }
    }

    public Student searchStudentById(String id){
        return students.getOrDefault(id,null);
    }

    public void listAllStudents(){
        TreeMap<String,Student> sortedStudents = new TreeMap<>(students);

        for(Map.Entry<String,Student> entry : sortedStudents.entrySet()){
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
    }
}
