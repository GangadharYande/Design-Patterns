package src.Singleton;

public class Client {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection1 =DataBaseConnection.getInstance();
        DataBaseConnection dataBaseConnection2 =DataBaseConnection.getInstance();


        if(dataBaseConnection1 == dataBaseConnection2){
            System.out.println("DataBaseConnections are equal");
        }else {
            System.out.println("DataBaseConnections are not equal");
        }

        System.out.println(dataBaseConnection1+" "+ dataBaseConnection2);


    }
}
