
package fr.adaming.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCompte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getCompte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCompte" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCompte", propOrder = {
    "idCompte"
})
public class GetCompte {

    protected long idCompte;

    /**
     * Obtient la valeur de la propriété idCompte.
     * 
     */
    public long getIdCompte() {
        return idCompte;
    }

    /**
     * Définit la valeur de la propriété idCompte.
     * 
     */
    public void setIdCompte(long value) {
        this.idCompte = value;
    }

}
