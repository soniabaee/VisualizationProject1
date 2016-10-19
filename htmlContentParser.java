
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class htmlContentParser {
        public static void main (String[] args) throws IOException {
        	
        	 
        	 int month_size = 0;
        	 int r = 1;
        	 
        	 Workbook wb = new HSSFWorkbook();
        	 CreationHelper createHelper = wb.getCreationHelper();
        	 Sheet sheet = wb.createSheet("Unemployment rate - states - during 1978:2016");
        	 for(int y = 2016; y > 1977; y--){
	        		if (y == 2016)
	        			month_size = 8;
	        		else
	        			month_size = 13;
	        		for(int m = 1; m < month_size; m++){
	        			String html = "";
	        			
			        	 if(m < 10)
			        		 html = "http://data.bls.gov/map/MapToolServlet?datatype=unemployment&year="+y+"&period=M0"+m+"&survey=la&map=state&seasonal=u";
			        	 else
			        		 html = "http://data.bls.gov/map/MapToolServlet?datatype=unemployment&year="+y+"&period=M"+m+"&survey=la&map=state&seasonal=u";
			        		 
			        	 ArrayList<String> states = new ArrayList<String>();
			        	 ArrayList<String> rate = new ArrayList<String>();
			        	 System.out.println("year"+y+"  month"+m);
			        	 
			        	 try {
			                 Document doc = Jsoup.connect(html).get();
			                 Element tableElements = doc.select("table").get(3);
			                 Elements tableRowElements = tableElements.select("tr");
			                 for (int i = 2; i < tableRowElements.size(); i++) {
			                    Element row = tableRowElements.get(i);
			                    Elements rowItemstd = row.select("td");
			                    Elements rowItemsth = row.select("th");
			                    for (int j = 0; j < rowItemstd.size(); j++) {
			                    	rate.add(rowItemstd.get(j).text());
			                    }
			                    for (int j = 0; j < rowItemsth.size(); j++) {
			                    	states.add(rowItemsth.get(j).text());
			                     }
			                 }
			
			              } catch (IOException e) {
			                 e.printStackTrace();
			              }
			        	 
			        	
			             
			        	 for(int i = 0 ; i < states.size(); i++){
			        	    	Row row = sheet.createRow((short)i+r);
			        	    	StringBuilder str = new StringBuilder(0);
			        	    	if(m < 10)
			        	    		row.createCell(0).setCellValue(createHelper.createRichTextString(str.append(y).append("0").append(m).append("01").toString()));
			        	    	else
			        	    		row.createCell(0).setCellValue(createHelper.createRichTextString(str.append(y).append(m).append("01").toString()));	
				        	    row.createCell(1).setCellValue(states.get(i));
				        	    row.createCell(2).setCellValue(rate.get(i));
				         }
			        	 r=r+51;
			        	 
				        	
        		}
        	}
            
        	 FileOutputStream fileOut = new FileOutputStream(new File("/Users/soniabaee/Desktop/unemploymentRate.xls"));
     	    wb.write(fileOut);
     	    fileOut.close();
//            		 	


//                String sourceLine;
//                String content = "";
//
//                // The URL address of the page to open.
//                URL address = new URL("http://data.bls.gov/map/MapToolServlet?datatype=unemployment&year=2015&period=M06&survey=la&map=state&seasonal=s");
//
//                // Open the address and create a BufferedReader with the source code.
//                InputStreamReader pageInput = new InputStreamReader(address.openStream());
//                BufferedReader source = new BufferedReader(pageInput);
//
//                // Append each new HTML line into one string. Add a tab character.
//                while ((sourceLine = source.readLine()) != null)
//                        content += sourceLine + "\t";
//
//                // Remove style tags & inclusive content
//                Pattern style = Pattern.compile("<style.*?>.*?</style>");
//                Matcher mstyle = style.matcher(content);
//                while (mstyle.find()) content = mstyle.replaceAll("");
//                
//                // Remove style tags & inclusive content
//                Pattern option = Pattern.compile("<OPTION.*?>.*?</OPTION>");
//                Matcher moption = style.matcher(content);
//                while (moption.find()) content = moption.replaceAll("");
//
//                // Remove script tags & inclusive content
//                Pattern script = Pattern.compile("<script.*?>.*?</script>");
//                Matcher mscript = script.matcher(content);
//                while (mscript.find()) content = mscript.replaceAll("");
//
//                // Remove primary HTML tags
//                Pattern tag = Pattern.compile("<.*?>");
//                Matcher mtag = tag.matcher(content);
//                while (mtag.find()) content = mtag.replaceAll("");
//
//                // Remove comment tags & inclusive content
//                Pattern comment = Pattern.compile("<!--.*?-->");
//                Matcher mcomment = comment.matcher(content);
//                while (mcomment.find()) content = mcomment.replaceAll("");
//
//                // Remove special characters, such as &nbsp;
//                Pattern sChar = Pattern.compile("&.*?;");
//                Matcher msChar = sChar.matcher(content);
//                while (msChar.find()) content = msChar.replaceAll("");
//
//                // Remove the tab characters. Replace with new line characters.
//                Pattern nLineChar = Pattern.compile("\t+");
//                Matcher mnLine = nLineChar.matcher(content);
//                while (mnLine.find()) content = mnLine.replaceAll("\n");
//
//                // Print the clean content & close the Readers
//                System.out.println(content);
//                pageInput.close();
//                source.close();
        }
}