import java.util.ArrayList;
import java.util.List;
public class Resume {
 /* TODO
Create a public member inner class Education according to the specifications. */
     public class Education {
         String school;
         String major;

         public Education(String school, String major) {
             this.school = school;
             this.major = major;
         }

         public void setSchool(String str) {
             this.school = str;
         }

         public void setMajor(String str) {
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

/* TODO
Create a public static inner class called Experience, according to the specifications.*/

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


/* TODO
Create the Person and List of Education and List of experience objects. They should be private. */

    private Person p;
    private List<Education> educationList;
    private List<Experience> experienceList;


    public Resume(Person p){
/* TODO
This constructor should initialize the person and do all necessary initializations for the other methods to work.*/
        this.p = p;
        educationList = new ArrayList<>();
        experienceList = new ArrayList<>();
    }

/* TODO
Create the addEducation, addExperience and override the toString methods as specified. */

    public void addEducation (Education e) {
        educationList.add(e);
    }

    public void addExperience(Experience e) {
        experienceList.add(e);
    }
    public String toString() {
        String str = p.toString();
        str += "\n" + "Experience" + "\n";
        for(Experience e : experienceList)
            str+= e;
        str += "\n" + "Education" + "\n";
        for(Education e : educationList)
            str+= e;
        return str;

    }

}
