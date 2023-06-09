package br.ailtonbsj;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class StudentBean {

    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;

    private ArrayList<StudentBean> studentsListFromDB;

    @PostConstruct
    public void init() {
        studentsListFromDB = DatabaseOperation.getStudentsListFromDB();
    }

    public String saveStudentDetails(StudentBean newStudentObj) {
        return DatabaseOperation.saveStudentDetailsInDB(newStudentObj);
    }

    public ArrayList<StudentBean> studentsList() {
        return studentsListFromDB;
    }

    public String editStudentRecord(int studentId) {
        return DatabaseOperation.editStudentRecordInDB(studentId);
    }

    public String updateStudentDetails(StudentBean updateStudentObj) {
        return DatabaseOperation.updateStudentDetailsInDB(updateStudentObj);
    }

    public String deleteStudentRecord(int studentId) {
        return DatabaseOperation.deleteStudentRecordInDB(studentId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
