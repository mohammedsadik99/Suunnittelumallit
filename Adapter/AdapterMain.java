public class AdapterMain {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        System.out.println("Temperature from TemperatureSensor (Celsius): " + temperatureSensor.getTemperature());
        FahrenheitTemperatureAdapter adapter = new FahrenheitTemperatureAdapter(temperatureSensor);
        System.out.println("Temperature from FahrenheitTemperatureAdapter (Fahrenheit): " + adapter.getTemperature());
    }
}
