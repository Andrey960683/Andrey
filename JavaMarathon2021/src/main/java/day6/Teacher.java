package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }
    public void evaluate(Student student){
        Random random = new Random();
        int rand = random.nextInt(4)+2;
        String evalutare= "";
        switch (rand){
            case 2:
                evalutare ="неудовлетворительно";
                break;
            case 3:
                evalutare= "удовлетворительно";
                break;
            case 4:
                evalutare="хорошо";
                break;
            case 5:
                evalutare ="отлично";
                break;

        }
        System.out.println("Преподаватель "+ this.name+" оценил студента с именем "+student.getName()+" по предмету "+this.lesson+" на оценку "+evalutare+".");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public String getLesson() {
        return lesson;
    }
}

