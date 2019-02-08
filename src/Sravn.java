import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class Sravn {
    private static List<Character> chars = new ArrayList<>();
    private static List<Character> chars2 = new ArrayList<>();
    public char []a = new char [chars.size()+10000];
    public char []a2 = new char [chars.size()+10000];
    public void read1(){
    BufferedReader reader = null;
                try {
        reader = new BufferedReader(new FileReader(new File("C://Users//Максим//Desktop//txt.txt")));

        int c;
        while ((c = reader.read()) != -1) {
            chars.add((char) c);
        }

        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        for (int b = 1; b < chars.size(); b++) {
        a[b] = chars.get(b);
    }
}
public void read2(){
    BufferedReader reader2 = null;
    try {
        reader2 = new BufferedReader(new FileReader(new File("C://Users//Максим//Desktop//txt2.txt")));

        int c2;
        while ((c2 = reader2.read()) != -1) {
            chars2.add((char) c2);
        }

        reader2.close();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (reader2 != null) {
            try {
                reader2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    for (int b2 = 1; b2 < chars2.size(); b2++) {
        a2[b2] = chars2.get(b2);
    }
}
public void check(){
        int h= 0;
    if (a.length>=a2.length){
        for (int i = 0; i<a.length; i++){
            if (a[i]!=a2[i]){
                h+=1;
            }
        }
    }
    if (a2.length>=a.length){
        for (int i2 = 0; i2<a2.length; i2++){
            if (a2[i2]!=a[i2]){
                h+=1;
            }
        }
    }
    if (a.length>=a2.length && h<100){
        for (int i = 0; i<a.length; i++){
            if (a[i]!=a2[i]){
                System.out.print(a[i]+"-"+a2[i]+", ");
            }
        }
    }
    if (a2.length>a.length && h<100){
        for (int i2 = 0; i2<a2.length; i2++){
            if (a2[i2]!=a[i2]){
                System.out.print(a2[i2]+"-"+a[i2]+", ");
            }
        }
    }
    if (a.length>=a2.length && h>100){
        for (int i = 0; i<100; i++){
            if (a[i]!=a2[i]){
                System.out.print(a[i]+"-"+a2[i]+", ");
            }
        }
        System.out.println(h);
    }
    if (a2.length>=a.length && h>100){
        for (int i2 = 0; i2<100; i2++){
            if (a2[i2]!=a[i2]){
                System.out.print(a2[i2]+"-"+a[i2]+", ");
            }
        }
        System.out.println(h);
    }
}
}


