/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author USER
 */

@ManagedBean
@SessionScoped

public class StudentBean implements Serializable {
    private static final long serialVersionUID = 1L;
     
     private List<Student> list;
    private Student item = new Student();
    private Student editItem = null;
    private boolean edit;
    
    @PostConstruct
    public void init() {
        list = new ArrayList<Student>();
    }
    
    public void add() {
        item.setId(list.isEmpty() ? 1 : list.get(list.size() - 1).getId() + 1);
        list.add(item);
        item = new Student();
    }
    
    public void resetAdd() {
        item = new Student();
    }
    
    public void edit(Student item) {
       editItem = item.clone();
        this.item = item;
        edit = true;
    }
    
    public void cancelEdit() {
        this.item.restore(editItem);
        this.item = new Student();
        edit = false;
    }
    
    public void saveEdit() {
        this.item = new Student();
        edit = false;
    }
    
    public void delete(Student item) throws IOException {
        list.remove(item);
    }
    
    public List<Student> getList() {
        return list;
    }
    
    public Student getItem() {
            return this.item;
    }
    
    public boolean isEdit() {
        return this.edit;
    }
}
