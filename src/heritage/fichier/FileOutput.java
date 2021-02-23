package heritage.fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput extends Output {

    private String filepath;

    public FileOutput(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void write(String line) throws IOException {
        FileWriter fw = new FileWriter(new File(this.filepath), true);

        fw.append(line + "\n");

        fw.close();
    }
}
