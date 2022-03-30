public class Racer implements Runnable /* TODO
Add something here so that you can pass this Racer to the constructor of Thread*/{
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    /* TODO
Create a constructor that receives a Car objec and initializes c.*/

    public Racer(Car c) {
        this.c = c;
    }

    @Override
    /* TODO
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
    public void run() {

        try {
            while (c.odometer < distance)
            {
                System.out.println("In the while loop: " + c.toString());

                if(c.miles == 0) {
                    System.out.println("Charging");

                    Thread.sleep((long)c.maxMiles);
                    c.charge();

                }
                c.move(1);
            }
            System.out.println(c.name + " finished");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }


    }
}
