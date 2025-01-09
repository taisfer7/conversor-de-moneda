import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public static void guardarJson(Conversion conversion) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("conversion_" + conversion.getMonedaConvertir() + "_to_" + conversion.getMonedaObjetivo() + ".json");
        escritura.write(gson.toJson(conversion));
        escritura.close();
    }
}