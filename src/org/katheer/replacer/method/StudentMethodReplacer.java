package org.katheer.replacer.method;

import org.katheer.bean.Student;
import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class StudentMethodReplacer implements MethodReplacer {
    static {
        System.out.println("Student method replacer loading...");
    }

    public StudentMethodReplacer() {
        System.out.println("Student method replacer instantiating...");
    }

    @Override
    public Object reimplement(Object student, Method method, Object[] args) throws Throwable {
        Student studentObj = (Student) student;
        System.out.println("***Replaced Student Method***");
        System.out.println("Student Details :");
        System.out.println("Student Name    : " + studentObj.getName());
        studentObj.getCourse().courseDetails();
        return null;
    }
}
