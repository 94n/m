package designpatterns.objectpool;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PooledObject pooledObject = PooledObjectPool.getObject();
        System.out.println(pooledObject);
        PooledObject pooledObject2 = PooledObjectPool.getObject();
        System.out.println(pooledObject2);
        PooledObjectPool.releaseObject(pooledObject2);
        PooledObject pooledObject3 = PooledObjectPool.getObject();
        System.out.println(pooledObject3);
        PooledObjectPool.releaseObject(pooledObject3);
        Thread.sleep(6000);
        PooledObject pooledObject4 = PooledObjectPool.getObject();
        System.out.println(pooledObject4);

    }

}
