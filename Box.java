public class Box {
    private Object value;

    public Box (){

    }

    public Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }

    private static class Singlenton {
        private static final Box instance = new Box();

    }

    public static Box getInstance(){
        return  Singlenton.instance;
    }
}
