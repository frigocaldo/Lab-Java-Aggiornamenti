package it.unisa.school;

public class Professor extends Person {

    public final String topic;
    public final double wage;

    public Professor(String name, String surname, int birthYear, String topic, double wage){
        super(name, surname, birthYear);
        this.topic = topic;
        this.wage = wage;
    }
    public String getTopic(){
        return this.topic;
    }
    public double getWage(){
        return this.wage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Argomento='" + topic + '\'' +
                ", Stipendio=" + wage;
    }
}
