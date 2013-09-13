
package dataprep;

import java.io.*;

/**
 *
 * @author stuart
 */
public class Extractor {

    public Extractor() {
    }

    public static BufferedReader getBufferedReader(String fullPathToFile) {
        try {
            FileReader fr = new FileReader(fullPathToFile);
            BufferedReader br = new BufferedReader(fr);
            return br;
        } catch (IOException ioexception) {
            System.out.println("IO Error caught: " + ioexception);
            return null;
        } catch (Exception generalexception) {
            System.out.println("General error caught: " + generalexception);
            return null;
        }
    }

    public static FileWriter getFileWriter(String fullPathToFile) {
        try {
            FileWriter fw = new FileWriter(fullPathToFile);
            return fw;
        } catch (IOException ioexception) {
            System.out.println("IO Error caught: " + ioexception);
            return null;
        } catch (Exception generalexception) {
            System.out.println("General error caught: " + generalexception);
            return null;
        }
    }
//
//    public File[] getDirectoryListing(String fullPathToDirectory) {
//        File folder = new File(fullPathToDirectory);
//        File[] listOfFiles = folder.listFiles();
//        return listOfFiles;
//    }
}
