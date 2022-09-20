import models.Bus;

import java.util.List;

public class Main {

    private static List<Bus> listaBus;

    public static List<Bus> obtenerListaBuses() {
        return listaBus;
    }

    public static Boolean agregarBus(Bus bus) {
        listaBus.add(bus);
        return true;
    }

    public static Boolean BorrarBus(Bus bus) {
        listaBus.remove(bus);
        return true;
    }
}
