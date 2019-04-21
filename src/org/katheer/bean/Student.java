package org.katheer.bean;

public class Student {
    static {
        System.out.println("Student class loading...");
    }

    public Student() {
        System.out.println("Student class instantiating...");
    }

    private String name;
    private Course course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void getStudentDetails() {
        System.out.println("Student Name : " + this.getName());
        course.courseDetails();
    }
}
