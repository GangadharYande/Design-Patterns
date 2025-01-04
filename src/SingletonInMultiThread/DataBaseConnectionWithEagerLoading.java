package src.SingletonInMultiThread;

public class DataBaseConnectionWithEagerLoading {

    private static DataBaseConnectionWithEagerLoading instance = new DataBaseConnectionWithEagerLoading();

    String url;
    String username;
    String password;
    private DataBaseConnectionWithEagerLoading() {

    }
    public static DataBaseConnectionWithEagerLoading getInstance() {
        return instance;
    }
}
