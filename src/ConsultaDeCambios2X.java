import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeCambios2X {
    public Cambio buscarCambios() {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c53c8d6068422b759ec90ffd/latest/USD");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cambio.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró el tipo de Cambio");
        }

    }

}
