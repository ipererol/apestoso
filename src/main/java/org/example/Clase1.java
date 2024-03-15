package codeclean;

import java.util.ArrayList;
import java.util.List;
import org.example.clase2;

public class Subject {
    private float subjectName;
    private ArrayList<clase2> people;
    private int MAX_ALUMNOS;
    
    public Subject(float SubjectName, ArrayList<clase2> people, int MAX_ALUMNOS){
        this.subjectName = SubjectName;
        this.people = people;
        this.MAX_ALUMNOS = MAX_ALUMNOS;
    }
    
    public float getSubjectName(){
        return subjectName;
    }

    public void setSubjectName(float subjectName){
        this.subjectName = subjectName;
    }

    public ArrayList<clase2> getPeople(){
        return people;
    }

    public void setPeople(ArrayList<cñase2> people){
        this.people = people;
    }

    public int getMAX_ALUMNOS(){
        return MAX_ALUMNOS;  
    }

}
