package TugasPekan7_2511532012;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;

public class Mahasiswa_2511532012 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2012;
	private JLabel[] labelArray_2012, labelmahasiswa_2012;
	private JButton stepButton_2012, resetButton_2012, setButton_2012, tambahButton_2012;
	private JTextField inputField_2012, namaField_2012, nimField_2012, prodiField_2012;
	private JPanel panelArray_2012, panelmahasiswa_2012;
	private JTextArea stepArea_2012;
	private JPanel contentPane_2012;
	private JComboBox<String> comboSort_2012;
	private ArrayList <ADTMahasiswa_2511532012> datamahasiswa_2012;
	
	private int i_2012 = 1, j_2012;
	private boolean sorting_2012 = false;
	private int stepCount_2012 = 1;

	/**
	 * Create the frame.
	 */
	public Mahasiswa_2511532012() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_2012 = new JPanel();
		contentPane_2012.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_2012);
		
		setTitle ("Pnegurutan Mahasiswa");
		setSize(750,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		
		//input
		 JPanel inputPanel_2012 = new JPanel(new FlowLayout());
	        namaField_2012 = new JTextField(10);
	        nimField_2012 = new JTextField(10);
	        prodiField_2012 = new JTextField(10);
	        tambahButton_2012 = new JButton("Tambah Data");
	        inputPanel_2012.add(new JLabel("Nama"));
	        inputPanel_2012.add(namaField_2012);
	        inputPanel_2012.add(new JLabel("NIM"));
	        inputPanel_2012.add(nimField_2012);
	        inputPanel_2012.add(new JLabel("Prodi"));
	        inputPanel_2012.add(prodiField_2012);
	        inputPanel_2012.add(tambahButton_2012);
	        
	    //array
	        panelmahasiswa_2012 = new JPanel();
	        panelmahasiswa_2012.setLayout(new FlowLayout());
	        
	   //control
	        JPanel controlPanel_2012 = new JPanel();
	        comboSort_2012 = new JComboBox<>();
	        comboSort_2012.addItem("Insertion Sort");
	        comboSort_2012.addItem("Selection Sort");
	        comboSort_2012.addItem("Bubble Sort");
	        stepButton_2012 = new JButton ("NextStep");
	        resetButton_2012 = new JButton ("Reset");
	        controlPanel_2012.add(comboSort_2012);
	        controlPanel_2012.add(stepButton_2012);
	        controlPanel_2012.add(resetButton_2012);
	        
	   //text area
	        stepArea_2012 = new JTextArea(8, 60);
			stepArea_2012.setEditable(false);
			stepArea_2012.setFont(new Font("Monospaced", Font.PLAIN, 14));
			JScrollPane scrollPane_2012 = new JScrollPane(stepArea_2012);
			
	   //tambah frame
			getContentPane().add(inputPanel_2012, BorderLayout.NORTH);
		    getContentPane().add(panelmahasiswa_2012, BorderLayout.CENTER);
		    getContentPane().add(controlPanel_2012, BorderLayout.SOUTH);
		    getContentPane().add(scrollPane_2012, BorderLayout.EAST);
		    
		    tambahButton_2012.addActionListener(e -> tambahmahasiswa_2012());
		    stepButton_2012.addActionListener(e -> mulaiSorting_2012());
		    resetButton_2012.addActionListener(e -> reset_2012());
		    
	}	
	private void tambahmahasiswa_2012() {
		String nama_2012 = namaField_2012.getText().trim();
        String nim_2012 = nimField_2012.getText().trim();
        String prodi_2012 = prodiField_2012.getText().trim();
        if (nama_2012.isEmpty() || nim_2012.isEmpty() || prodi_2012.isEmpty()) {
        	JOptionPane.showMessageDialog(this, "DATA TIDAK TERISI SEMUA");
        	return;
        }
        ADTMahasiswa_2511532012 mhs_2012 = new ADTMahasiswa_2511532012(nama_2012, nim_2012, prodi_2012);
        datamahasiswa_2012.add(mhs_2012);
        updateLabels_2012();
        namaField_2012.setText("");
        nimField_2012.setText("");
        prodiField_2012.setText("");
        
	}
	 private void updateLabels_2012() {
	        panelmahasiswa_2012.removeAll();
	        labelmahasiswa_2012 = new JLabel[datamahasiswa_2012.size()];
	        for (int i_2012 = 0; i_2012 < datamahasiswa_2012.size(); i_2012++) {

	            labelmahasiswa_2012[i_2012] = new JLabel(
	                    datamahasiswa_2012.get(i_2012).getnama_2012()
	            );
	            labelmahasiswa_2012[i_2012].setFont(
	                    new Font("Arial", Font.BOLD, 18)
	            );
	            labelmahasiswa_2012[i_2012].setBorder(
	                    BorderFactory.createLineBorder(Color.BLACK)
	            );
	            labelmahasiswa_2012[i_2012].setPreferredSize(
	                    new Dimension(120, 50)
	            );
	            labelmahasiswa_2012[i_2012].setHorizontalAlignment(
	                    SwingConstants.CENTER
	            );
	            panelmahasiswa_2012.add(labelmahasiswa_2012[i_2012]);
	        }
	        panelmahasiswa_2012.revalidate();
	        panelmahasiswa_2012.repaint();
	    }
	 private void mulaiSorting_2012() {
	        stepArea_2012.setText("");
	        String pilihan_2012 = comboSort_2012.getSelectedItem().toString();
	        if (pilihan_2012.equals("Insertion Sort")) {
	            insertionSort_2012();
	        }else if (pilihan_2012.equals("Selection Sort")) {
	            selectionSort_2012();
	        } else {
	        	bubbleSort_2012();
	        }
	        updateLabels_2012();
	        JOptionPane.showMessageDialog(this,"Sorting selesai!"
	        );
	 }
	 private void insertionSort_2012() {
	        stepArea_2012.append("=== INSERTION SORT ===\n\n");
	        for (int i_2012 = 1; i_2012 < datamahasiswa_2012.size(); i_2012++) {
	        	ADTMahasiswa_2511532012 key_2012 = datamahasiswa_2012.get(i_2012);
	            int j_2012 = i_2012 - 1;
	            while (j_2012 >= 0 &&
	                    datamahasiswa_2012.get(j_2012).getnama_2012().compareToIgnoreCase(
	                            key_2012.getnama_2012()) > 0) {
	                datamahasiswa_2012.set(j_2012 + 1,
	                datamahasiswa_2012.get(j_2012));
	                j_2012--;
	            }
	            datamahasiswa_2012.set(j_2012 + 1, key_2012);
	            stepArea_2012.append("Langkah " + i_2012 +" : " + tampilnama_2012() + "\n");
	        }
	    }
	 private void selectionSort_2012() {
	        stepArea_2012.append("=== SELECTION SORT ===\n\n");
	        for (int i_2012 = 0; i_2012 < datamahasiswa_2012.size() - 1; i_2012++) {
	            int min_2012 = i_2012;
	            for (int j_2012 = i_2012 + 1;
	                 j_2012 < datamahasiswa_2012.size();
	                 j_2012++) {
	                if (datamahasiswa_2012.get(j_2012).getnama_2012().compareToIgnoreCase(datamahasiswa_2012.get(min_2012).getnama_2012()) < 0) {
	                    min_2012 = j_2012;
	                }
	            }
	            ADTMahasiswa_2511532012 temp_2012 = datamahasiswa_2012.get(i_2012);
	            datamahasiswa_2012.set(i_2012,datamahasiswa_2012.get(min_2012));
	            datamahasiswa_2012.set(min_2012, temp_2012);
	            stepArea_2012.append("Pass " + (i_2012 + 1) + " : " + tampilnama_2012() + "\n"
	            );
	        }
	    }
	   private void bubbleSort_2012() {
	        stepArea_2012.append("=== BUBBLE SORT ===\n\n");
	        for (int i_2012 = 0;
	             i_2012 < datamahasiswa_2012.size() - 1;
	             i_2012++) {
	            for (int j_2012 = 0;
	                 j_2012 < datamahasiswa_2012.size() - i_2012 - 1;
	                 j_2012++) {
	                if (datamahasiswa_2012.get(j_2012).getnama_2012().compareToIgnoreCase(datamahasiswa_2012.get(j_2012 + 1).getnama_2012()) > 0) {
	                    ADTMahasiswa_2511532012 temp_2012 =
	                    datamahasiswa_2012.get(j_2012);
	                    datamahasiswa_2012.set(j_2012,
	                    datamahasiswa_2012.get(j_2012 + 1));
	                    datamahasiswa_2012.set(j_2012 + 1,temp_2012);
	                }
	            }
	            stepArea_2012.append("Pass " + (i_2012 + 1) + " : " + tampilnama_2012() + "\n"
	            );
	        }
	    }
	    private String tampilnama_2012() {
	        String hasil_2012 = "[";
	        for (int i_2012 = 0;
	             i_2012 < datamahasiswa_2012.size();
	             i_2012++) {
	            hasil_2012 += datamahasiswa_2012.get(i_2012).getnama_2012();
	            if (i_2012 != datamahasiswa_2012.size() - 1) {
	                hasil_2012 += ", ";
	            }
	        }
	        hasil_2012 += "]";
	        return hasil_2012;
	    }
	    private void reset_2012() {
	        namaField_2012.setText("");
	        nimField_2012.setText("");
	        prodiField_2012.setText("");
	        stepArea_2012.setText("");
	        datamahasiswa_2012.clear();
	        panelmahasiswa_2012.removeAll();
	        panelmahasiswa_2012.revalidate();
	        panelmahasiswa_2012.repaint();
	    }
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {Mahasiswa_2511532012 gui_2012 = new Mahasiswa_2511532012();
	            gui_2012.setVisible(true);
	        });
	    }
}