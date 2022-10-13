
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
 

/**
 * Service REST pour désactiver ou réactiver à chaud une opération.
 */
@Path("/general")
@OpenAPIDefinition(info = @Info(title = "Supervision", description = "Supervision générale d'un domaine", version = "1.0.0"), servers = {
   @Server(url = "http://localhost:7001/domaine-exemple/sldng/admin") })
public interface RestInterface
{

   /**
    * Ping le domaine (Non Compatible PKS)
    * @since 2.4.0
    * @return
    */
   @GET
   @Path("/ping")
   @Operation(description = "Ping du domaine (opération non sécurisée) (depuis 2.4.0 - Non Compatible PKS)")
   @APIResponses({ @APIResponse(responseCode = "200", description = "Retourne 200 si c'est OK") })
   Response ping();
  
}
