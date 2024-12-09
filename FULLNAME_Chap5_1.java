import javax.swing.JOptionPane;

public class FULLNAME_Chap5_1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = JOptionPane.showInputDialog(null, "Enter Name " + (i + 1), "Input", JOptionPane.QUESTION_MESSAGE);
            if (names[i] == null) {
                break;
            }
        }
        StringBuilder message = new StringBuilder();
        for (String name : names) {
            if (name != null) {
                if (name.length() % 2 == 0) {
                    message.append(name.toUpperCase()).append(" - ").append(name.length()).append("\n");
                } else {
                    message.append(name.toLowerCase()).append(" - ").append(name.length()).append("\n");
                }
            }
        }
        JOptionPane.showMessageDialog(null, message.toString(), "Name & Length", JOptionPane.INFORMATION_MESSAGE);
    }
}
