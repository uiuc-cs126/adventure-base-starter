package student.server;

import java.util.List;
import java.util.Map;

/**
 * The resultant message
 */
public class CommandResult {
    private boolean error;
    private String message;
    private String imageUrl;
    private String videoUrl;
    private AdventureState state;
    private Map<String, List<String>> commandOptions;

    public CommandResult(boolean error, String message, String imageUrl, String videoUrl, AdventureState state, Map<String, List<String>> commandOptions) {
        this.error = error;
        this.message = message;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.state = state;
        this.commandOptions = commandOptions;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public AdventureState getState() {
        return state;
    }

    public Map<String, List<String>> getCommandOptions() {
        return commandOptions;
    }
}
