public class FahrenheitTemperatureAdapter implements TemperatureProvider {
    private TemperatureSensor sensor;

    public FahrenheitTemperatureAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperature() {
        double celsiusTemperature = sensor.getTemperature();
        return celsiusToFahrenheit(celsiusTemperature);
    }

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
