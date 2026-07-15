package miscellaneous.generics.example1;

public class APIResponse <T>{
    private String Status;

    private T data;

    private String message;

    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        this.Status = status;
    }


    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
