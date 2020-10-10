package lecture6.Assignment;
//1876166 박지윤 과제 6주차

abstract class Student {
    protected int type;
    protected String name;
    protected int score;
    protected String grade;

    public Student(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setType(int type){
        this.type = type;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    protected String getName() {
        return name;
    }
    protected int getScore() {
        return score;
    }
    protected String getGrade() {
        return grade;
    }
    abstract public void computeGrade();
    public String showInfo(){
        String result = "소속\t\t이름\t점수\t학점\n";
        if(type ==1) result +="학부생";
        else result +="대학원생";
        result +="\t"+getName();
        result +="\t"+getScore();
        result +="\t"+getGrade();
        return result;
    }


}
