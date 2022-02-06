public class Statek implements Pływa{

    private String status;
    public  void setStatus(String status){
        this.status= status;

    }
    public String getStatus(){
        return status;
    }


    @Override
    public String plyn() {
        return status;
    }
}
