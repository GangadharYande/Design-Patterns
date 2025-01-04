package src.SingletonInMultiThread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Set<DataBaseConnectionWithSyncronised> dataBaseConnectionSynchronised = new HashSet<>();
        Set<DataBaseConnectionWithEagerLoading> dataBaseConnectionWithEagerLoadings = new HashSet<>();
        Set<DataBaseConnectionSyncWithDoubleLocking> dataBaseConnectionSyncWithDoubleLocking = new HashSet<>();
        ExecutorService executorServices = Executors.newCachedThreadPool();

        for(int i = 0; i < 10000; i++){
            executorServices.submit(()->dataBaseConnectionSynchronised.add(DataBaseConnectionWithSyncronised.getInstance()));
            executorServices.submit(()->dataBaseConnectionWithEagerLoadings.add(DataBaseConnectionWithEagerLoading.getInstance()));
            executorServices.submit(()->dataBaseConnectionSyncWithDoubleLocking.add(DataBaseConnectionSyncWithDoubleLocking.getInstance()));
        }
        Thread.sleep(5000);
        System.out.println("Size of dataBaseConnectionSetWithSynchronised: " + dataBaseConnectionSynchronised.size());
        System.out.println("Size of dataBaseConnectionSetWithEagerLoadings " + dataBaseConnectionWithEagerLoadings.size());
        System.out.println("Size of dataBaseConnectionSetWithSynchronisedWithDoubleCheckLocking: " + dataBaseConnectionSyncWithDoubleLocking.size());
        executorServices.shutdown();

    }
}
