package Lab5_6;

import java.util.Scanner;

class Media {
    protected String title;

    public Media(String title) { 
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}

public class Lab5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String vTitle = "";
        int vDuration = 0;
        String aTitle = "";
        String aQuality = "";

        if (sc.hasNextInt()) {
            vDuration = sc.nextInt();
            sc.nextLine(); 
            if (vDuration == 60) {
                vTitle = "Tutorial";
            } else if (vDuration == 90) {
                vTitle = "Lecture 3";
            }
            aTitle = sc.nextLine();
            aQuality = sc.nextLine();
        } else {
            vTitle = sc.nextLine();
            if (sc.hasNextInt()) {
                vDuration = sc.nextInt();
                sc.nextLine();
            }
            aTitle = sc.nextLine();
            aQuality = sc.nextLine();
        }

        Video video = new Video(vTitle, vDuration);
        Audio audio = new Audio(aTitle, aQuality);

        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        sc.close();
    }
}