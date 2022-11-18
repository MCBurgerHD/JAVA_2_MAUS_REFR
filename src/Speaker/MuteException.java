package Speaker;

/**
 * Created: 24.05.2022
 *
 * @author Maximilian Ertl (Maximilian Ertl)
 */

public class MuteException extends Exception{
    public MuteException() {}

    public MuteException(String nachricht) {
        super(nachricht);
    }
}
