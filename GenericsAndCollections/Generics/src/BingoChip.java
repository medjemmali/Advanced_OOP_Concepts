public class BingoChip<T, U>{
    T obj1;
    U obj2;
    public BingoChip(T obj1, U obj2) {
        this.obj1=obj1;
        this.obj2=obj2;
    }

    @Override
    public String toString() {
        return "Chip:" + obj1 + "-" + obj2;
    }
}/* TODO
Implement this class.
Use the instructions and check how it is used in Task.java*/


