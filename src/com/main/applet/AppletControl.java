package com.main.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Exemplo de JavaApplet.
 * 
 * @author Vladwoguer Bezerra
 *
 */
public class AppletControl extends Applet {

	public void init() {
		AWTAccess awtAccesseExample = new AWTAccess();
	}
}

class AWTAccess {
	private Frame mainFrame;
	private TextField password;
	private Panel controlPanel;

	public AWTAccess() {
		prepareGUI();
	}

	private void prepareGUI() {
		mainFrame = new Frame("Controle de acesso");
		mainFrame.setSize(250, 280);
		mainFrame.setLayout(new GridBagLayout());
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});

		password = new TextField(12);
		password.setFont(new Font("Arial", Font.PLAIN, 28));
		password.setEditable(false);
		password.setEchoChar('*');

		controlPanel = new Panel();
		controlPanel.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc = new GridBagConstraints();

		gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 0;
		gbc.ipadx = 0;
		gbc.gridx = 0;
		gbc.gridy = 1;

		mainFrame.add(password, gbc);
		gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 0;
		gbc.ipadx = 0;
		gbc.gridx = 0;
		gbc.gridy = 2;
		mainFrame.add(controlPanel, gbc);

		Panel panel = new Panel();
		panel.setBackground(Color.darkGray);

		GridBagLayout layout = new GridBagLayout();

		panel.setLayout(layout);

		gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 0;
		gbc.gridy = 0;
		Button sevenButton = new Button("7");
		sevenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "7");

			}
		});
		panel.add(sevenButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 1;
		gbc.gridy = 0;
		Button eightButton = new Button("8");
		eightButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "8");

			}
		});
		panel.add(eightButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 2;
		gbc.gridy = 0;
		Button nineButton = new Button("9");
		nineButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "9");

			}
		});
		panel.add(nineButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 60;
		gbc.ipadx = 20;
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.gridheight = 2;
		Button clearButton = new Button("Limpar");
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText("");

			}
		});
		panel.add(clearButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 60;
		gbc.ipadx = 20;
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridheight = 2;
		Button loginButton = new Button("Acessar");
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Frame subFrame = new Frame("Acesso");
				subFrame.setSize(250, 280);
				Label label = new Label("Você usou o código: " + password.getText());
				subFrame.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent windowEvent) {
						subFrame.setVisible(false);
					}
				});
				subFrame.add(label);
				subFrame.setVisible(true);

			}
		});

		panel.add(loginButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 0;
		gbc.gridy = 1;
		Button fourButton = new Button("4");
		fourButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "4");

			}
		});
		panel.add(fourButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 1;
		gbc.gridy = 1;
		Button fiveButton = new Button("5");
		fiveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "5");

			}
		});
		panel.add(fiveButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 2;
		gbc.gridy = 1;
		Button sixButton = new Button("6");
		sixButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "6");

			}
		});
		panel.add(sixButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 0;
		gbc.gridy = 2;
		Button oneButton = new Button("1");
		oneButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "1");

			}
		});
		panel.add(oneButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 1;
		gbc.gridy = 2;
		Button twoButton = new Button("2");
		twoButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "2");

			}
		});
		panel.add(twoButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 20;
		gbc.gridx = 2;
		gbc.gridy = 2;
		Button threeButton = new Button("3");
		threeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "3");

			}
		});
		panel.add(threeButton, gbc);

		gbc = new GridBagConstraints();
		gbc.ipady = 20;
		gbc.ipadx = 100;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 3;
		Button zeroButton = new Button("0");
		zeroButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				password.setText(password.getText() + "0");

			}
		});
		panel.add(zeroButton, gbc);

		controlPanel.add(panel);

		mainFrame.setVisible(true);
	}
}