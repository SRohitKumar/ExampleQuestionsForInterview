package DesignPatternsInJava;

public class FactoryDesignPattern {
    public FactoryDesignPattern createApp(AppType type) {
        FactoryDesignPattern app;
        switch (type) {
            case IOS:
                app = new IOSApp();
                break;
            case TV:
                app = new TVApp();
                break;
            case GLASS:
                app = new GlassApp();
                break;
            default:
                app = new GlassApp();
                break;
        }
        return app;
    }
}

enum AppType {
    IOS,
    GLASS,
    TV,
}

class IOSApp extends FactoryDesignPattern{

}
class TVApp extends FactoryDesignPattern{

}
class GlassApp extends FactoryDesignPattern{

}


