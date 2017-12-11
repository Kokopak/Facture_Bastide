package facture;

import java.io.PrintStream;
import java.util.Date;
import java.util.LinkedList;

public class Facture {
    
    private Client destinataire;
    private Date emission;
    private int numero;
    
    private LinkedList<LigneFacture> lignes;

    public Facture(Client destinataire, Date emission, int numero) {
         // TODO: Implémenter cette méthode
         this.destinataire = destinataire;
         this.emission = emission;
         this.numero = numero;
         lignes = new LinkedList<LigneFacture>();
    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
         // TODO: Implémenter cette méthode
         return this.numero;
    }

    /**
     * Get the value of emission
     *
     * @return the value of emission
     */
    public Date getEmission() {
         // TODO: Implémenter cette méthode
         return this.emission;
    }

    /**
     * Get the value of destinataire
     *
     * @return the value of destinataire
     */
    public Client getDestinataire() {
         // TODO: Implémenter cette méthode
         return this.destinataire;
    }


    
    public void ajouteLigne(Article a, int nombre, float remise) {
        // TODO: Implémenter cette méthode
        LigneFacture l = new LigneFacture(nombre, this, a, remise);
        
        lignes.add(l);
   }
    
   public float montantTTC(float tauxTVA) {
         // TODO: Implémenter cette méthode
        float s = 0;
        
        for(LigneFacture l : lignes){
            s += l.montantLigne() * (1+tauxTVA);
        }
        
        return s;
   }
   
   public void print(PrintStream out, float tva) {
         // TODO: Implémenter cette méthode
        String factureStr = "";
        for(LigneFacture l : lignes){
            factureStr += l.toString();
        }
        out.println("Prix total : " + montantTTC(tva));
        out.println(factureStr);
   }
   
}
