package twitter4j.internal.models4j;

/**
 * Created by poly on 11/02/14.
 */
public class TwitterRuntimeException extends RuntimeException {

    private final TwitterException twitterException;

    public TwitterRuntimeException(Throwable cause, TwitterException twitterException) {
        super(cause);
        this.twitterException = twitterException;
    }

    public TwitterException getTwitterException() {
        return twitterException;
    }
}
