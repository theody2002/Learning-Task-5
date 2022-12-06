import javax.swing.JOptionPane;

class Compute extends Methods {
    public static int computeAge(String value1, String value2) {
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        int finalage = val1 - val2;
        return finalage;
    }

    public static void displayMessage(String finalage) {
        JOptionPane.showMessageDialog(null, "Your current age is: " + finalage, "Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}