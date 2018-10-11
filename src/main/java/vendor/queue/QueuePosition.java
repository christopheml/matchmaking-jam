package vendor.queue;

import vendor.queue.options.QueueOptions;

/**
 * Represents a player being in vendor.queue.
 */
public class QueuePosition {

    private final Player player;

    private final QueueOptions options;

    private int age;

    public QueuePosition(Player player, QueueOptions options) {
        this.player = player;
        this.options = options;
    }

    public Player getPlayer() {
        return player;
    }

    public QueueOptions getOptions() {
        return options;
    }

    public void tick() {
        age++;
    }

}
