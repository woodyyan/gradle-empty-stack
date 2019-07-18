package model;

public class Andriod extends Mobile {
    @Override
    public void call(String input) {
        if (input.length() > 10) {
            System.out.println("<Andriod> Message cannot be sent");
        } else {
            System.out.println("<Andriod>Message : " + input);
        }
    }
}
