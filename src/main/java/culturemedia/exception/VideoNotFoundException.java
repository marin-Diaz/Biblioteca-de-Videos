package culturemedia.exception;

import java.text.MessageFormat;

public class VideoNotFoundException extends CultureMediaException{

    public VideoNotFoundException(){
        super("Video not found");
    }

    public VideoNotFoundException(String title) {
        super(MessageFormat.format("The video with the title was not found {0}  ",title));
    }


}
