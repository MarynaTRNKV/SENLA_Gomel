package fifth;

public class Objects {
    private int size;
    private int value;
    private  String name;
    private int costSize;

    public Objects(int size, int value, String name) {
        this.size = size;
        this.value = value;
        this.name = name;
        costSize = value*100/size;
    }

    public int getSize() {
        return size;
    }

    public int getValue() {
        return value;
    }

    public double getCostSize() {
        return costSize;
    }

    @Override
    public String toString() {
        return name + " объем: " + size +", ценность: " + value;
    }
}
