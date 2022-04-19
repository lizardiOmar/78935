//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.04.19 a las 01:54:42 AM CDT 
//


package https.t4is_uv_mx.tareas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.tareas package. 
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

    private final static QName _TareasPendientesRequest_QNAME = new QName("https://t4is.uv.mx/tareas", "TareasPendientesRequest");
    private final static QName _TareasTerminadasRequest_QNAME = new QName("https://t4is.uv.mx/tareas", "TareasTerminadasRequest");
    private final static QName _TareasRequest_QNAME = new QName("https://t4is.uv.mx/tareas", "TareasRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.tareas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TareasPendientesResponse }
     * 
     */
    public TareasPendientesResponse createTareasPendientesResponse() {
        return new TareasPendientesResponse();
    }

    /**
     * Create an instance of {@link TareasTerminadasResponse }
     * 
     */
    public TareasTerminadasResponse createTareasTerminadasResponse() {
        return new TareasTerminadasResponse();
    }

    /**
     * Create an instance of {@link TareasResponse }
     * 
     */
    public TareasResponse createTareasResponse() {
        return new TareasResponse();
    }

    /**
     * Create an instance of {@link CrearTareaRequest }
     * 
     */
    public CrearTareaRequest createCrearTareaRequest() {
        return new CrearTareaRequest();
    }

    /**
     * Create an instance of {@link CrearTareaResponse }
     * 
     */
    public CrearTareaResponse createCrearTareaResponse() {
        return new CrearTareaResponse();
    }

    /**
     * Create an instance of {@link EliminarTareaRequest }
     * 
     */
    public EliminarTareaRequest createEliminarTareaRequest() {
        return new EliminarTareaRequest();
    }

    /**
     * Create an instance of {@link EliminarTareaResponse }
     * 
     */
    public EliminarTareaResponse createEliminarTareaResponse() {
        return new EliminarTareaResponse();
    }

    /**
     * Create an instance of {@link ModificarContenidoRequest }
     * 
     */
    public ModificarContenidoRequest createModificarContenidoRequest() {
        return new ModificarContenidoRequest();
    }

    /**
     * Create an instance of {@link ModificarContenidoResponse }
     * 
     */
    public ModificarContenidoResponse createModificarContenidoResponse() {
        return new ModificarContenidoResponse();
    }

    /**
     * Create an instance of {@link ModificarNombreRequest }
     * 
     */
    public ModificarNombreRequest createModificarNombreRequest() {
        return new ModificarNombreRequest();
    }

    /**
     * Create an instance of {@link ModificarNombreResponse }
     * 
     */
    public ModificarNombreResponse createModificarNombreResponse() {
        return new ModificarNombreResponse();
    }

    /**
     * Create an instance of {@link ModificarEstadoRequest }
     * 
     */
    public ModificarEstadoRequest createModificarEstadoRequest() {
        return new ModificarEstadoRequest();
    }

    /**
     * Create an instance of {@link ModificarEstadoResponse }
     * 
     */
    public ModificarEstadoResponse createModificarEstadoResponse() {
        return new ModificarEstadoResponse();
    }

    /**
     * Create an instance of {@link TareasPendientesResponse.TareasPendientes }
     * 
     */
    public TareasPendientesResponse.TareasPendientes createTareasPendientesResponseTareasPendientes() {
        return new TareasPendientesResponse.TareasPendientes();
    }

    /**
     * Create an instance of {@link TareasTerminadasResponse.TareasTerminadas }
     * 
     */
    public TareasTerminadasResponse.TareasTerminadas createTareasTerminadasResponseTareasTerminadas() {
        return new TareasTerminadasResponse.TareasTerminadas();
    }

    /**
     * Create an instance of {@link TareasResponse.Tareas }
     * 
     */
    public TareasResponse.Tareas createTareasResponseTareas() {
        return new TareasResponse.Tareas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/tareas", name = "TareasPendientesRequest")
    public JAXBElement<Object> createTareasPendientesRequest(Object value) {
        return new JAXBElement<Object>(_TareasPendientesRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/tareas", name = "TareasTerminadasRequest")
    public JAXBElement<Object> createTareasTerminadasRequest(Object value) {
        return new JAXBElement<Object>(_TareasTerminadasRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/tareas", name = "TareasRequest")
    public JAXBElement<Object> createTareasRequest(Object value) {
        return new JAXBElement<Object>(_TareasRequest_QNAME, Object.class, null, value);
    }

}
