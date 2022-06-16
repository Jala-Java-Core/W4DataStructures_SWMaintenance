package sources;

import sources.Result;

import java.util.HashMap;
import java.util.Map;

public class MyClass<Input> {
    // Code W4-12
    private Map<Input, Result> results = new HashMap<Input, Result>();

    public void put(Input i, Result r) {
        results.put(i, r);
    }

    public Result get(Input i) {
        return results.get(i);
    }

    public Result doCalculation(Input input) {
        //memoization
        if (input == null) {
            return null;
        }
        if (results.containsKey(input)) {
            return results.get(input);
        } else {
            Result result = calculateResult(input);
            results.put(input, result);
            return result;
        }
    }
    private Result calculateResult(Input input) {
        Result res = new Result();
        /*put(input, res);
        return doCalculation(input);*/
        return res;
    }
}
