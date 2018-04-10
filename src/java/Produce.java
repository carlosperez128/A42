
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("produce")
public class Produce {
    
    static Productos pro;    
    @GET
    @Produces ({"application/json", "application/xml"})
    public Productos getPro(){
        return pro;
    }
    @POST
    @Consumes ({"application/json", "application/xml"})
    public Response postPro(Productos p){   
        pro = p;
        return Response.ok(p).build();
    }    
}
