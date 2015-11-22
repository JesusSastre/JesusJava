/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package layout;

/*
 * BorderLayoutDemo.java
 *
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutDemo {
	public static boolean RIGHT_TO_LEFT = false;


	/////////MODO///////
	public static String modo = "";

	public static void addComponentsToPane(Container pane) {

		if (!(pane.getLayout() instanceof BorderLayout)) {
			pane.add(new JLabel("Container doesn't use BorderLayout!"));
			return;
		}

		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(
					java.awt.ComponentOrientation.RIGHT_TO_LEFT);
		}
		/////////////////////////////




		final JLabel label = new JLabel("0");
		label.setPreferredSize(new Dimension (600, 100));
		pane.add(label, BorderLayout.PAGE_START);


		JPanel centro = new JPanel();
		centro.setLayout(new GridLayout(5, 4));
		centro.setPreferredSize(new Dimension (600, 800));
		añadirCosas(centro, label);
		pane.add(centro, BorderLayout.CENTER);



		////////////////////////	

	}







	private static void añadirCosas(JPanel centro, JLabel display) {

		JButton ceButton = new JButton("CE");
		JButton cButton = new JButton("C");
		JButton borrarButton = new JButton("<X");
		JButton dividirButton = new JButton("/");
		dividirButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				modo = "Division";

			}
		});

		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("7");
				}else{
					display.setText(display.getText()+"7");
				}


			}
		});
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("8");
				}else{
					display.setText(display.getText()+"8");
				}


			}
		});

		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("9");
				}else{
					display.setText(display.getText()+"9");
				}


			}
		});
		JButton multiplicarButton = new JButton("X");

		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("4");
				}else{
					display.setText(display.getText()+"4");
				}


			}
		});
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("5");
				}else{
					display.setText(display.getText()+"5");
				}


			}
		});
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("6");
				}else{
					display.setText(display.getText()+"6");
				}


			}
		});
		JButton restarButton = new JButton("-");

		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("1");
				}else{
					display.setText(display.getText()+"1");
				}


			}
		});
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("2");
				}else{
					display.setText(display.getText()+"2");
				}

			}
		});
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("3");
				}else{
					display.setText(display.getText()+"3");
				}


			}
		});
		JButton sumarButton = new JButton("+");

		JButton sumarestarButton = new JButton("-+");
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("0");
				}else{
					display.setText(display.getText()+"0");
				}


			}
		});
		JButton buttonpunto = new JButton(".");
		buttonpunto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(display.getText().equals("0")){
					display.setText("0.");
				}else if (display.getText().contains(".")){
					JOptionPane.showMessageDialog(null, "¡Quieeetooo!");
				}else{
					display.setText(display.getText()+".");
				}



			}
		});
		JButton igualButton = new JButton("=");

		centro.add(ceButton);
		centro.add(cButton);
		centro.add(borrarButton);
		centro.add(dividirButton);

		centro.add(button7);
		centro.add(button8);
		centro.add(button9);
		centro.add(multiplicarButton);

		centro.add(button4);
		centro.add(button5);
		centro.add(button6);
		centro.add(restarButton);

		centro.add(button1);
		centro.add(button2);
		centro.add(button3);
		centro.add(sumarButton);

		centro.add(sumarestarButton);
		centro.add(button0);
		centro.add(buttonpunto);
		centro.add(igualButton);


	}







	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event dispatch thread.
	 */
	private static void createAndShowGUI() {

		//Create and set up the window.
		JFrame frame = new JFrame("BorderLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set up the content pane.
		addComponentsToPane(frame.getContentPane());
		//Use the content pane's default BorderLayout. No need for
		//setLayout(new BorderLayout());
		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
