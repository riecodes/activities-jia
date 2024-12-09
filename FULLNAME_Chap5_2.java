import javax.swing.JOptionPane;

public class FULLNAME_Chap5_2 {
    public static void main(String[] args) {
        int arrays[] = new int[5];
        for (int i = 0; i < arrays.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter integer number for index " + (i), "Input", JOptionPane.QUESTION_MESSAGE);
            arrays[i] = Integer.parseInt(input);
        }
        String search = JOptionPane.showInputDialog(null, "Enter Search Number", "Input", JOptionPane.QUESTION_MESSAGE);
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == Integer.parseInt(search)) {
                JOptionPane.showMessageDialog(null, "Found at index " + i, "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
