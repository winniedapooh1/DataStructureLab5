//Assign 4, Peron class.
//  Represent an applicant, or an employee

package assign4_template;

import java.util.ArrayList;

public class Person { //new applicants, current employees, past employees
    
    //Item 3. in Assign 4 Document.

    //define data fields: name, degree, skill list ("Java, C#, C++", etc.)
    //  skill list: must be array list or linked list
    

    //define the constructor with given name, degree, and skill list

    //define getters

    //define setters

    //define toString()

    private String name;
    private String degree;
    private ArrayList<String> skills;

    public Person(String pName, String pDegree, ArrayList<String> pSkills){
        this.name = pName;
        this.degree = pDegree;
        this.skills = pSkills;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "name:" + name + '\n' +
                "degree:" + degree + '\n' +
                "skills:" + skills;
    }
}

