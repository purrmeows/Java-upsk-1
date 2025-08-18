public class Main {

    public static void main(String[] args) {
// --- Person Class ---
        System.out.println("--- Demonstrating Person Class ---");
        Person person = new Person("Tanaprach", "Hello");
        System.out.println(person);
        person.setAddress("Pattanakarn 43");
        System.out.println("New Address: " + person.getAddress());
        System.out.println();

// --- Student Class ---
        System.out.println("--- Demonstrating Student Class ---");
        Student student = new Student("Emily Carter", "45 River Street");
        System.out.println(student);
        student.addCourseGrade("Mathematic", 90);
        student.addCourseGrade("Scient", 70);
        student.addCourseGrade("Art", 85);
        student.addCourseGrade("Ai", 80);
        student.printGrades();
        System.out.printf("Average grade for %s is: %.2f\n",
                student.getName(), student.getAverageGrade());
        System.out.println();

// --- Teacher Class ---
        System.out.println("--- Demonstrating Teacher Class ---");
        Teacher teacher = new Teacher("Ayanokochi", "White room");
        System.out.println(teacher);
        teacher.addCourse("Investment");
        teacher.addCourse("World History");
        teacher.addCourse("Math");
        teacher.addCourse("Investment"); // Attempt to add existing course
        System.out.println("Removing 'Math': "
                + teacher.removeCourse("Math"));
        System.out.println("Removing 'Astonomy': "
                + teacher.removeCourse("Astonomy")); // Attempt to remove non-existent
        System.out.println();
        System.out.println("Final state of teacher object:");
        System.out.println(teacher);
    }
}