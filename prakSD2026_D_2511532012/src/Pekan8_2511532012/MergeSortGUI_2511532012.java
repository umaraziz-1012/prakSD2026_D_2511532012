package Pekan8_2511532012;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;

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
import javax.swing.border.EmptyBorder;

public class MergeSortGUI_2511532012 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array_2012;
	private JLabel[] labelArray_2012;
	private JButton stepButton_2012, resetButton_2012, setButton_2012;
	private JTextField inputField_2012;
	private JPanel panelArray_2012;
	private JTextArea stepArea_2012;
	
	private int i_2012, j_2012, k_2012;
	private boolean sorting_2012 = false;
	private int stepCount_2012 = 1;
	private java.util.Queue<int[]> mergeQueue_2012 = new java.util.LinkedList<>();
	private boolean isMerging_2012 = false;
	private int left_2012, mid_2012, right_2012;
	private int[] temp_2012;
	private boolean copying_2012 = false;
	
	public MergeSortGUI_2511532012() {
		setTitle("Marge Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel input
		JPanel inputPanel_2012 = new JPanel(new FlowLayout());
		inputField_2012 = new JTextField(30);
		setButton_2012 = new JButton("Set Array");
		inputPanel_2012.add(new JLabel ("Masukkan angka (pisahkan dengan koma):"));
		inputPanel_2012.add(inputField_2012);
		inputPanel_2012.add(setButton_2012);
		
		// Panel array visual
		panelArray_2012 = new JPanel();
		panelArray_2012.setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_2012 = new JPanel();
		stepButton_2012 = new JButton("Langkah Selanjutnya");
		resetButton_2012 = new JButton("Reset");
		stepButton_2012.setEnabled(false);
		controlPanel_2012.add(stepButton_2012);
		controlPanel_2012.add(resetButton_2012);
		
		// Area teks untuk log langkah-langkah
		stepArea_2012 = new JTextArea(8, 60);
		stepArea_2012.setEditable(false);
		stepArea_2012.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_2012 = new JScrollPane(stepArea_2012);
		
		// Tambahkan panel ke frame
		add(inputPanel_2012, BorderLayout.NORTH);
		add(panelArray_2012, BorderLayout.CENTER);
		add(controlPanel_2012, BorderLayout.SOUTH);
		add(scrollPane_2012, BorderLayout.EAST);
		
		// Event Set Array
		setButton_2012.addActionListener(e -> setArrayFromInput());
		
		// Event Langkah Selanjutnya
		stepButton_2012.addActionListener(e -> performStep_2012());
		
		// Event Reset
		resetButton_2012.addActionListener(e -> reset_2012());
	}
		
	private void setArrayFromInput() {
		String text_2012 = inputField_2012.getText().trim();
		if (text_2012.isEmpty()) return;
		String [] parts_2012 = text_2012.split(",");
		array_2012 = new int[parts_2012.length];
		try {
			for (int k_2012 = 0; k_2012 < parts_2012.length; k_2012++) {
				array_2012[k_2012] = Integer.parseInt(parts_2012[k_2012].trim());
			} 
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " 
					+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		labelArray_2012 = new JLabel[array_2012.length];
		panelArray_2012.removeAll();
		for (int i_2012 = 0; i_2012 < array_2012.length; i_2012++) {
			labelArray_2012[i_2012] = new JLabel(String.valueOf(array_2012[i_2012]));
			labelArray_2012[i_2012].setFont(new Font("Arial", Font.BOLD,24));
			labelArray_2012[i_2012].setOpaque(true);
			labelArray_2012[i_2012].setBackground(Color.WHITE);
			labelArray_2012[i_2012].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2012[i_2012].setPreferredSize(new Dimension(50, 50));
			labelArray_2012[i_2012].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2012.add(labelArray_2012[i_2012]);
		}
		mergeQueue_2012.clear();
		generateMergeSteps_2012(0, array_2012.length - 1);
		stepButton_2012.setEnabled(true);
		stepArea_2012.setText("");
		stepCount_2012 = 1;
		isMerging_2012 = false;
		panelArray_2012.revalidate();
		panelArray_2012.repaint();
	}
	 private void generateMergeSteps_2012(int left_2012, int right_2012) {
		if (left_2012 < right_2012) {
			int mid_2012 = left_2012 + (right_2012 - left_2012) / 2;

			generateMergeSteps_2012(left_2012, mid_2012);
			generateMergeSteps_2012(mid_2012 + 1, right_2012);

			mergeQueue_2012.add(new int[] { left_2012, mid_2012, right_2012 });
		}
	}
	
	private void performStep_2012() {
		resetHighlights_2012();
		
		if (!isMerging_2012 && !mergeQueue_2012.isEmpty()) {
			int [] range_2012 = mergeQueue_2012.poll();
			left_2012 = range_2012[0];
			mid_2012 = range_2012[1];
			right_2012 = range_2012[2];
			temp_2012 = new int[right_2012 - left_2012 + 1];
			i_2012 = left_2012;
			j_2012 = mid_2012 + 1;
			k_2012 = 0;
			copying_2012 = false;
			isMerging_2012 = true;
			stepArea_2012.append("Langkah " + stepCount_2012++ + ": Mulai merge dari " + left_2012 + " ke " + right_2012 + "\n");
			return;
		}
		
		if (isMerging_2012 && !copying_2012) {
			if (i_2012 <= mid_2012 && j_2012 <= right_2012) {
				labelArray_2012[i_2012].setBackground(Color.CYAN);
				labelArray_2012[j_2012].setBackground(Color.CYAN);
				if (array_2012[i_2012] <= array_2012[j_2012]) {
					temp_2012[k_2012++] = array_2012[i_2012++];
				} else {
					temp_2012[k_2012++] = array_2012[j_2012++];
				}
				stepArea_2012.append("Langkah " + stepCount_2012++ + ": Bandingkan dan saling elemen\n");
				return;
			} else if (i_2012 <= mid_2012) {
				temp_2012[k_2012++] = array_2012[i_2012++];
				stepArea_2012.append("Langkah " + stepCount_2012++ + ": Salin sisa kiri\n");
				return;
			} else if (j_2012 <= right_2012) {
				temp_2012[k_2012++] = array_2012[j_2012++];
				stepArea_2012.append("Langkah " + stepCount_2012++ + ": Salin sisa kanan\n");
				return;
			} else {
				copying_2012 = true;
				k_2012 = 0;
				return;
			}
			
		}
		if (copying_2012 && k_2012 < temp_2012.length) {
			array_2012[left_2012 + k_2012] = temp_2012[k_2012];
			labelArray_2012[left_2012 + k_2012].setText(String.valueOf(temp_2012[k_2012]));
			labelArray_2012[left_2012 + k_2012].setBackground(Color.GREEN);
			k_2012++;
			stepArea_2012.append("Langkah " + stepCount_2012++ + ": Tempelkan ke array utama\n");
			return;
		}

		if (copying_2012 && k_2012 == temp_2012.length) {
			isMerging_2012 = false;
			copying_2012 = false;
		}

		if (mergeQueue_2012.isEmpty() && !isMerging_2012) {
			stepArea_2012.append("Selesai.\n");
			stepButton_2012.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}

	private void resetHighlights_2012() {
		if (labelArray_2012 == null) return;
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
		mergeQueue_2012.clear();
		isMerging_2012 = false;
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
			MergeSortGUI_2511532012 gui_2012 = new MergeSortGUI_2511532012();
			gui_2012.setVisible(true);
		});
	}
}