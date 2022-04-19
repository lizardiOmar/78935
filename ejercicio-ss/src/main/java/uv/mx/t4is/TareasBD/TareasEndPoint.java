package uv.mx.t4is.TareasBD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.tareas.EliminarTareaRequest;
import https.t4is_uv_mx.tareas.EliminarTareaResponse;
import https.t4is_uv_mx.tareas.ModificarContenidoRequest;
import https.t4is_uv_mx.tareas.ModificarContenidoResponse;
import https.t4is_uv_mx.tareas.ModificarEstadoRequest;
import https.t4is_uv_mx.tareas.ModificarEstadoResponse;
import https.t4is_uv_mx.tareas.ModificarNombreRequest;
import https.t4is_uv_mx.tareas.ModificarNombreResponse;
import https.t4is_uv_mx.tareas.TareasPendientesResponse;
import https.t4is_uv_mx.tareas.TareasResponse;
import https.t4is_uv_mx.tareas.TareasTerminadasResponse;
import https.t4is_uv_mx.tareasbd.CrearTareaRequest;
import https.t4is_uv_mx.tareasbd.CrearTareaResponse;

@Endpoint
public class TareasEndPoint {

    @Autowired
    InterfazTareas interfaz;

    @PayloadRoot(localPart = "CrearTareaRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public CrearTareaResponse Saludar(@RequestPayload CrearTareaRequest peticion) {
        CrearTareaResponse respuesta = new CrearTareaResponse();
        Tarea t=new Tarea(peticion.getNombre(), peticion.getContenido());
        interfaz.save(t);
        respuesta.setRespuesta("Tarea creada.");
        return respuesta;
    }

    @PayloadRoot(localPart = "EliminarTareaRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public EliminarTareaResponse borrarSaludo(@RequestPayload EliminarTareaRequest peticion) {
        EliminarTareaResponse respuesta = new EliminarTareaResponse();
        interfaz.deleteById(peticion.getId());
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(localPart = "ModificarContenidoRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public ModificarContenidoResponse modificarContenido(@RequestPayload ModificarContenidoRequest peticion) {
        ModificarContenidoResponse respuesta = new ModificarContenidoResponse();
        Tarea t = new Tarea();
        t.setId(peticion.getId());
        t.setContenido(peticion.getContenido());
        Tarea aux = interfaz.findById(peticion.getId()).get();
        t.setNombre(aux.getNombre());
        t.setEstado(aux.getEstado());
        interfaz.save(t);
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(localPart = "ModificarNombreRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public ModificarNombreResponse modificarNombre(@RequestPayload ModificarNombreRequest peticion) {
        ModificarNombreResponse respuesta = new ModificarNombreResponse();
        Tarea t = new Tarea();
        t.setId(peticion.getId());
        t.setNombre(peticion.getNombre());
        Tarea aux = interfaz.findById(peticion.getId()).get();
        t.setContenido(aux.getContenido());
        t.setEstado(aux.getEstado());
        interfaz.save(t);
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(localPart = "ModificarEstadoRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public ModificarEstadoResponse modificarEstado(@RequestPayload ModificarEstadoRequest peticion) {
        ModificarEstadoResponse respuesta = new ModificarEstadoResponse();
        respuesta.setRespuesta(false);
        //Estados: 1=pendiente 0=terminada
        if((peticion.getEstado()==0)||(peticion.getEstado()==1)){
            Tarea aux = interfaz.findById(peticion.getId()).get();
            if(peticion.getEstado()!=aux.getEstado()){
                Tarea t = new Tarea();
                t.setId(peticion.getId());
                t.setEstado(peticion.getEstado());
                t.setNombre(aux.getNombre());
                t.setContenido(aux.getContenido());
                interfaz.save(t);
                respuesta.setRespuesta(true);
            }
        }
        return respuesta;
    }

    @PayloadRoot(localPart = "TareasPendientesRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public TareasPendientesResponse tareasPendientes() {
        TareasPendientesResponse respuesta = new TareasPendientesResponse();
        Iterable<Tarea> lista = interfaz.findAll();
        for (Tarea t : lista) {
            if(t.getEstado()==1){
                TareasPendientesResponse.TareasPendientes tarea = new TareasPendientesResponse.TareasPendientes();
                tarea.setNombre(t.getNombre());
                tarea.setId(t.getId());
                tarea.setContenido(t.getContenido());
                respuesta.getTareasPendientes().add(tarea);
            }
        }
        return respuesta;
    }

    @PayloadRoot(localPart = "TareasTerminadasRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public TareasTerminadasResponse tareasTerminadas() {
        TareasTerminadasResponse respuesta = new TareasTerminadasResponse();
        Iterable<Tarea> lista = interfaz.findAll();
        for (Tarea t : lista) {
            if(t.getEstado()==0){
                TareasTerminadasResponse.TareasTerminadas tarea = new TareasTerminadasResponse.TareasTerminadas();
                tarea.setNombre(t.getNombre());
                tarea.setId(t.getId());
                tarea.setContenido(t.getContenido());
                respuesta.getTareasTerminadas().add(tarea);
            }
        }
        return respuesta;
    }

    @PayloadRoot(localPart = "TareasRequest", namespace = "https://t4is.uv.mx/tareas")
    @ResponsePayload
    public TareasResponse tareas() {
        TareasResponse respuesta = new TareasResponse();
        Iterable<Tarea> lista = interfaz.findAll();
        for (Tarea t : lista) {
            TareasResponse.Tareas tarea = new TareasResponse.Tareas();
            tarea.setNombre(t.getNombre());
            tarea.setId(t.getId());
            tarea.setContenido(t.getContenido());
            tarea.setEstado(t.getEstado());
            respuesta.getTareas().add(tarea);
        }
        return respuesta;
    }
}
