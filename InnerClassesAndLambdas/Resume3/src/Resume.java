import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume { public class Education {
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

    /* TODO Same two inner classes and member variables as in task 3.*/

    public Resume(Person p) {
        this.p = p;
        educationList = new ArrayList<>();
        exQueue = new PriorityQueue<>((a, b) -> b.toYear - a.toYear);
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
    /* TODO Same initialization of Person and the List of Education objects*/

    /* TODO Initialize the priority queue in one line, without importing the Comparator interface.*/

    /* TODO The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()*/

}