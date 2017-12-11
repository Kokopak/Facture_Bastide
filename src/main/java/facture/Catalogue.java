package facture;

import java.util.HashMap;

public class Catalogue {
    
    
    private HashMap<String, Article> contenu;
    
    public Catalogue() {
        contenu = new HashMap<String, Article>();
        
    }
    
    public void addArticle(Article article) {
        contenu.put(article.getCode(), article);
    }
    
    public Article findByCode(String code) {
        return contenu.get(code);
    }
    
}
