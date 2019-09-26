import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ex4 {
    public class Answer {
        public int status = 0;
        public String er;
        public ArrayList<Double> data = new ArrayList<>();
    }

    private Answer readValues(String filename) {
        File f = new File(filename);
        Answer a = new Answer();
        if (!f.exists()) {
            a.status = 1;
            a.er = "Cant read file " + filename;
        }
        else {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(f);
                Scanner scanner = new Scanner(f);
                while (scanner.hasNext()) {
                    if (scanner.hasNextDouble()) {
                        a.data.add(scanner.nextDouble());
                    } else {
                        a.status = 1;
                        a.er = "No double";
                        break;
                    }
                }
            } catch (FileNotFoundException ex) {
                a.status = 1;
                a.er = "File not found";
            } catch (IOException ex) {
                a.status = 1;
                a.er = "Somthing bad";
            }finally {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException ex) {
                        if (a.status != 0) {
                            a.er += " and we can not close file";
                        } else {
                            a.status = 1;
                            a.er = "Problem with close file";
                        }
                    }
                }
            }
        }
        return a;
    }
    public void func(String filename) {
        Answer a = this.readValues(filename);
        if (a.status == 0) {
            System.out.println(a.data.toString());
        } else {
            System.err.println(a.er);
        }
    }
    public static void main(String[] args) {
        ex4 tmp = new ex4();
        tmp.func("/Users/p.starikov/studing/lr5/src/main/java/file.txt");
        tmp.func("AA");
        tmp.func("/Users/p.starikov/studing/lr5/src/main/java/good");
    }
}
