
package xmlproba0.pkg14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author Julián
 */
public class XMLproba014 {

    
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
      
        //Flujo de escritura
        XMLStreamWriter es= XMLOutputFactory.newInstance().createXMLStreamWriter(new FileOutputStream("autores.xml"));
        
         es.writeStartDocument("1.0");
            es.writeStartElement("autores");
            es.writeStartElement("autor");
            es.writeAttribute("codigo", "a1");
            es.writeStartElement("nome");
            es.writeCharacters("Alexandre Dumas");
            es.writeEndElement();
            es.writeStartElement("titulo");
            es.writeCharacters("El conde de montecristo");
            es.writeEndElement();
            es.writeStartElement("titulo");
            es.writeCharacters("Los miserables");
            es.writeEndElement();
            es.writeEndElement();
            es.writeStartElement("autor");
            es.writeAttribute("codigo", "a2");
            es.writeStartElement("nome");
            es.writeCharacters("Fiodor Dostoyevski");
            es.writeEndElement();
            es.writeStartElement("titulo");
            es.writeCharacters(" El idiota");
            es.writeEndElement();
            es.writeStartElement("titulo");
            es.writeCharacters("Noches blancas");
            es.writeEndDocument();
            es.flush();
            es.close();
    

            //FLUJO DE LECTURA
            XMLEventReader lec = XMLInputFactory.newInstance().createXMLEventReader("autores.xml", new FileInputStream("autores.xml"));
            
            //LECTURA
            while (lec.hasNext()) {
                System.out.println(lec.nextEvent());
            }
            lec.close();

       
    }}


    
  
    

