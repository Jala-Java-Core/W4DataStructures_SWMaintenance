package sources;

public class DataSource {
    public Result query(String arg) {
        return new Result(arg);
    }
}
