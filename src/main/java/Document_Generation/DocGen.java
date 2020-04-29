package Document_Generation;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;

public class DocGen {
    public static void main(String[] args) throws IOException {

        XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream(new File("createDocument.doc"));

        // Write a paragraph in the docuement

        XWPFParagraph paragraph = document.createParagraph();
        paragraph.setBorderBottom(Borders.BASIC_BLACK_DOTS);
        paragraph.setBorderLeft(Borders.BASIC_BLACK_DOTS);
        paragraph.setBorderRight(Borders.BASIC_BLACK_DOTS);
        paragraph.setBorderTop(Borders.BASIC_BLACK_DOTS);
        XWPFRun run =paragraph.createRun();
        run.setText( " Once Upon a Time , Long long ago" +
                " a King called Manikandan was ruling the Country Salem." +
                " His Wife is Queen Malarvizhi and Princess Joshika and Prince Krishna. \n" +
                " He is one of the Best King in the History");

        XWPFTable table = document.createTable(3,3);

        table.getRow(0).getCell(0).setText("A");
        table.getRow(0).getCell(1).setText("B");
        table.getRow(0).getCell(2).setText("C");

        table.getRow(1).getCell(0).setText("D");
        table.getRow(1).getCell(1).setText("E");
        table.getRow(1).getCell(2).setText("F");
        document.write(out);
        out.close();
    }
}
