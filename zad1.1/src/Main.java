public class Main {
    public static void main(String[] args) {

        Statek st = new Statek();
        st.setStatus("płynie");
        System.out.println("Statek: " + st.plyn());

        Samolot sm = new Samolot();
        sm.setStatus("leci");
        System.out.println("Samolot: "+ sm.lec());

    }

}
