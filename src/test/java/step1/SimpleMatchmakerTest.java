package step1;

import custom.CustomMatchmaker;
import org.junit.Test;
import org.mockito.Mockito;
import vendor.FixedSizeSimpleQueue;
import vendor.matchmaker.Matchmaker;
import vendor.server.GameServer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class SimpleMatchmakerTest {

    @Test
    public void validateMatchmaker() {
        GameServer gameServer = Mockito.mock(GameServer.class);
        FixedSizeSimpleQueue queue = FixedSizeSimpleQueue.create();
        Matchmaker matchmaker = new CustomMatchmaker(queue, gameServer);

        while (queue.peek()) {
            matchmaker.tick();
        }

        verify(gameServer, times(4)).fireGame(any());
    }

}
