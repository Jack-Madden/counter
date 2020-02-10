package ie.gmit;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int starting) {
        if(starting < 1) throw new IllegalArgumentException("Must be greater than 0");
        else this.count = starting;
    }

    public int getCount() {
        return count;
    }

    public int increment() {
        ++count;
        return count;
    }

    public int decrement() {
        --count;
        return count;
    }
}
