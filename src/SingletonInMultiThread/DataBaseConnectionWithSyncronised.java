package src.SingletonInMultiThread;



public class DataBaseConnectionWithSyncronised {
    private static DataBaseConnectionWithSyncronised instance = null;

    String url;
    String username;
    String password;
    private DataBaseConnectionWithSyncronised() {

    }
    public static synchronized  DataBaseConnectionWithSyncronised getInstance() {
        if (instance == null) {
            instance  = new DataBaseConnectionWithSyncronised();
        }
        return instance;
    }
}

