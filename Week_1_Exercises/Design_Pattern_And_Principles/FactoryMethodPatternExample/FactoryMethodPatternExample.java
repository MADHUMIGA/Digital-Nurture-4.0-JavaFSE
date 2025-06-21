package digital.nurture;

//Document Interface
interface Document {
 void open();
}

// Concrete Document Classes
class WordDocument implements Document {
 @Override
 public void open() {
     System.out.println("Opening a Word document.");
 }
}

class PdfDocument implements Document {
 @Override
 public void open() {
     System.out.println("Opening a PDF document.");
 }
}

class ExcelDocument implements Document {
 @Override
 public void open() {
     System.out.println("Opening an Excel document.");
 }
}

//Factory Abstract Class
abstract class DocumentFactory {
 public abstract Document createDocument();
}

//Concrete Factories
class WordDocumentFactory extends DocumentFactory {
 @Override
 public Document createDocument() {
     return new WordDocument();
 }
}

class PdfDocumentFactory extends DocumentFactory {
 @Override
 public Document createDocument() {
     return new PdfDocument();
 }
}

class ExcelDocumentFactory extends DocumentFactory {
 @Override
 public Document createDocument() {
     return new ExcelDocument();
 }
}

//Test Class
public class FactoryMethodPatternExample {
 public static void main(String[] args) {
     testFactory(new WordDocumentFactory());
     testFactory(new PdfDocumentFactory());
     testFactory(new ExcelDocumentFactory());
 }

 public static void testFactory(DocumentFactory factory) {
     Document doc = factory.createDocument();
     doc.open();
     System.out.println("Document created using: " + factory.getClass().getSimpleName());
     System.out.println("---------------------------------------------------");
 }
}
