package Pekan8_2511532012;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class BubbleGUI_2511532012 extends JFrame {

    private static final long serialVersionUID = 1L;
    private int[] array_2012;
    private JLabel[] labelArray_2012;
    private JButton stepButton_2012, resetButton_2012, setButton_2012;
    private JTextField inputField_2012;
    private JPanel panelArray_2012;
    private JTextArea stepArea_2012;

    private int i_2012 = 0, j_2012 = 0;
    private boolean sorting_2012 = false;
    private int stepCount_2012 = 1;

    public BubbleGUI_2511532012() {
        setTitle("Bubble Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // panel input
        JPanel inputPanel_2012 = new JPanel(new FlowLayout());
        inputField_2012 = new JTextField(30);
        setButton_2012 = new JButton("Set Array");
        inputPanel_2012.add(new JLabel("Masukan angka (pisahkan dengan koma)"));
        inputPanel_2012.add(inputField_2012);
        inputPanel_2012.add(setButton_2012);

        // panel array visual
        panelArray_2012 = new JPanel();
        panelArray_2012.setLayout(new FlowLayout());

        // panel kontrol
        JPanel controlPanel_2012 = new JPanel();
        stepButton_2012 = new JButton("Langkah selanjutnya");
        resetButton_2012 = new JButton("Reset");
        controlPanel_2012.add(stepButton_2012);
        controlPanel_2012.add(resetButton_2012);

        // area text untuk log langkah langkah
        stepArea_2012 = new JTextArea(8, 60);
        stepArea_2012.setEditable(false);
        stepArea_2012.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_2012 = new JScrollPane(stepArea_2012);

        // tambahkan panel ke frame
        add(inputPanel_2012, BorderLayout.NORTH);
        add(panelArray_2012, BorderLayout.CENTER);
        add(controlPanel_2012, BorderLayout.SOUTH);
        add(scrollPane_2012, BorderLayout.EAST);

        // event set array
        setButton_2012.addActionListener(e -> setArrayFromInput_2012());

        // event selanjutnya
        stepButton_2012.addActionListener(e -> performStep_2012());

        // event reset
        resetButton_2012.addActionListener(e -> reset_2012());
    }

    private void setArrayFromInput_2012() {
        String text_2012 = inputField_2012.getText().trim();
        if (text_2012.isEmpty()) return;
        String[] parts_2012 = text_2012.split(",");
        array_2012 = new int[parts_2012.length];
        try {
            for (int k_2012 = 0; k_2012 < parts_2012.length; k_2012++) {
                array_2012[k_2012] = Integer.parseInt(parts_2012[k_2012].trim());
            }
        } catch (NumberFormatException e_2012) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
                    + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        i_2012 = 0;
        j_2012 = 0;
        stepCount_2012 = 1;
        sorting_2012 = true;
        stepButton_2012.setEnabled(true);
        stepArea_2012.setText("");
        panelArray_2012.removeAll();
        labelArray_2012 = new JLabel[array_2012.length];
        for (int k_2012 = 0; k_2012 < array_2012.length; k_2012++) {
            labelArray_2012[k_2012] = new JLabel(String.valueOf(array_2012[k_2012]));
            labelArray_2012[k_2012].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_2012[k_2012].setOpaque(true);
            labelArray_2012[k_2012].setBackground(Color.WHITE);
            labelArray_2012[k_2012].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2012[k_2012].setPreferredSize(new Dimension(50, 50));
            labelArray_2012[k_2012].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_2012.add(labelArray_2012[k_2012]);
        }

        panelArray_2012.revalidate();
        panelArray_2012.repaint();
    }

    private void performStep_2012() {
        if (!sorting_2012 || i_2012 >= array_2012.length - 1) {
            sorting_2012 = false;
            stepButton_2012.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }

        resetHighlights_2012();
        StringBuilder stepLog_2012 = new StringBuilder();

        labelArray_2012[j_2012].setBackground(Color.CYAN);
        labelArray_2012[j_2012 + 1].setBackground(Color.CYAN);

        if (array_2012[j_2012] > array_2012[j_2012 + 1]) {
            // Swap
            int temp_2012 = array_2012[j_2012];
            array_2012[j_2012] = array_2012[j_2012 + 1];
            array_2012[j_2012 + 1] = temp_2012;
            labelArray_2012[j_2012].setBackground(Color.RED);
            labelArray_2012[j_2012 + 1].setBackground(Color.RED);
            stepLog_2012.append("Langkah ").append(stepCount_2012).append(": Menukar elemen ke-")
                    .append(j_2012).append(" (").append(array_2012[j_2012 + 1]).append(") dengan ke-")
                    .append(j_2012 + 1).append(" (").append(array_2012[j_2012]).append(")\n");
        } else {
            stepLog_2012.append("Langkah ").append(stepCount_2012).append(": Tidak ada pertukaran antara ke-")
                    .append(j_2012).append(" dan ke-").append(j_2012 + 1).append("\n");
        }

        stepLog_2012.append("Hasil: ").append(arrayToString_2012(array_2012)).append("\n\n");
        stepArea_2012.append(stepLog_2012.toString());
        updateLabels_2012();

        j_2012++;
        if (j_2012 >= array_2012.length - i_2012 - 1) {
            j_2012 = 0;
            i_2012++;
        }
        stepCount_2012++;

        if (i_2012 >= array_2012.length - 1) {
            sorting_2012 = false;
            stepButton_2012.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_2012() {
        for (int k_2012 = 0; k_2012 < array_2012.length; k_2012++) {
            labelArray_2012[k_2012].setText(String.valueOf(array_2012[k_2012]));
        }
    }

    private void resetHighlights_2012() {
        for (JLabel label_2012 : labelArray_2012) {
            label_2012.setBackground(Color.WHITE);
        }
    }

    private void reset_2012() {
        inputField_2012.setText("");
        panelArray_2012.removeAll();
        panelArray_2012.revalidate();
        panelArray_2012.repaint();
        stepArea_2012.setText("");
        stepButton_2012.setEnabled(false);
        sorting_2012 = false;
        i_2012 = 0;
        j_2012 = 0;
        stepCount_2012 = 1;
    }

    private String arrayToString_2012(int[] arr_2012) {
        StringBuilder sb_2012 = new StringBuilder();
        for (int k_2012 = 0; k_2012 < arr_2012.length; k_2012++) {
            sb_2012.append(arr_2012[k_2012]);
            if (k_2012 < arr_2012.length - 1) sb_2012.append(", ");
        }
        return sb_2012.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BubbleGUI_2511532012 gui = new BubbleGUI_2511532012();
            gui.setVisible(true);
        });
    }
}