import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        GregorianCalendar date = new GregorianCalendar();

        File src = new File("D://Games", "src");
        if (src.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(src.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(src.getPath())
                    .append("\n");
        }

        File rec = new File("D://Games", "rec");
        if (rec.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(rec.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(rec.getPath())
                    .append("\n");
        }

        File saveGames = new File("D://Games", "saveGames");
        if (saveGames.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(saveGames.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(saveGames.getPath())
                    .append("\n");
        }

        File temp = new File("D://Games", "temp");
        if (temp.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(temp.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(temp.getPath())
                    .append("\n");
        }

        File main = new File("D://Games/src", "main");
        if (main.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(main.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(main.getPath())
                    .append("\n");
        }

        File test = new File("D://Games/src", "test");
        if (test.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(test.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(test.getPath())
                    .append("\n");
        }

        File mainClass = new File("D://Games/src/main", "Main.java");
        if (mainClass.createNewFile()) {
            stringBuilder.append(date.getTime())
                    .append(" | File ")
                    .append(mainClass.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(mainClass.getPath())
                    .append("\n");
        }

        File utilsClass = new File("D://Games/src/main", "Utils.java");
        if (utilsClass.createNewFile()) {
            stringBuilder.append(date.getTime())
                    .append(" | File ")
                    .append(utilsClass.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(utilsClass.getPath())
                    .append("\n");
        }

        File drawables = new File("D://Games/rec", "drawables");
        if (drawables.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(drawables.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(drawables.getPath())
                    .append("\n");
        }

        File vectors = new File("D://Games/rec", "vectors");
        if (vectors.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(vectors.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(vectors.getPath())
                    .append("\n");
        }

        File icons = new File("D://Games/rec", "icons");
        if (icons.mkdir()) {
            stringBuilder.append(date.getTime())
                    .append(" | Folder ")
                    .append(icons.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(icons.getPath())
                    .append("\n");
        }

        File log = new File("D://Games/temp", "text.txt");
        if (log.createNewFile()) {
            stringBuilder.append(date.getTime())
                    .append(" | File ")
                    .append(log.getName())
                    .append("\s")
                    .append("was successfully created. Path: ")
                    .append(log.getPath())
                    .append("\n");
        }

        try(FileWriter fileWriter = new FileWriter(log)) {
            fileWriter.write(String.valueOf(stringBuilder));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }
}