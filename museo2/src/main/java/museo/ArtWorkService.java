package museo;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.runtime.StartupEvent;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.CorsHandler;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;


@ApplicationScoped
public class ArtWorkService {

List<ArtWork> listaobras = new ArrayList<>();
    
    
    public ArtWork addArtWork(ArtWork obradearte){
        listaobras.add(obradearte);
        return obradearte;
    }
    
    public List<ArtWork> showTheListOfTheArtWork(){
        return listaobras;
    }
    
    public String sendPaintMeasures(double alturaPintura, double anchoPintura, String autorPintura){
        String cuerpohtml = "<html><body>";
        cuerpohtml += "<p> El espacio debe tener la siguiente altura: "+alturaPintura+ " Y un ancho de: " + anchoPintura+" Para colgar la obra de arte de "
         + autorPintura+"</p>";

        return cuerpohtml;
    }
    
    public void configureCors(@Observes StartupEvent ev, Router router) {
        CorsHandler corsHandler = CorsHandler.create("http://localhost:4200")
            .allowedMethod(HttpMethod.GET)
            .allowedMethod(HttpMethod.POST)
            .allowedMethod(HttpMethod.PUT)
            .allowedMethod(HttpMethod.DELETE);

        router.route().handler(corsHandler);
    }
}
