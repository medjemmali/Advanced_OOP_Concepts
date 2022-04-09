public class Task {
    public static void main(String[] args){
        Person p = new Person("Mo Jemmali","2000-01-01");
        p.setPosition("Engineer", 50000);
        Resume r = new Resume(p);
        Resume.Education ed = r.new Education("NEIU", "Computer Science");
        /* TODO Create an education object. Schoo is NEIU, major is Computer Science.*/
        /* TODO add this education object to the resume "r"*/
        r.addEducation(ed);
        Resume.Experience ex = new Resume.Experience("Help Desk", 2014,2017);
        /* TODO Create a new Experience object and add it to the resume.*/
        /* TODO Create a new experience object on the fly, inside the addExperiece call.*/
        r.addExperience(ex);
        r.addExperience(new Resume.Experience("Network Admin",2017,2019));
        r.addExperience(new Resume.Experience("Sr Network Admin", 2019,2021));
        System.out.println(r); //watch the resume print.

    }
}