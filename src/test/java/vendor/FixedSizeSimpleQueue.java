package vendor;

import vendor.queue.Player;
import vendor.queue.PlayerQueue;
import vendor.queue.QueuePosition;
import vendor.queue.options.QueueOptions;

public class FixedSizeSimpleQueue implements PlayerQueue, TestQueue {

    private int count;

    private FixedSizeSimpleQueue(int count) {
        this.count = count;
    }

    @Override
    public QueuePosition poll() {
        if (count > 0) {
            count--;
            return new QueuePosition(new Player(), new QueueOptions());
        }
        return null;
    }

    @Override
    public boolean peek() {
        return count > 0;
    }

    public static FixedSizeSimpleQueue create() {
        return new FixedSizeSimpleQueue(20);
    }

}
