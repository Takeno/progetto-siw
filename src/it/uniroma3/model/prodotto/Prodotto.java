package it.uniroma3.model.prodotto;

import java.util.Set;
import java.util.HashSet;
import javax.persistence.*;
import it.uniroma3.model.fornitore;
import it.uniroma3.model.ordine.RigaOrdine;

 
@Entity 
public class Prodotto {
     
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false) 
    private String nome;

    @Column(nullable = false) 
    private String descrizione;

    @Column(nullable = false) 
    private double costo;

     
    @Column(nullable = false) 
    private int qta;

    @ManyToMany 
    private Set<Fornitore> fornitori;

     
    @OneToMany(mappedBy = "prodotto") 
    private Set<RigaOrdine> righeOrdine;


    public Prodotto() {
        this.fornitori = new HashSet<Fornitore>();
        this.righeOrdine = new HashSet<RigaOrdine>();
    }

    public Prodotto(String nome, String descrizione, double costo, int qta) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.costo = costo;
        this.qta = qta;
        
        this.fornitori = new HashSet<Fornitore>();
        this.righeOrdine = new HashSet<RigaOrdine>();
    }

    public long getId() {
        return this.id; 
    }
    
    public String getNome() {
        return this.nome;   
    }
    
    public String getDescrizione() {
        return this.descrizione;    
    }
    

    public double getCosto() {
        return this.costo;  
    }
    

    public int getQta() {
        return this.qta;    
    }
    
    public Set<Fornitore> getFornitori() {
        return this.fornitori; 
    }
    
    public Set<RigaOrdine> getRigheOrdine() {
        return this.righeOrdine; 
    }
    

    public void setId(long myId) {
        this.id = myId; 
    }
    

    public void setNome(String myNome) {
        this.nome = myNome; 
    }
    

    public void setDescrizione(String myDescrizione) {
        this.descrizione = myDescrizione;   
    }
    

    public void setCosto(double myCosto) {
        this.costo = myCosto;   
    }
    

    public void setQta(int myQta) {
        this.qta = myQta;   
    }
    

    public void addFornitore(Fornitore newFornitore) {
        this.fornitori.add(newFornitore);
    }
    

    public void addRigheOrdine(RigheOrdine newRigheOrdine) {
        this.righeOrdine.add(newRigheOrdine);
    }
    
    public void removeFornitore(Fornitore oldFornitore) {
        this.fornitori.remove(oldFornitore);
    }
    

    public void removeRigheOrdine(RigaOrdine oldRigheOrdine) {
        this.righeOrdine.remove(oldRigheOrdine);
    }
}