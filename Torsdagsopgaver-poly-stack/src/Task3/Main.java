package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> course = new ArrayList<>();
        course.add("Course1");
        course.add("Course2");
        course.add("Course3");
        course.add("Course4");
        course.add("Java 1.0");

        ArrayList<String> s1c = new ArrayList<>();
        s1c.add(course.get(4));
        Student s1 = new Student("Jørgen", s1c);

        ArrayList<String> s2c = new ArrayList<>();
        s1c.add(course.get(1));
        Student s2 = new Student("Søren", s2c);

        ArrayList<String> t1c = new ArrayList<>();
        t1c.add(course.get(3));
        Teacher t1 = new Teacher("Lone", t1c);

        ArrayList<String> t2c = new ArrayList<>();
        t2c.add(course.get(4));
        Teacher t2 = new Teacher("Lone", t2c);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(t1);
        persons.add(t2);

        for(Person p : persons) {
               boolean added = p.addCourse("Java 1.0");
                if(added == false) {
                    if(p instanceof Student) {
                        System.out.println(p.getName() + " har allerede bestået dette kursus.");
                    } else if(p instanceof Teacher) {
                        System.out.println(p.getName() + " kan ikke undervise i dette fag");
                    }
                }
            }
        }
}
