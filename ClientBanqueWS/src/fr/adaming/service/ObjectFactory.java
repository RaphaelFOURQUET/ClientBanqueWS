
package fr.adaming.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.adaming.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetComptesResponse_QNAME = new QName("http://service.adaming.fr/", "getComptesResponse");
    private final static QName _ConversionEuroToFranc_QNAME = new QName("http://service.adaming.fr/", "conversionEuroToFranc");
    private final static QName _GetComptes_QNAME = new QName("http://service.adaming.fr/", "getComptes");
    private final static QName _Compte_QNAME = new QName("http://service.adaming.fr/", "Compte");
    private final static QName _ConversionEuroToFrancResponse_QNAME = new QName("http://service.adaming.fr/", "conversionEuroToFrancResponse");
    private final static QName _GetCompte_QNAME = new QName("http://service.adaming.fr/", "getCompte");
    private final static QName _GetCompteResponse_QNAME = new QName("http://service.adaming.fr/", "getCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.adaming.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ConversionEuroToFrancResponse }
     * 
     */
    public ConversionEuroToFrancResponse createConversionEuroToFrancResponse() {
        return new ConversionEuroToFrancResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToFranc }
     * 
     */
    public ConversionEuroToFranc createConversionEuroToFranc() {
        return new ConversionEuroToFranc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.adaming.fr/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToFranc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.adaming.fr/", name = "conversionEuroToFranc")
    public JAXBElement<ConversionEuroToFranc> createConversionEuroToFranc(ConversionEuroToFranc value) {
        return new JAXBElement<ConversionEuroToFranc>(_ConversionEuroToFranc_QNAME, ConversionEuroToFranc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.adaming.fr/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.adaming.fr/", name = "Compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToFrancResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.adaming.fr/", name = "conversionEuroToFrancResponse")
    public JAXBElement<ConversionEuroToFrancResponse> createConversionEuroToFrancResponse(ConversionEuroToFrancResponse value) {
        return new JAXBElement<ConversionEuroToFrancResponse>(_ConversionEuroToFrancResponse_QNAME, ConversionEuroToFrancResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.adaming.fr/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.adaming.fr/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

}
