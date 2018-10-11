package custom;

import vendor.matchmaker.Matchmaker;
import vendor.queue.Player;
import vendor.queue.PlayerQueue;
import vendor.queue.QueuePosition;
import vendor.server.GameServer;

import java.util.ArrayList;
import java.util.List;

public class CustomMatchmaker extends Matchmaker {

    public CustomMatchmaker(PlayerQueue queue, GameServer server) {
        super(queue, server);
    }

    @Override
    public void tick() {
        List<Player> players = new ArrayList<>(5);
        QueuePosition position;
        do {
            position = queue().poll();
            if (position != null) {
                players.add(position.getPlayer());
                if (players.size() == 5) {
                    server().fireGame(new ArrayList<>(players));
                    players.clear();
                }
            }
        } while (position != null);
    }

}
