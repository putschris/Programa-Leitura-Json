package LeitorJson;

// <editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
// </editor-fold>


public class DadosJson 
{
   private String type;
   private String id;
   private String joke;
   private String categories;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public String toString() 
    {
        return "DadosJson" + "\n"
                + "{" + "\n"
                + "id = " + id + "\n"
                + "type = " + type + "\n"
                + "joke = " + joke + "\n"
                + "categories = " + categories + "\n"
                + '}';
    }
   
   
}
