package vendor.matchmaker;

import vendor.queue.PlayerQueue;
import vendor.server.GameServer;

public abstract class Matchmaker {

    private final PlayerQueue queue;
    private final GameServer server;

    protected Matchmaker(PlayerQueue queue, GameServer server) {
        this.queue = queue;
        this.server = server;
    }

    protected final GameServer server() {
        return server;
    }

    protected final PlayerQueue queue() {
        return queue;
    }

    public abstract void tick();

}
