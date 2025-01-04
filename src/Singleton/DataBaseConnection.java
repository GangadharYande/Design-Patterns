package src.Singleton;

public class DataBaseConnection {

    private static DataBaseConnection instance =null;

    String url;
    String username;
    String password;


    public static  DataBaseConnection getInstance(){

        if(instance == null){
            instance = new DataBaseConnection();
        }
        return instance;
    }
}