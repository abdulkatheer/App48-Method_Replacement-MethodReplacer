package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Method Replacement in Spring:
        -----------------------------
        In Spring, we can replace the implementation of method with another
        code. For this, we have to create a class that should extend
        MethodReplacer interface.

        It has one method
        public Object reimplement(Object obj, Method method, Object[] args);

        obj -> reference to the object which calls the method, current
        instance method reference
        method -> reference to method we want to replace
        args -> contains method args
        return -> return type of method

        Using obj, we can get instance methods and values.
        Using args, we can get the method parameters.
        Using method, we can get method related data.
        Using return, we can return any object.

        Note: For each method we want to replace, a separate replacer class
        has to be created and pass it via <replaced-method> tag.

        Execution Flow:
        ---------------
        1. Load and Instantiate all replacer classes
        2. Load and instantiate beans and replace methods with replacer
        3. Store instance in the container
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");
        Student student = (Student) context.getBean("student");
        student.getStudentDetails();
    }
}
