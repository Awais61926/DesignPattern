/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author Lenovo
 */
import java.nio.charset.StandardCharsets;

interface DataSource {
    void writeData(String data);
    String readData();
}

class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    public void writeData(String data) {

    }

    public String readData() {
        return "";
    }
}

    class DataSourceDecorator implements DataSource {
        protected DataSource wrappee;

        public DataSourceDecorator(DataSource source) {
            this.wrappee = source;
         }

        public void writeData(String data) {
            wrappee.writeData(data);
        }

        public String readData() {
            return wrappee.readData();
        }
}
class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
    }

    public String readData() {
        return "";
    }
}

class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
    }

    public String readData() {
        return "";
    }
}

class UTF8Decorator extends DataSourceDecorator {
    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        byte[] utf8Data = data.getBytes(StandardCharsets.UTF_8);
        String encodedData = new String(utf8Data, StandardCharsets.UTF_8);
        wrappee.writeData(encodedData);
    }

    @Override
    public String readData() {
        String encodedData = wrappee.readData();
        byte[] utf8Data = encodedData.getBytes(StandardCharsets.UTF_8);
        return new String(utf8Data, StandardCharsets.UTF_8);
    }
}