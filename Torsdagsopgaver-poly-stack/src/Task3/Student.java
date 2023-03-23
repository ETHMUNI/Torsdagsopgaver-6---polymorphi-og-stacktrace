package Task3;

import java.util.ArrayList;

public class Student extends Person {

    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
    }
    @Override
    public boolean addCourse(String course) {
        for (String s : passedCourses) {
            if (course.equals(s)) {
                return false;
            } else {
                currentCourses.add(course);
            }
        }
        return true;
    }
}
