public class Main {
    public static void main(String[] args) {
        AbstractFactory windowsFactory = new WindowsFactory();
        Juego juegoParaWindows = new Juego(windowsFactory);
        juegoParaWindows.crearInterfaz();

        AbstractFactory macFactory = new MacFactory();
        Juego juegoParaMac = new Juego(macFactory);
        juegoParaMac.crearInterfaz();

        AbstractFactory linuxFactory = new LinuxFactory();
        Juego juegoParaLinux = new Juego(linuxFactory);
        juegoParaLinux.crearInterfaz();
    }
}
