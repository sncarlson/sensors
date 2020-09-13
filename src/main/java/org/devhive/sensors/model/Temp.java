package org.devhive.sensors.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
public class Temp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String sensorName;

    private Float tempF;
    private Float humidity;
    private Float heatIndex;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Date readingDate;

    public Temp() {
    }

    public Temp(String sensorName, Float tempF, Float humidity, Float heatIndex, Date readingDate) {
        this.sensorName = sensorName;
        this.tempF = tempF;
        this.humidity = humidity;
        this.heatIndex = heatIndex;
        this.readingDate = readingDate;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public Float getTempF() {
        return tempF;
    }

    public void setTempF(Float tempReadingInF) {
        this.tempF = tempReadingInF;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(Float headIndex) {
        this.heatIndex = headIndex;
    }

    public Date getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(Date readingDate) {
        this.readingDate = readingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temp temp = (Temp) o;
        return Objects.equals(sensorName, temp.sensorName) &&
                Objects.equals(tempF, temp.tempF) &&
                Objects.equals(humidity, temp.humidity) &&
                Objects.equals(heatIndex, temp.heatIndex) &&
                Objects.equals(readingDate, temp.readingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensorName, tempF, humidity, heatIndex, readingDate);
    }

    @Override
    public String toString() {
        return "Temp{" +
                "id=" + id +
                ", sensorName='" + sensorName + '\'' +
                ", tempF=" + tempF +
                ", humidity=" + humidity +
                ", headIndex=" + heatIndex +
                ", readingDate=" + readingDate +
                '}';
    }
}
