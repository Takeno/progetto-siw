package it.uniroma3.model.ordine;

import java.util.Set;
import java.util.HashSet;
import javax.persistence.*;
import it.uniroma3.model.prodotto.Prodotto;

@Entity 
public class RigaOrdine {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
     
    @Column(nullable = false) 
    protected int qta;
     
    @Column(nullable = false) 
    protected double prezzoUnitario;

    @ManyToOne 
    @JoinColumn(nullable = false) 
    protected Ordine ordine;

    @ManyToOne 
    @JoinColumn(nullable = false) 
    protected Prodotto prodotto;

    public RigheOrdine(){
        super();
    }

    public void setOrdine(Ordine myOrdine) {
        this.ordine = myOrdine;
    }

    public void setProdotto(Prodotto myProdotto) {
        this.prodotto = myProdotto;
    }


    public long getId() {
        return this.id; 
    }
    

    public int getQta() {
        return this.qta;    
    }
    

    public double getPrezzoUnitario() {
        return this.prezzoUnitario; 
    }
    

    public Ordine getOrdine() {
        return this.ordine; 
    }
    

    public Prodotto getProdotto() {
        return this.prodotto;   
    }
    

    public void setId(long myId) {
        this.id = myId; 
    }
    

    public void setQta(int myQta) {
        this.qta = myQta;   
    }
    

    public void setPrezzoUnitario(double myPrezzoUnitario) {
        this.prezzoUnitario = myPrezzoUnitario; 
    }
}