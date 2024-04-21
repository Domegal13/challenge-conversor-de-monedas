import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeCambios {
    public Cambio buscarCambios(String baseCode, String finalCode, Double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c53c8d6068422b759ec90ffd/pair/" + baseCode + "/" + finalCode + "/" + cantidad);
        URI direccion2 = URI.create("https://v6.exchangerate-api.com/v6/c53c8d6068422b759ec90ffd/pair/USD/ARS/10");



        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cambio.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontró el tipo de Cambio");
        }

    }


}