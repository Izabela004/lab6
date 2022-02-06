public class Samolot implements Lata{

    private String status;
    public  void setStatus(String status){
        this.status= status;

    }
    public String getStatus(){
        return status;
    }


    @Override
    public String lec() {
        return status;
    }
}
