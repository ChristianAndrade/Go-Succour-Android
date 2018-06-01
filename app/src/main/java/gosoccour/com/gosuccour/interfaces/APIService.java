package gosoccour.com.gosuccour.interfaces;


import gosoccour.com.gosuccour.Login.models.Token;
import gosoccour.com.gosuccour.Login.models.image;
import gosoccour.com.gosuccour.Vistas.Activities.Coordenadas;
import gosoccour.com.gosuccour.models.Client;
import gosoccour.com.gosuccour.models.Maintenance;
import gosoccour.com.gosuccour.models.RequestFactura;
import gosoccour.com.gosuccour.models.Revision;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Mohamed on 05/17/2018.
 */

public interface APIService {

    //enviar mantenimiento
    @POST("/api/mantenimiento")
    Call<Maintenance> savePostMantenimiento(@Body Maintenance maintenance);

    @POST("/api/revision")
    Call<Revision> savePostRevision(@Body Revision revision);

    //obtener cliente
    @GET("/api/client/{id}")
    Call<Client> getClient(@Path("id") int id);

    //enviar datos login
    @POST("/api/login")
    Call<Token> loginCheck(@Query("username") String username, @Query("password")String password);

    //imagen --no usar
    @GET("/pg/image")
    Call<image> getImageProfile(@Query("id") long id);

    //enviar coordenadas
    @POST("/api/locationClient")
    Call<Coordenadas> sendCoordenadas(@Body Coordenadas coordenadas);

    @GET("/api/idCar")
    Call<RequestFactura> getFacturaId(@Query("idCar") Long id, @Query("token") String token);


}
