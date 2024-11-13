package edu.cpp.cs5800.flyweight;
import static edu.cpp.cs5800.flyweight.CharacterFormat.*;

public class Driver {
    public static void main(String[] args) {
        String docFileName = "document.txt";

        Document document = createDocument();
        System.out.print(document.getContent());

        document.save(docFileName);
        System.out.println(">> Successfully saved the document file: " + docFileName + "\n");

        Document loadedDoc = loadDocument(docFileName);
        System.out.println(loadedDoc.getContent());

        editDocument(loadedDoc);
        System.out.println(loadedDoc.getContent());

    }

    private static Document createDocument() {
        System.out.println(">> Creating a new document");
        Document document = new Document();
        document.addCharacter('H', Font.ARIAL, Color.RED, 12);
        document.addCharacter('e', Font.ARIAL, Color.BLACK, 12);
        document.addCharacter('l', Font.CALIBRI, Color.BLUE, 14);
        document.addCharacter('l', Font.CALIBRI, Color.BLUE, 14);
        document.addCharacter('o', Font.VERDANA, Color.BLACK, 16);
        document.addCharacter('W', Font.VERDANA, Color.RED, 16);
        document.addCharacter('o', Font.ARIAL, Color.RED, 12);
        document.addCharacter('r', Font.CALIBRI, Color.BLUE, 14);
        document.addCharacter('l', Font.VERDANA, Color.BLACK, 16);
        document.addCharacter('d', Font.ARIAL, Color.BLACK, 12);
        document.addCharacter('C', Font.CALIBRI, Color.BLUE, 14);
        document.addCharacter('S', Font.VERDANA, Color.BLACK, 16);
        document.addCharacter('5', Font.ARIAL, Color.RED, 12);
        document.addCharacter('8', Font.CALIBRI, Color.BLUE, 14);
        document.addCharacter('0', Font.VERDANA, Color.RED, 16);
        document.addCharacter('0', Font.ARIAL, Color.BLACK, 12);
        return document;
    }

    private static Document loadDocument(String fileName) {
        System.out.println(">> Loading the document from file: " + fileName);
        Document document = new Document();
        document.load(fileName);
        return document;
    }

    private static void editDocument(Document document) {
        System.out.println(">> Editing document");
        document.edit(1, 'E', Font.CALIBRI, Color.BLUE, 16);
        document.edit(2, 'L', Font.ARIAL, Color.BLUE, 12);
        document.edit(3, 'L', Font.ARIAL, Color.BLACK, 14);
        document.edit(4, 'O', Font.VERDANA, Color.RED, 12);
    }
}
