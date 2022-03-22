package extra_exercise1.util;

import extra_exercise.ultil.NotFoundFileException;

public class NotFoundProductException extends Exception {
    public NotFoundProductException (String message){
        super(message);
    }
}
