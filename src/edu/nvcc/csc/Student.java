package edu.nvcc.csc;
import java.util.Arrays;

/**
 * Created by tkanchanawanchai6403 on 1/31/2017.
 */
public class Student {
    int id;
    String firstName;
    String lastName;
    double [] scores;
    String username;
    String password;
    int size = 21;

    public Student() {
        id = 000;
        firstName = "John";
        lastName = "Doe";
        scores = new double[size];
    }

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        scores = new double[size];
    }

    public Student(int id, String firstName, String lastName, int size) {
        this.size = size;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        scores = new double[size];
    }

    public Student(int id, String firstName, String lastName, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        scores = new double[size];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
