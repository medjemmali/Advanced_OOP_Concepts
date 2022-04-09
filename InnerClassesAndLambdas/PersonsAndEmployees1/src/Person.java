/* TODO
Import the java.time.LocalDate and java.time.Period classes.
You will need them later. */

import java.time.LocalDate;
import java.time.Period;

/* TODO
Declare the class */
public class Person {
    /* TODO
Create two private member variables to hold the name and the birthDate of the employee. The birthdate has to be a LocalDate */
    private String name;
    private LocalDate birthDate;

    /* TODO
Create a member inner class called Position with two
member variables: a name and a salary. Override the toString()
method as specified in the instructions */
    private class Position {
        protected double salary ;
        protected String name ;

        public String toString() {
            return name +":" + salary;
        }
    }




    /* TODO
Create a member variable (of Person) of type Position. */
    Position position = new Position();

    /* TODO
Create a constructor for Person that takes in two Strings. A name and a birthdate in ISO format (yyyy-mm-dd) and sets the corresponding memeber variables correctly*/
    public Person (String name, String bDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(bDate);
    }

    /* TODO
Create a getAge method that returns the age in years of this person. You need to use the Period class here.*/

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(this.birthDate, today);
        int age = p.getYears();
        return age;
    }

    /* TODO
Code the setPosition method. This should take one String and one double for the title and the salary respectively. */

    public void setPosition(String nm, double pSalary) {
        position.name = nm;
        position.salary = pSalary;
    }

    /* TODO
A getter for position. */

    public String getPosition(){
        return position.name + "salary: " + position.salary;
    }


    /* TODO
Override the toString() method to display the person's name, age and position (with salary and title). */
   
    public String toString() {
        return "name: " + name + "\n" +
                "age: " + getAge() + "\n" +
                "position: " + position.name + "\n" +
                "salary: " + position.salary;
    }



    /* TODO
Finish closing curly braces and the class. */

}

