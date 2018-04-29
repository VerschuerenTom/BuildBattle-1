package me.tomthedeveloper.buildbattle.selfmadeevents;

import me.tomthedeveloper.buildbattle.arena.ArenaState;
import me.tomthedeveloper.buildbattle.arena.Arena;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by Tom on 1/11/2015.
 */
public class GameChangeStateEvent extends Event {


    private static final HandlerList handlers = new HandlerList();
    private ArenaState gameState;
    private Arena buildInstance;
    private ArenaState previous;

    public GameChangeStateEvent(ArenaState gameState, Arena buildInstance, ArenaState previous) {
        this.gameState = gameState;
        this.buildInstance = buildInstance;
        this.previous = previous;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public ArenaState getState() {
        return gameState;
    }

    public Arena getBuildInstance() {
        return buildInstance;
    }

    public ArenaState getPreviousState() {
        return previous;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
