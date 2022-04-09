/* TODO */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*The imports will self populate. You don't have to do anything.*/

public class Resume {
    public class Education {
        String school;
        String major;
        public Education (String school, String major) {
            this.school = school;
            this.major = major;
        }
        public void setSchool(String str) {
            this.school = str;
        }
        public void setMajor(String str){
            this.major = str;
        }
        public String getSchool() {
            return this.school;
        }
        public String getMajor() {
            return this.major;
        }
        public String toString() {
            return this.major + " at " + this.school;
        }
    }
    public static class Experience {
        String title;
        int fromYear;
        int toYear;

        public Experience(String title, int start, int end) {
            this.title = title;
            this.fromYear = start;
            this.toYear = end;
        }
        public String toString() {
            return this.fromYear + "-" +this.toYear+":"+this.title;
        }
    }

    private Person p;
    private List<Education> educationList;
    private PriorityQueue<Experience> exQueue;

    /* TODO Create a Priority Queue that holds values of type Experience.*/
    public Resume(Person p){
        this.p = p;
        educationList = new ArrayList<>();
        exQueue = new PriorityQueue<>((a, b) -> b.toYear - a.toYear);
        /* TODO Assign a value to the Person variable.*/
        /* TODO Initialize the List with Education objects.*/
        /* TODO Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.*/
    }
    public PriorityQueue getExperience() {
        return exQueue;
    }
    /* TODO Add a standard getter for the experiences. getExperience. it should return a priority queue.*/
    public void addEducation (Education e) {
        educationList.add(e);
    }

    public void addExperience(Experience e) {
        exQueue.add(e);
    }
    public String toString() {
        String str = p.toString();
        str += "\n" + "Experience" + "\n";
        for(Experience e : exQueue)
            str+= e;
        str += "\n" + "Education" + "\n";
        for(Education e : educationList)
            str+= e;
        return str;

    }
    /* TODO Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)*/

}