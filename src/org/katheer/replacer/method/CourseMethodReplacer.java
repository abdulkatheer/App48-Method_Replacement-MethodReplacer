package org.katheer.replacer.method;

import org.katheer.bean.Course;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class CourseMethodReplacer implements MethodReplacer {
    static {
        System.out.println("Course method replacer loading...");
    }

    public CourseMethodReplacer() {
        System.out.println("Course method replacer instantiating...");
    }

    @Override
    public Object reimplement(Object course, Method method, Object[] args) throws Throwable {
        Course course1 = (Course) course;
        System.out.println("***Replaced Course Method***");
        System.out.println("Course Details :");
        System.out.println("Course Name : " + course1.getCname());
        System.out.println("Course Cost : " + course1.getCcost());
        return null;
    }
}
