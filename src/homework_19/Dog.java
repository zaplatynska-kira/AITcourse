package homework_19;

public class Dog {
    private String name;
    private int jumpHeight;


    public String getName() {
        return name;
    }

    public void setName(String string) {
        this.name = string;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        if (jumpHeight < 0) {
            this.jumpHeight = 0;
        } else {
            this.jumpHeight = jumpHeight;



        }
    }
}







