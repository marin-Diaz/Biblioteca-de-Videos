package culturemedia.exception;

import java.text.MessageFormat;

public class DuracionNotValidException extends CultureMediaException{

    public DuracionNotValidException(String title, Double duration ) {
        super(MessageFormat.format("(\"No videos were found with the title {0} and duration {1} ",title,duration));
    }
}
