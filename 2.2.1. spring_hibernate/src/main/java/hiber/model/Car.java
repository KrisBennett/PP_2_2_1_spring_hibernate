package hiber.model;

import javax.persistence.Embeddable;

@Embeddable
public class Car {

    private String model;

    private Integer series;

    public Car() {
    }

    public Car(String model, Integer series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return '\'' + model + '\'' +
                ", серия " + series;
    }
}
