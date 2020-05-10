package Section4_HowToSolveCodingProblems;

public class Arr1Obj {

    public String key;
    public boolean value;

    public Arr1Obj(String key, boolean value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public boolean isValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Map{" +
                "value='" + key + '\'' +
                ", type=" + value +
                '}';
    }
}
