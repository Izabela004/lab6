public class Zwierzeta extends Ryba implements Pływanie,Latanie {


    @Override
    public String lec() {
        return "nie lata";
    }

    @Override
    public String wyladuj() {
        return "nie laduje";
    }

    @Override
    public String plyn() {
        return "plynie";
    }

    @Override
    public String wynurz() {
        return "plynie";
    }

    @Override
    public String zanurz() {
        return "zanurza się";
    }

    @Override
    String jedz() {
        return "je";
    }

    @Override
    String wydalaj() {
        return "wydala";
    }
}
