package study;

public class Coeff{

    // Attributes
    private Module module; //le module associé au Coeff
    private int coefficient;
    private int nbHoursTotal;
    private int nbHoursLecture; //nbHeuresCM
    private int nbHoursTutorial; //nbHeuresTD
    private int nbHoursPracticalWork; //nbHeuresTP
    private int nbHoursProject; //nbHeuresProjet

    // Constructors
    public Coeff(){}

    public Coeff(int coefficient) {
        this.coefficient = coefficient;
    }

    public Coeff(Module module, int coefficient, int nbHoursTotal, int nbHoursLecture, int nbHoursTutorial, int nbHoursPracticalWork, int nbHoursProject) {
        this.module = module;
        this.coefficient = coefficient;
        this.nbHoursTotal = nbHoursTotal;
        this.nbHoursLecture = nbHoursLecture;
        this.nbHoursTutorial = nbHoursTutorial;
        this.nbHoursPracticalWork = nbHoursPracticalWork;
        this.nbHoursProject = nbHoursProject;
    }

    // Getters & Setters
    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public int getNbHoursTotal() {
        return nbHoursTotal;
    }

    public void setNbHoursTotal(int nbHoursTotal) {
        this.nbHoursTotal = nbHoursTotal;
    }

    public int getNbHoursLecture() {
        return nbHoursLecture;
    }

    public void setNbHoursLecture(int nbHoursLecture) {
        this.nbHoursLecture = nbHoursLecture;
    }

    public int getNbHoursTutorial() {
        return nbHoursTutorial;
    }

    public void setNbHoursTutorial(int nbHoursTutorial) {
        this.nbHoursTutorial = nbHoursTutorial;
    }

    public int getNbHoursPracticalWork() {
        return nbHoursPracticalWork;
    }

    public void setNbHoursPracticalWork(int nbHoursPracticalWork) {
        this.nbHoursPracticalWork = nbHoursPracticalWork;
    }

    public int getNbHoursProject() {
        return nbHoursProject;
    }

    public void setNbHoursProject(int nbHoursProject) {
        this.nbHoursProject = nbHoursProject;
    }
}