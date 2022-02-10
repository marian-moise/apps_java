package OOP.hashMap;

import java.util.Objects;

public class Chitara {

    public int marca;
    public String nume;


    Chitara(int marca, String nume) {
        this.marca = marca;
        this.nume = nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chitara chitara = (Chitara) o;
        return marca == chitara.marca &&
                Objects.equals(nume, chitara.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, nume);
    }
}
