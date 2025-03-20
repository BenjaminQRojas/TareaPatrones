import java.util.ArrayList;

public class Hotel implements IHotel{
    private ArrayList<Reserva> reservas;

    public Hotel(){
        reservas = new ArrayList<>();
    }

    @Override
    public boolean addReserva(String nombre, String tarjetaDeCredito) {
        Cliente cliente = new Cliente(nombre, tarjetaDeCredito);
        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        return reservas.add(reserva);
    }

    @Override
    public String metodoDePago(String tarjetaDeCredito) {
        return "procesando pago";
    }
}
