package sources;

public class DataProcessor2 {
    //Code W4-10

    protected DataSource dataSource;

    public String myMethod(String arg) {
        //..
        if  (dataSource == null) {
            dataSource = new DataSource();
        }
        Result r = dataSource.query(arg);
        //...
        return r.toString();
    }

    public String anotherMethod() {
        //in this method dataSource is not necessary
        return "";
    }
}
