package study;

import system.IGModel;

public abstract class Module{

    //Attributes
    private String name;
    private String syllabus;
    private String evaluationMode;
    private Boolean compensatable;
    private int hourNb;
    private int[] repartition;
    private String comments;

    //Constructors
    public Module(){}
    public Module(String name, String syllabus, String evaluationMode, Boolean compensatable, int hourNb, String comments) {
        this.name = name;
        this.syllabus = syllabus;
        this.evaluationMode = evaluationMode;
        this.compensatable = compensatable;
        this.hourNb = hourNb;
        this.comments = comments;
    }

    //Methods
    //public Module create(){}
    public void save(){
        try {
            IGModel system = new IGModel();
            system.saveModule(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //public Module duplicate(){}
    public void edit(){}
    public void delete(){}
    //public CSVFile export(){}
    //public PDFFile print(){}
    //public Module import(CSVFile file){}

    //Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

   public String getEvaluationMode() {
        return evaluationMode;
    }

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    public Boolean getCompensatable() {
        return compensatable;
    }

    public void setCompensatable(Boolean compensatable) {
        this.compensatable = compensatable;
    }

    public int getHourNb() {
        return hourNb;
    }

    public void setHourNb(int hourNb) {
        this.hourNb = hourNb;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}