import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        Sravn sr = new Sravn();
        sr.read1();
        sr.read2();
        sr.check();
    }
}

