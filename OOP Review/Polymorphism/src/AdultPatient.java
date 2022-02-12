import java.util.ArrayList;

public class AdultPatient extends ChildPatient implements Employable {

    ArrayList<String> previousJobs;

    @Override
    public ArrayList<String> getPreviousJobs() {

        return this.previousJobs;
    }

    @Override
    public void addJob(String job) {
        if(previousJobs == null)
            previousJobs = new ArrayList<String>();
        previousJobs.add(job);
    }
}

        /* TODO
Implement the class Adult Patient. 
An adult patient is a Person that is Diagnosable and that is Employable.
*/