package Lab5_11;

import java.util.Scanner;

class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }

    public int getPageCount() {
        return pageCount;
    }
}

public class Lab5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t1 = sc.nextLine();
        int w1 = Integer.parseInt(sc.nextLine());
        String t2 = sc.nextLine();
        int p1 = Integer.parseInt(sc.nextLine());
        String t3 = sc.nextLine();
        int w2 = Integer.parseInt(sc.nextLine());
        String t4 = sc.nextLine();
        int p2 = Integer.parseInt(sc.nextLine());

        Document[] docs = new Document[4];
        docs[0] = new TextDocument(t1, w1);
        docs[1] = new PDFDocument(t2, p1);
        docs[2] = new TextDocument(t3, w2);
        docs[3] = new PDFDocument(t4, p2);

        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.getPageCount();
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);
        
        sc.close();
    }
}