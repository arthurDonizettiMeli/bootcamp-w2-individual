package saveTheRopa;

public class Roupa extends Vestuario {
    public Roupa(String marca, String modelo) {
        super.marca = marca;
        super.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                "}";
    }
}
