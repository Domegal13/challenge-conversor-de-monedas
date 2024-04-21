import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeCambios2X {
    public Cambio2X buscarCambios() {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c53c8d6068422b759ec90ffd/latest/USD");

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
//            Gson gson = new GsonBuilder()
//                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
//                    .create();

            return new Gson().fromJson(json, Cambio2X.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró el tipo de Cambio");
        }

    }

}
