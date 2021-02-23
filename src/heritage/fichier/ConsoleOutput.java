package heritage.fichier;

public class ConsoleOutput extends Output {

    @Override
    public void write(String line) {
        System.out.println(line);
    }
}
