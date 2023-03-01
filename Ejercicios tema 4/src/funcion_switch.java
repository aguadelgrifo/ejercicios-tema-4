public class funcion_switch {
    public static void main(String[] args) {
        var estacion = "OTOÑO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion);
        }
    }
}
