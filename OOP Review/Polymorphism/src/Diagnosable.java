public interface Diagnosable {
    double getTemperature();
    /* TODO
Declare a hasFever method that reutrns true is the temperature
is greater than 100.4 */

    default boolean hasFever(){
        if(this.getTemperature() > 100.4)
            return true;

        return false;
    }
    int getSystolic();
    int getDiastolic();
    void setTemperature(double t);
    void setSystolic(int s);
    void setDiastolic(int d);

/* TODO
Decleare two setters. One for systolic and one for diastolic.
Check the getters to infer the parameter types. */
}
