package parcialFinal.e05;

public class AppWebAdapter implements IAppsEmpresa1{
    private final AppWeb appWeb;

    public AppWebAdapter(AppWeb appWeb) {
        this.appWeb = appWeb;
    }

    @Override
    public void login() {
        appWeb.iniciarSesion();
    }

    @Override
    public void logout() {
        appWeb.cerrarSesion();
    }

    @Override
    public void reportes() {
        System.out.println("Web App: Generando reporte... "+appWeb.generacionDeDatos());
    }
}
