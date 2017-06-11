package roger.monteiro.appbase;

/**
 * Created by roger on 10/06/17.
 */

public class Name {

    private String name;
    private int status;

    public Name(String name, int status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

}
