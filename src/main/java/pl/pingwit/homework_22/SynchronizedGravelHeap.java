package pl.pingwit.homework_22;

public class SynchronizedGravelHeap extends GravelHeap {
    public int amount() {
        return super.amount();
    }

    public void increase() {
        synchronized (this) {
            weight = weight + 2;
        }
    }
}
