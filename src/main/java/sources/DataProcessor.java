package sources;

public class DataProcessor {
    //Code W4-10

    protected DataSource dataSource = new DataSource();

    public String myMethod(String arg) {
        //..
        var r = dataSource.query(arg);
        //...
        return r.toString();
    }

    public String anotherMethod() {
        //in this method dataSource is not necessary
        return "";
    }
}
