package study;

import java.util.ArrayList;

public abstract class TeachingUnit {
    //Attributes
    private String name;
    private int semester;
    private String comments;
    private ArrayList<Coeff> coeffs; //les Coeffs contiennent les Modules associés

    //Constructors
    public TeachingUnit() {}

    public TeachingUnit(String name, int semester, String comments) {
        this.name = name;
        this.semester = semester;
        this.comments = comments;
    }

    //Methods
    //public TeachingUnit create(){}
    public void edit(){}
    //public TeachingUnit duplicate(){}
    //public TeachingUnit import(CSVFile file){}
    //public CSVFile export(){}
    public void delete(){}
    //public PDFFile print(){}

    //Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}