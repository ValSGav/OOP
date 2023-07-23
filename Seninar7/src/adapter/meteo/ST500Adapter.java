package Seninar7.src.adapter.meteo;

import java.time.LocalDateTime;

public class ST500Adapter implements MeteoSensor {

    private SensorTemperature sensorTemperature;

    public ST500Adapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)sensorTemperature.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime timeStamp = LocalDateTime.of(sensorTemperature.year(), 7, 18, 0,0,0);
        timeStamp.plusDays(sensorTemperature.day()).plusSeconds(sensorTemperature.second());
        return timeStamp;
    }
}
