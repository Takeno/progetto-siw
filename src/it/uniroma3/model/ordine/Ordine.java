package it.uniroma3.model.ordine;

import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.*;

@Entity 
public class Ordine {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

     
    @Temporal(TemporalType.DATE) 
    @Column(nullable = false) 
    protected Date dataApertura;

    @Temporal(TemporalType.DATE) 
    @Column(nullable = true) 
    protected Date dataChiusura;
     
    @Temporal(javax.persistence.TemporalType.DATE) 
    @Column(nullable = true) 
    protected Date dataEvasione;

    @OneToMany(mappedBy = "ordine") 
    protected Set<RigaOrdine> righe;

    // @ManyToOne 
    // @JoinColumn(nullable = false) 
    // protected Cliente cliente;

    public Ordine(){
        this.righe = new HashSet<RigaOrdine>();
    }

    public long getId() {
        return this.id; 
    }

    public Date getDataApertura() {
        return this.dataApertura;   
    }
    

    public Date getDataChiusura() {
        return this.dataChiusura;   
    }
    

    public Date getDataEvasione() {
        return this.dataEvasione;   
    }
    

    public Set<RigaOrdine> getRighe() {
        return this.righe;   
    }
    

    // public Cliente getCliente() {
    //     return this.cliente;    
    // }
    
    public void setId(long myId) {
        this.id = myId; 
    }
    

    public void setDataApertura(Date myDataApertura) {
        this.dataApertura = myDataApertura; 
    }
    

    public void setDataChiusura(Date myDataChiusura) {
        this.dataChiusura = myDataChiusura; 
    }
    

    public void setDataEvasione(Date myDataEvasione) {
        this.dataEvasione = myDataEvasione; 
    }
    

    public void addRighe(RigaOrdine newRighe) {
        this.righe.add(newRighe);
    }
    

    // public void setCliente(Cliente myCliente) {
    //     this.cliente = myCliente;
    // }
    
    public void removeRighe(RigaOrdine oldRighe) {
        this.righe.remove(oldRighe);
    }
}