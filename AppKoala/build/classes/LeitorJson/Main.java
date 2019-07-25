package LeitorJson;

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;
import org.json.simple.parser.*;
import org.json.simple.*;

// </editor-fold>

public class Main 
{
    
    public static void main(String[] args) 
    {
//        JSONObject jsonObj;
        JSONObject jsonObj;
        JSONParser parser = new JSONParser();
        DadosJson dados = new DadosJson();
        
        try 
        {
            
            jsonObj = (JSONObject) parser.parse(new FileReader("C:\\Users\\guilhermecr\\OneDrive - CATENO GESTAO DE CONTAS DE PAGAMENTO S.A\\Documentos\\NetBeansProjects\\AppKoala\\src\\LeitorJson\\norris.json"));
            
//            System.out.println(jsonObj.get("value"));
            JSONValue value = (JSONValue) jsonObj.get("value");
            System.out.println(value);
                    
//            dados.setType((String) jsonObj.get("type"));
//            dados.setJoke((String) jsonObj.get("joke"));
//            dados.setId((String) jsonObj.get("id"));
//            dados.setCategories((String) jsonObj.get("categories"));
//            
//            System.out.println("Ai está: " + "\n" + dados.toString());
;
            
        }catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
    
}
