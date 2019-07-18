package model;

public class iPhone extends Mobile {
    @Override
    public void call(String input) {
        if (input.length() > 10) {
            System.out.println("<iPhone> Message cannot be sent");
        } else {
            System.out.println("<iPhone>Message : " + input);
        }
    }
}
