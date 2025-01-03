package faceless.artent.core.api;

public class CancellationToken {
    private boolean cancelled;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled() {
        cancelled = true;
    }
}
