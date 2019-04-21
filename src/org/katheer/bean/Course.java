package org.katheer.bean;

public class Course {
    static {
        System.out.println("Course class loading...");
    }

    public Course() {
        System.out.println("Course class instantiating...");
    }

    private String cname;
    private String ccost;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCcost() {
        return ccost;
    }

    public void setCcost(String ccost) {
        this.ccost = ccost;
    }

    public void courseDetails() {
        System.out.println("Course Deatils:");
        System.out.println("Course Name : " + cname);
        System.out.println("Course Cost : " + ccost);
    }
}
