package main.java.question;

public class Student {
    private String studnetNum;
    private String name;
    private String score;
    private Grade grade;

    public Student() {
    }

    public Student(String studnetNum, String name, Grade grade) {
        this.studnetNum = studnetNum;
        this.name = name;
        this.score = score;
        this.grade = grade;
    }

    public String getStudnetNum() {
        return studnetNum;
    }

    public void setStudnetNum(String studnetNum) {
        this.studnetNum = studnetNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studnetNum='" + studnetNum + '\'' +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                ", grade=" + grade +
                '}';
    }
}
