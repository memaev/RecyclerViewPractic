package mic.maev.recyclerviewpractic;

public class Student {
    private String fullname;
    private int clas;
    private int skills;

    public Student (String fullname, int clas, int skills){
        this.fullname = fullname;
        this.clas = clas;
        this.skills = skills;
    }

    public String getFullname(){
        return this.fullname;
    }

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public int getClas(){
        return this.clas;
    }

    public void setClas(int clas){
        this.clas = clas;
    }

    public int getSkills(){
        return this.skills;
    }

    public void setSkills(int skills){
        this.skills = skills;
    }
}
