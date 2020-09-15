package student.server;

import java.util.HashMap;
import java.util.Map;

/**
 * An abstract store for any type of adventure game.
 */
public interface AdventureService {
    /**
     * Resets the service to its initial state.
     */
    void reset();

    /**
     * Creates a new Adventure game.
     * @return the id of the game.
     *
     * TODO: Make Exception thrown more specific.
     */
    int newGame();

    // destroyGame(int id)

    // TODO: Handle client commands here.
    // For your convenience, here is a checklist of minimal commands your API must handle:
    // [ ] go
    // [ ] take
    // [ ] drop
    // [ ] <your custom command>
    // ... and any other commands you created
    CommandResult executeCommand(Command command);
}
