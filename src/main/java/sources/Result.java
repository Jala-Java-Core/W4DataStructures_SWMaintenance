package sources;

import java.util.Random;

public class Result<Input> {
    private Integer value;

    public Result(Input input) {
        Random rand = new Random();
        int upperbound = input instanceof Integer == true ? (Integer)input : 1;
        value = rand.nextInt(upperbound);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
