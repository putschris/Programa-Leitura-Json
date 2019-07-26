package LeitorJson;

// <editor-fold defaultstate="collapsed" desc="imports...">import java.io.FileReader; 
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            // parsing file "JSONExample.json" 
            Object obj = new JSONParser().parse(new FileReader("C:\\Users\\guilhermecr\\OneDrive - CATENO GESTAO DE CONTAS DE PAGAMENTO S.A\\Documentos\\NetBeansProjects\\AppKoala\\src\\LeitorJson\\JSONExample.json"));

            // typecasting obj to JSONObject 
            // transformando o resultado do obj em JSONObject
            JSONObject jo = (JSONObject) obj;

            // getting firstName and lastName 
            // Obtendo o primeiro e último nome
            // transformando o resultado das variáveis em String
            String firstName = (String) jo.get("firstName");
            String lastName = (String) jo.get("lastName");

            System.out.println(firstName);
            System.out.println(lastName);

            // getting age 
            // casting - transformando o resultado do GET em long
            long age = (long) jo.get("age");
            System.out.println(age);

            // getting address 
            // Obtendo a posição do address no arquivo Json
            Map address = ((Map) jo.get("address"));

            // iterating address Map 
            // Repetindo o addres no Map
            // Map:: É uma estrutura de dados que permite que você ligue
            // a cada valor a uma chave. Assim podemos acessar o valor pela chave
            // A idéia de ser uma interface é poder trocar de impletamentação se muito impacto, facilitando a manutenção.
            Iterator<Map.Entry> itr1 = address.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }

            // getting phoneNumbers 
            // Obtendo o phoneNumbers
            JSONArray ja = (JSONArray) jo.get("phoneNumbers");

            // iterating phoneNumbers 
            // Repetindo o phoneNumbers no Map
            Iterator itr2 = ja.iterator();

            while (itr2.hasNext()) {
                itr1 = ((Map) itr2.next()).entrySet().iterator();
                while (itr1.hasNext()) {
                    Map.Entry pair = itr1.next();
                    System.out.println(pair.getKey() + " : " + pair.getValue());
                }
            }
        } catch (Exception e) 
        {
            System.out.println("Erro no sezrvidor!" + e);
            e.printStackTrace();
        }

    }
}
