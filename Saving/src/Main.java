import java.io.*;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {

        ArrayList<GameProgress> progressesList = new ArrayList<>();
        progressesList.add(new GameProgress(83, 256, 1036, 9));
        progressesList.add(new GameProgress(98, 331, 1836, 13));
        progressesList.add(new GameProgress(64, 136, 2436, 19));

        ArrayList<String> savesList = new ArrayList<>();

        for (int i = 0; i < progressesList.size(); i++) {
            saveGame("D://Games//saveGames/save" + (i + 1) + ".dat", progressesList.get(i));
            savesList.add("D://Games//saveGames/save" + (i + 1) + ".dat");
        }

        zipFiles("D://Games//saveGames/archive.zip", savesList);
        deleteFiles(savesList);
    }

    public static void saveGame(String filePath, GameProgress progress) {
        try(FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(progress);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void zipFiles(String pathToZip, ArrayList<String> savesList) {
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(pathToZip))) {

            for (String save : savesList) {
                try (FileInputStream fileIn = new FileInputStream(save)) {

                    ZipEntry entry = new ZipEntry(save);
                    zipOut.putNextEntry(entry);
                    byte[] buffer = new byte[fileIn.available()];
                    fileIn.read(buffer);
                    zipOut.write(buffer);
                    zipOut.closeEntry();

                } catch (IOException exception) {
                    System.out.println(exception.getMessage());
                }
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void deleteFiles(ArrayList<String> saves) {
        for (String save : saves) {
            File file = new File(save);
            file.delete();
        }

    }
}