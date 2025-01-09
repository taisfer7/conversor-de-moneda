# Conversor de Moneda 💰

Este proyecto es una aplicación de consola en Java que permite realizar conversiones de moneda utilizando una API externa para obtener las tasas de cambio actuales. Además, guarda los resultados de las conversiones en archivos JSON para su posterior consulta. 

## Características:

- Conversión de las siguientes monedas:
  1️⃣ Dólar (USD) => Peso Argentino (ARS)
  2️⃣ Peso Argentino (ARS) => Dólar (USD)
  3️⃣ Dólar (USD) => Real Brasileño (BRL)
  4️⃣ Real Brasileño (BRL) => Dólar (USD)
  5️⃣ Dólar (USD) => Peso Colombiano (COP)
  6️⃣ Peso Colombiano (COP) => Dólar (USD)
- 🌐 Integración con la API [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de conversión actualizadas.
- 🖴 Guarda cada conversión en un archivo JSON con un nombre descriptivo.

## Estructura del código:

### `ConversorMoneda`
- Contiene el flujo principal del programa, incluyendo:
  - Interacción con el usuario a través de un menú.
  - Captura de datos de entrada como la cantidad a convertir y las monedas involucradas.
  - Uso de la clase `ConsultaMoneda` para obtener las tasas de conversión.
  - Uso de la clase `GeneradorDeArchivo` para guardar los resultados en formato JSON.

### `ConsultaMoneda`
- Se conecta a la API de ExchangeRate para obtener las tasas de conversión entre dos monedas.
- Maneja errores en caso de que no se pueda realizar la consulta.

### `Moneda`
- Representa la respuesta de la API con la tasa de conversión.

## Requisitos:

1. **Java 11 o superior**: Se utiliza la API `HttpClient` para las solicitudes HTTP.
2. **Librería Gson**: Para trabajar con JSON.

## Ejecución:

Selecciona una opción del menú, ingresa la cantidad a convertir, y obtendrás el resultado en pantalla. El archivo JSON con los detalles de la conversión se guardará automáticamente en el directorio del proyecto.

## Ejemplo de uso:

```
Bienvenido/a al Conversor de Moneda
1. Dólar => Peso Argentino
2. Peso Argentino => Dólar
3. Dólar => Real Brasileño
4. Real Brasileño => Dólar
5. Dólar => Peso Colombiano
6. Peso Colombiano => Dólar
7. Salir
***************************************
Elija una opción válida: 1
Ingrese el valor que desea convertir: 100
El valor de 100.00 USD corresponde al valor final de =>> 27,800.00 ARS
El resultado se ha guardado en un archivo JSON.
```
