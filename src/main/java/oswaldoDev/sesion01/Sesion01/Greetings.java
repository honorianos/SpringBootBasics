package oswaldoDev.sesion01.Sesion01;

public class Greetings {
    private Long id;

    public Long getId() {
        return id;
    }
    public Greetings(Long id, String messasge) {
        this.id = id;
        this.messasge = messasge;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMessasge() {
        return messasge;
    }

    public void setMessasge(String messasge) {
        this.messasge = messasge;
    }

    private String messasge;

}
