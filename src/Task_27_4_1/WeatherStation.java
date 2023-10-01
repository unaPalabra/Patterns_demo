package Task_27_4_1;

class WeatherStation extends FahrenheitSensorImpl implements CelsiusSensor {
    @Override
    public void getCelsius() {
        getFahrenheit();
    }
}
