package kata3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        String fileName= "/home/joaquin/NetBeansProjects/KATA3/Data/emailsfilev1.txt";
        try {
            BufferedReader filenIn = new BufferedReader(new FileReader(fileName));
            String mail;
            while((mail=filenIn.readLine())!=null){
                if(mail.contains("@")){
                    histogram.increment(mail.split("@")[1]);
                }
            }
        } catch (Exception e) {
            System.out.println("El fichero no existe");
        }
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }

}
