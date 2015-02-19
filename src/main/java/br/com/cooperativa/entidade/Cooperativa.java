package br.com.cooperativa.entidade;
// Generated 21/11/2013 13:33:34 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cooperativa generated by hbm2java
 */
@Entity
@Table(name="cooperativa"
    ,catalog="cooperativas"
)
public class Cooperativa  implements java.io.Serializable {


     private Integer idcooperativa;
     private Empresa empresa;
     private String status;
     private Date dataCadastro;

    public Cooperativa() {
    }

    public Cooperativa(Empresa empresa, String status, Date dataCadastro) {
       this.empresa = empresa;
       this.status = status;
       this.dataCadastro = dataCadastro;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idcooperativa", unique=true, nullable=false)
    public Integer getIdcooperativa() {
        return this.idcooperativa;
    }
    
    public void setIdcooperativa(Integer idcooperativa) {
        this.idcooperativa = idcooperativa;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="empresa", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="status", nullable=false, length=11)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataCadastro", nullable=false, length=19)
    public Date getDataCadastro() {
        return this.dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }




}


