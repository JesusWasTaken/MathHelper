package utilityCalc;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class CalcUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField cmtomEntry;
	private JTextField mtocmEntry;
	private JTextField cmtomResult;
	private JTextField mtocmResult;
	private JTextField widthEntry;
	private JTextField heightEntry;
	private JTextField calculateAreaResult;
	private JTextField scaleEntry;
	private JTextField scaleDownEntry;
	private JTextField scaleDownResult;
	private JTextField scaleUpEntry;
	private JTextField scaleUpResult;

	public CalcUI() {
		setResizable(false);
		setSize(600,380);
		setTitle("Math helper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(22, 23, 308, 125);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel converterPanel = new JLabel("Convertisseur");
		converterPanel.setLabelFor(panel);
		converterPanel.setFont(new Font("Tahoma", Font.BOLD, 16));
		converterPanel.setBounds(94, 10, 111, 13);
		panel.add(converterPanel);
		
		JButton cmtomBtn = new JButton("=");
		cmtomBtn.setBackground(Color.WHITE);
		cmtomBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		cmtomBtn.setBounds(132, 42, 57, 21);
		panel.add(cmtomBtn);
		
		JButton mtocmBtn = new JButton("=");
		mtocmBtn.setBackground(Color.WHITE);
		mtocmBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		mtocmBtn.setBounds(132, 87, 57, 21);
		panel.add(mtocmBtn);
		
		cmtomEntry = new JTextField();
		cmtomEntry.setFont(new Font("Tahoma", Font.BOLD, 13));
		cmtomEntry.setHorizontalAlignment(SwingConstants.RIGHT);
		cmtomEntry.setBounds(10, 43, 73, 19);
		panel.add(cmtomEntry);
		cmtomEntry.setColumns(10);
		
		mtocmEntry = new JTextField();
		mtocmEntry.setFont(new Font("Tahoma", Font.BOLD, 13));
		mtocmEntry.setHorizontalAlignment(SwingConstants.RIGHT);
		mtocmEntry.setColumns(10);
		mtocmEntry.setBounds(10, 88, 73, 19);
		panel.add(mtocmEntry);
		
		cmtomResult = new JTextField();
		cmtomResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		cmtomResult.setHorizontalAlignment(SwingConstants.RIGHT);
		cmtomResult.setEditable(false);
		cmtomResult.setBackground(Color.LIGHT_GRAY);
		cmtomResult.setBounds(199, 43, 73, 19);
		panel.add(cmtomResult);
		cmtomResult.setColumns(10);
		
		mtocmResult = new JTextField();
		mtocmResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		mtocmResult.setHorizontalAlignment(SwingConstants.RIGHT);
		mtocmResult.setEditable(false);
		mtocmResult.setColumns(10);
		mtocmResult.setBackground(Color.LIGHT_GRAY);
		mtocmResult.setBounds(199, 88, 73, 19);
		panel.add(mtocmResult);
		
		JLabel lblNewLabel_1 = new JLabel("cm");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(85, 42, 31, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("m");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(85, 87, 31, 16);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("cm");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(275, 87, 31, 16);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("m");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(275, 42, 31, 16);
		panel.add(lblNewLabel_1_1_1);
		
		JPanel areaCalcPanel = new JPanel();
		areaCalcPanel.setBackground(Color.LIGHT_GRAY);
		areaCalcPanel.setBounds(22, 158, 294, 154);
		getContentPane().add(areaCalcPanel);
		areaCalcPanel.setLayout(null);
		
		widthEntry = new JTextField();
		widthEntry.setFont(new Font("Tahoma", Font.BOLD, 13));
		widthEntry.setHorizontalAlignment(SwingConstants.RIGHT);
		widthEntry.setBounds(112, 37, 96, 19);
		areaCalcPanel.add(widthEntry);
		widthEntry.setColumns(10);
		
		JLabel lblCalculDaire = new JLabel("Calculs d'aires");
		lblCalculDaire.setBounds(89, 10, 119, 17);
		lblCalculDaire.setFont(new Font("Tahoma", Font.BOLD, 16));
		areaCalcPanel.add(lblCalculDaire);
		
		heightEntry = new JTextField();
		heightEntry.setFont(new Font("Tahoma", Font.BOLD, 13));
		heightEntry.setHorizontalAlignment(SwingConstants.RIGHT);
		heightEntry.setColumns(10);
		heightEntry.setBounds(112, 66, 96, 19);
		areaCalcPanel.add(heightEntry);
		
		JLabel lblNewLabel_1_3 = new JLabel("longueur");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(36, 35, 66, 19);
		areaCalcPanel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("largeur");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(42, 64, 53, 19);
		areaCalcPanel.add(lblNewLabel_1_3_1);
		
		JButton calculateAreaBtn = new JButton("calculer");
		calculateAreaBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		calculateAreaBtn.setBounds(112, 94, 96, 21);
		areaCalcPanel.add(calculateAreaBtn);
		
		calculateAreaResult = new JTextField();
		calculateAreaResult.setBackground(Color.LIGHT_GRAY);
		calculateAreaResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		calculateAreaResult.setHorizontalAlignment(SwingConstants.RIGHT);
		calculateAreaResult.setEditable(false);
		calculateAreaResult.setBounds(112, 125, 96, 19);
		areaCalcPanel.add(calculateAreaResult);
		calculateAreaResult.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("m\u00B2");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(218, 124, 31, 16);
		areaCalcPanel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("m");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(218, 36, 31, 16);
		areaCalcPanel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("m");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(218, 65, 31, 16);
		areaCalcPanel.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("r\u00E9sultat :");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_2.setBounds(36, 125, 66, 19);
		areaCalcPanel.add(lblNewLabel_1_3_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(345, 23, 220, 299);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMiseLchelle = new JLabel("Mise \u00E0 l'\u00E9chelle");
		lblMiseLchelle.setBounds(48, 5, 151, 17);
		lblMiseLchelle.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_1.add(lblMiseLchelle);
		
		JLabel lblNewLabel_1_4 = new JLabel("1 /");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(10, 58, 21, 16);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("\u00E9chelle");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_3.setBounds(20, 32, 66, 19);
		panel_1.add(lblNewLabel_1_3_3);
		
		scaleEntry = new JTextField();
		scaleEntry.setFont(new Font("Tahoma", Font.BOLD, 13));
		scaleEntry.setHorizontalAlignment(SwingConstants.LEFT);
		scaleEntry.setColumns(10);
		scaleEntry.setBounds(36, 59, 50, 19);
		panel_1.add(scaleEntry);
		
		JLabel lblNewLabel_1_3_4 = new JLabel("<html><font color=rgb(255,99,71)>scale up</font></html>");
		lblNewLabel_1_3_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_4.setBounds(10, 216, 66, 19);
		panel_1.add(lblNewLabel_1_3_4);
		
		JLabel lblNewLabel_1_3_4_1 = new JLabel("<html><font color=rgb(70,130,180)>scale down</font></html>");
		lblNewLabel_1_3_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_4_1.setBounds(10, 113, 90, 19);
		panel_1.add(lblNewLabel_1_3_4_1);
		
		scaleDownEntry = new JTextField();
		scaleDownEntry.setFont(new Font("Tahoma", Font.BOLD, 13));
		scaleDownEntry.setHorizontalAlignment(SwingConstants.RIGHT);
		scaleDownEntry.setColumns(10);
		scaleDownEntry.setBounds(10, 142, 56, 19);
		panel_1.add(scaleDownEntry);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("m");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_3.setBounds(65, 141, 21, 16);
		panel_1.add(lblNewLabel_1_1_3);
		
		scaleDownResult = new JTextField();
		scaleDownResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		scaleDownResult.setHorizontalAlignment(SwingConstants.RIGHT);
		scaleDownResult.setEditable(false);
		scaleDownResult.setColumns(10);
		scaleDownResult.setBackground(Color.LIGHT_GRAY);
		scaleDownResult.setBounds(121, 142, 66, 19);
		panel_1.add(scaleDownResult);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("cm");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(189, 141, 31, 16);
		panel_1.add(lblNewLabel_1_2_1);
		
		JButton scaleDownBtn = new JButton("convertir");
		scaleDownBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scaleDownBtn.setBackground(new Color(70, 130, 180));
		scaleDownBtn.setBounds(59, 171, 85, 21);
		panel_1.add(scaleDownBtn);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("<html><font color=rgb(70,130,180)>=></font></html>");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_2.setBounds(96, 141, 31, 16);
		panel_1.add(lblNewLabel_1_2_2);
		
		scaleUpEntry = new JTextField();
		scaleUpEntry.setFont(new Font("Tahoma", Font.BOLD, 13));
		scaleUpEntry.setHorizontalAlignment(SwingConstants.RIGHT);
		scaleUpEntry.setColumns(10);
		scaleUpEntry.setBounds(10, 245, 56, 19);
		panel_1.add(scaleUpEntry);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("cm");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1_1.setBounds(69, 244, 31, 16);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		scaleUpResult = new JTextField();
		scaleUpResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		scaleUpResult.setHorizontalAlignment(SwingConstants.RIGHT);
		scaleUpResult.setEditable(false);
		scaleUpResult.setColumns(10);
		scaleUpResult.setBackground(Color.LIGHT_GRAY);
		scaleUpResult.setBounds(121, 245, 66, 19);
		panel_1.add(scaleUpResult);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("m");
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_3_1.setBounds(189, 244, 21, 16);
		panel_1.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("<html><font color=rgb(255,99,71)>=></font></html>");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_2_1.setBounds(96, 244, 31, 16);
		panel_1.add(lblNewLabel_1_2_2_1);
		
		JButton scaleUpBtn = new JButton("convertir");
		scaleUpBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scaleUpBtn.setBackground(new Color(255, 99, 71));
		scaleUpBtn.setBounds(59, 268, 85, 21);
		panel_1.add(scaleUpBtn);
		
		cmtomBtn.addActionListener(e -> {
			try {
				Double entry = Double.parseDouble(cmtomEntry.getText());
				cmtomResult.setText(""+BaseConverter.centiToMeter(entry));
			} catch(Exception f) {
				
			}
		});
		
		mtocmBtn.addActionListener(e -> {
			try {
				Double entry = Double.parseDouble(mtocmEntry.getText());
				mtocmResult.setText(""+BaseConverter.meterToCenti(entry));
			} catch(Exception f) {
				
			}
		});
		
		calculateAreaBtn.addActionListener(e -> {
			try {
				Double width = Double.parseDouble(widthEntry.getText());
				Double height = Double.parseDouble(heightEntry.getText());
				calculateAreaResult.setText(""+Calculator.squareArea(width, height));
			} catch(Exception f) {
				
			}
		});
		
		scaleDownBtn.addActionListener(e -> {
			try {
				Double scale = Double.parseDouble(scaleEntry.getText());
				Double entry = Double.parseDouble(scaleDownEntry.getText());
				scaleDownResult.setText(Calculator.scaleDown(scale, entry));
			} catch(Exception f) {
				
			}
		});
		
		scaleUpBtn.addActionListener(e -> {
			try {
				Double scale = Double.parseDouble(scaleEntry.getText());
				Double entry = Double.parseDouble(scaleUpEntry.getText());
				scaleUpResult.setText(Calculator.scaleUp(scale, entry));
			} catch(Exception f) {
				
			}
		});
		
		this.setVisible(true);
	}
}
