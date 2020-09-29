/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentForm;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author USER
 */
@ManagedBean
@SessionScoped
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    Long id;
    String firstname;
    String middlename;
    String lastname;
    String faculty;
    String program;

    public Student() {
    }

    public Student(Long id, String firstname, String middlename, String lastname, String faculty, String program) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.faculty = faculty;
        this.program = program;

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    @Override
    public Student clone() {
        return new Student(id, firstname,middlename,lastname,faculty,program);
    }
    
    public void restore(Student student) {
        this.id = student.getId();
        this.firstname = student.getFirstname();
         this.middlename = student.getMiddlename();
          this.lastname = student.getLastname(); 
          this.faculty = student.getFaculty();
          this.program = student.getProgram();
          
    }

}
