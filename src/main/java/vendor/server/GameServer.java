package vendor.server;

import vendor.queue.Player;
import vendor.queue.options.MapChoice;

import java.util.Collection;

public interface GameServer {

    void fireGame(Collection<Player> players, MapChoice map);

    default void fireGame(Collection<Player> players) {
        fireGame(players, null);
    }

}
