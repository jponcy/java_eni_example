package heritage.fichier;

import java.io.IOException;

public abstract class Output {
    public abstract void write(String line) throws IOException;
}
