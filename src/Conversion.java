public record Conversion(String monedaConvertir,
                         String monedaObjetivo,
                         double cantidad,
                         double resultado) {

    public String getMonedaConvertir() {
        return monedaConvertir;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }
}
