package it.uniroma3.model.fornitore;

import java.util.Set;
import java.util.HashSet;
import javax.persistence.*;
import it.uniroma3.model.prodotto.Prodotto;

@Entity 
public class Fornitore {

     
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(nullable = false) 
    protected String partitaIva;

    @ManyToMany(mappedBy = "fornitore") 
    protected Set<Prodotto> prodotti;
     
    // @OneToOne(mappedBy = "fornitore") 
    // protected Indirizzo indirizzo;


    public Fornitore(){
        this.prodotti = new HashSet<Prodotto>();
    }


    public long getId() {
        return this.id; 
    }
    

    public String getPartitaIva() {
        return this.partitaIva; 
    }
    

    public Set<Prodotto> getProdotti() {
        return this.prodotti;   
    }
    

    // public Indirizzo getIndirizzo() {
    //     return this.indirizzo;  
    // }
    

    public void setId(long myId) {
        this.id = myId; 
    }
    

    public void setPartitaIva(String myPartitaIva) {
        this.partitaIva = myPartitaIva; 
    }
    

    public void addProdotto(Prodotto newProdotto) {
        this.prodotti.add(newProdotto);
    }
    

    // public void setIndirizzo(Indirizzo myIndirizzo) {
    //     this.indirizzo = myIndirizzo;
            
    // }

    public void removeProdotto(Prodotto oldProdotto) {
        if(this.prodotti == null)
            return;
        
        this.prodotti.remove(oldProdotto);
    }
}