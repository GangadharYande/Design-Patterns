package src.SingletonInMultiThread;

public class DataBaseConnectionSyncWithDoubleLocking {
    private static DataBaseConnectionSyncWithDoubleLocking instance = null;

    String url;
    String username;
    String password;
    private DataBaseConnectionSyncWithDoubleLocking() {

    }
    public static   DataBaseConnectionSyncWithDoubleLocking getInstance() {
        if (instance == null) {
            synchronized (DataBaseConnectionSyncWithDoubleLocking.class) {
                if (instance == null) {
                    instance = new DataBaseConnectionSyncWithDoubleLocking();
                }
            }
        }
        return instance;
    }
}

