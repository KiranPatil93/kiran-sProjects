package Utility;

public class FileReaderManager {
    private static FileReaderManager fileReaderManager = new FileReaderManager();
    public static ConfigFileReader configFileReader;

    private FileReaderManager() {

    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}
