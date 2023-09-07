package museo;

import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.runtime.annotations.ConfigRoot;
import jakarta.annotation.security.DeclareRoles;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/obradearte")

public class ArtWorkResource {
	ArtWorkService service = new ArtWorkService();
	

	@POST
		public ArtWork sendInformationOfTheArtWork(ArtWork artwork) {
		return service.addArtWork(artwork);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ArtWork> recoverInformationOfTheArtWork(){
		return service.showTheListOfTheArtWork();
		
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/medida")
	public String showPaintMeasures(ArtWork a) {
		
		return service.sendPaintMeasures(a.getAltura(), a.getAncho(), a.getAutor());
		
	}
	
	

}
