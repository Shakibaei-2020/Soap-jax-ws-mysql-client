
package collaborateur.web.service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the collaborateur.web.service.client package. 
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

    private final static QName _GetCollaborateurResponse_QNAME = new QName("http://services.model.service.web.collaborateur/", "getCollaborateurResponse");
    private final static QName _GetCollaborateurs_QNAME = new QName("http://services.model.service.web.collaborateur/", "getCollaborateurs");
    private final static QName _AddCollaborateurResponse_QNAME = new QName("http://services.model.service.web.collaborateur/", "addCollaborateurResponse");
    private final static QName _Delete_QNAME = new QName("http://services.model.service.web.collaborateur/", "delete");
    private final static QName _GetCollaborateur_QNAME = new QName("http://services.model.service.web.collaborateur/", "getCollaborateur");
    private final static QName _UpdateCollaborateurResponse_QNAME = new QName("http://services.model.service.web.collaborateur/", "updateCollaborateurResponse");
    private final static QName _CollaborateurExistException_QNAME = new QName("http://services.model.service.web.collaborateur/", "CollaborateurExistException");
    private final static QName _CollaborateurInconnuException_QNAME = new QName("http://services.model.service.web.collaborateur/", "CollaborateurInconnuException");
    private final static QName _GetCollaborateursResponse_QNAME = new QName("http://services.model.service.web.collaborateur/", "getCollaborateursResponse");
    private final static QName _CountResponse_QNAME = new QName("http://services.model.service.web.collaborateur/", "countResponse");
    private final static QName _DeleteResponse_QNAME = new QName("http://services.model.service.web.collaborateur/", "deleteResponse");
    private final static QName _AddCollaborateur_QNAME = new QName("http://services.model.service.web.collaborateur/", "addCollaborateur");
    private final static QName _UpdateCollaborateur_QNAME = new QName("http://services.model.service.web.collaborateur/", "updateCollaborateur");
    private final static QName _Count_QNAME = new QName("http://services.model.service.web.collaborateur/", "count");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: collaborateur.web.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link CountResponse }
     * 
     */
    public CountResponse createCountResponse() {
        return new CountResponse();
    }

    /**
     * Create an instance of {@link GetCollaborateursResponse }
     * 
     */
    public GetCollaborateursResponse createGetCollaborateursResponse() {
        return new GetCollaborateursResponse();
    }

    /**
     * Create an instance of {@link CollaborateurInconnuException }
     * 
     */
    public CollaborateurInconnuException createCollaborateurInconnuException() {
        return new CollaborateurInconnuException();
    }

    /**
     * Create an instance of {@link CollaborateurExistException }
     * 
     */
    public CollaborateurExistException createCollaborateurExistException() {
        return new CollaborateurExistException();
    }

    /**
     * Create an instance of {@link UpdateCollaborateurResponse }
     * 
     */
    public UpdateCollaborateurResponse createUpdateCollaborateurResponse() {
        return new UpdateCollaborateurResponse();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link UpdateCollaborateur }
     * 
     */
    public UpdateCollaborateur createUpdateCollaborateur() {
        return new UpdateCollaborateur();
    }

    /**
     * Create an instance of {@link AddCollaborateur }
     * 
     */
    public AddCollaborateur createAddCollaborateur() {
        return new AddCollaborateur();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link AddCollaborateurResponse }
     * 
     */
    public AddCollaborateurResponse createAddCollaborateurResponse() {
        return new AddCollaborateurResponse();
    }

    /**
     * Create an instance of {@link GetCollaborateurs }
     * 
     */
    public GetCollaborateurs createGetCollaborateurs() {
        return new GetCollaborateurs();
    }

    /**
     * Create an instance of {@link GetCollaborateurResponse }
     * 
     */
    public GetCollaborateurResponse createGetCollaborateurResponse() {
        return new GetCollaborateurResponse();
    }

    /**
     * Create an instance of {@link GetCollaborateur }
     * 
     */
    public GetCollaborateur createGetCollaborateur() {
        return new GetCollaborateur();
    }

    /**
     * Create an instance of {@link Collaborateur }
     * 
     */
    public Collaborateur createCollaborateur() {
        return new Collaborateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollaborateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "getCollaborateurResponse")
    public JAXBElement<GetCollaborateurResponse> createGetCollaborateurResponse(GetCollaborateurResponse value) {
        return new JAXBElement<GetCollaborateurResponse>(_GetCollaborateurResponse_QNAME, GetCollaborateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollaborateurs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "getCollaborateurs")
    public JAXBElement<GetCollaborateurs> createGetCollaborateurs(GetCollaborateurs value) {
        return new JAXBElement<GetCollaborateurs>(_GetCollaborateurs_QNAME, GetCollaborateurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCollaborateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "addCollaborateurResponse")
    public JAXBElement<AddCollaborateurResponse> createAddCollaborateurResponse(AddCollaborateurResponse value) {
        return new JAXBElement<AddCollaborateurResponse>(_AddCollaborateurResponse_QNAME, AddCollaborateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollaborateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "getCollaborateur")
    public JAXBElement<GetCollaborateur> createGetCollaborateur(GetCollaborateur value) {
        return new JAXBElement<GetCollaborateur>(_GetCollaborateur_QNAME, GetCollaborateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCollaborateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "updateCollaborateurResponse")
    public JAXBElement<UpdateCollaborateurResponse> createUpdateCollaborateurResponse(UpdateCollaborateurResponse value) {
        return new JAXBElement<UpdateCollaborateurResponse>(_UpdateCollaborateurResponse_QNAME, UpdateCollaborateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollaborateurExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "CollaborateurExistException")
    public JAXBElement<CollaborateurExistException> createCollaborateurExistException(CollaborateurExistException value) {
        return new JAXBElement<CollaborateurExistException>(_CollaborateurExistException_QNAME, CollaborateurExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollaborateurInconnuException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "CollaborateurInconnuException")
    public JAXBElement<CollaborateurInconnuException> createCollaborateurInconnuException(CollaborateurInconnuException value) {
        return new JAXBElement<CollaborateurInconnuException>(_CollaborateurInconnuException_QNAME, CollaborateurInconnuException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollaborateursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "getCollaborateursResponse")
    public JAXBElement<GetCollaborateursResponse> createGetCollaborateursResponse(GetCollaborateursResponse value) {
        return new JAXBElement<GetCollaborateursResponse>(_GetCollaborateursResponse_QNAME, GetCollaborateursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "countResponse")
    public JAXBElement<CountResponse> createCountResponse(CountResponse value) {
        return new JAXBElement<CountResponse>(_CountResponse_QNAME, CountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCollaborateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "addCollaborateur")
    public JAXBElement<AddCollaborateur> createAddCollaborateur(AddCollaborateur value) {
        return new JAXBElement<AddCollaborateur>(_AddCollaborateur_QNAME, AddCollaborateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCollaborateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "updateCollaborateur")
    public JAXBElement<UpdateCollaborateur> createUpdateCollaborateur(UpdateCollaborateur value) {
        return new JAXBElement<UpdateCollaborateur>(_UpdateCollaborateur_QNAME, UpdateCollaborateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.service.web.collaborateur/", name = "count")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

}
