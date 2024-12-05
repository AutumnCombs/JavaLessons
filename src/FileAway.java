import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.*;
import java.util.ArrayList;
/**
 *
 * @author acombs
 *
 * Demonstrates how to use Java NIO, a thread safe File IO library
 * to write a text file
 */
public class NIOWriteTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test data the lines of the file we will write
        ArrayList<String> recs = new ArrayList<>();
        recs.add("Sample data for our file writing example.");
        recs.add("Sample data Line 2.");
        recs.add("Sample data Line 3.");
        recs.add("Sample data Line 4.");
        recs.add("Sample data Line 5.");
    }
}