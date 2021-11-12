import java.util.Objects;

public class incidence {

    private String state;
    private String date;
    private int number;

    public incidence(String state, String date, int number) {
        this.state = state;
        this.date = date;
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        incidence incidence = (incidence) o;
        return Objects.equals(state, incidence.state) && Objects.equals(date, incidence.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, date);
    }

    @Override
    public String toString() {
        return "incidence{" +
                "state='" + state + '\'' +
                ", date='" + date + '\'' +
                ", number=" + number +
                '}';
    }


}