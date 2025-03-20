import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void realizarReserva(IHotel hotel) {
        Scanner input = new Scanner(System.in);
        String nombre = input.nextLine();
        String tarjeta = input.nextLine();
        System.out.println(hotel.metodoDePago(tarjeta));
        hotel.addReserva(nombre, tarjeta);
        System.out.println("reserva realizada con exito");
    }

    public static void main(String[] args) {
        IHotel hotel = new Hotel();
        realizarReserva(hotel);
    }
}