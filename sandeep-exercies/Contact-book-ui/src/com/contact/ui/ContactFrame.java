package com.contact.ui;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

import com.contact.book.ContactBook;
import com.contact.book.ContactBookManager;

public class ContactFrame {

	private JFrame frmContactBook;
	private JTextField fNmeTxt;
	private JTextField lNameTxt;
	private JTextField mobileTxt;
	private JTextField emailTxt;
	private JTextField fNameOuttxt;
	private JTextField lNameOutTxt;
	private JTextField mobileOutTxt;
	private JTextField emailOutTxt;
	private JTextField idTxt;
	private JPanel inputPanel;
	private JLabel fistNameLbl;
	private JLabel lastNmaeLbl;
	private JLabel mobileLbl;
	private JLabel emilLbl;
	private JButton btnAdd;
	private JPanel outputPanel;
	private JButton btnSearchById;
	private JButton btnClr;
	private JButton btnSearchByName;
	private JLabel lblId;
	private ContactBookManager bookManger = new ContactBookManager();
	private Font lblFont= new Font("Tahoma", Font.BOLD, 15);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactFrame window = new ContactFrame();
					window.frmContactBook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ContactFrame() {
		initialize();
	}

	private void initialize() {
		frmContactBook = new JFrame();
		frmContactBook.setTitle("Contact Book");
		frmContactBook.setIconImage(Toolkit.getDefaultToolkit().getImage("DataDump\\contactBookLogo.png"));
		frmContactBook.setBounds(100, 100, 600, 363);
		frmContactBook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContactBook.setResizable(false);
		frmContactBook.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

		inputPanel = new JPanel();
		inputPanel.setBackground(new Color(102, 205, 170));
		frmContactBook.getContentPane().add(inputPanel);
		inputPanel.setLayout(null);

		fistNameLbl = new JLabel("first name");
		fistNameLbl.setFont(lblFont);
		fistNameLbl.setBounds(25, 36, 81, 14);
		inputPanel.add(fistNameLbl);

		fNmeTxt = new JTextField();
		fNmeTxt.setBounds(117, 33, 145, 20);
		inputPanel.add(fNmeTxt);
		fNmeTxt.setColumns(10);

		lastNmaeLbl = new JLabel("last name");
		lastNmaeLbl.setFont(lblFont);
		lastNmaeLbl.setBounds(25, 72, 81, 14);
		inputPanel.add(lastNmaeLbl);

		lNameTxt = new JTextField();
		lNameTxt.setColumns(10);
		lNameTxt.setBounds(117, 69, 145, 20);
		inputPanel.add(lNameTxt);

		mobileLbl = new JLabel("mobile no");
		mobileLbl.setFont(lblFont);
		mobileLbl.setBounds(25, 114, 81, 14);
		inputPanel.add(mobileLbl);

		mobileTxt = new JTextField();
		mobileTxt.setColumns(10);
		mobileTxt.setBounds(117, 111, 145, 20);
		inputPanel.add(mobileTxt);

		emilLbl = new JLabel("email id");
		emilLbl.setFont(lblFont);
		emilLbl.setBounds(25, 158, 66, 14);
		inputPanel.add(emilLbl);

		emailTxt = new JTextField();
		emailTxt.setColumns(10);
		emailTxt.setBounds(117, 155, 151, 20);
		inputPanel.add(emailTxt);

		lblId = new JLabel("id");
		lblId.setFont(lblFont);
		lblId.setBounds(25, 193, 46, 14);
		inputPanel.add(lblId);

		outputPanel = new JPanel();
		outputPanel.setBackground(new Color(135, 206, 250));
		frmContactBook.getContentPane().add(outputPanel);
		outputPanel.setLayout(null);

		fNameOuttxt = new JTextField();
		fNameOuttxt.setColumns(10);
		fNameOuttxt.setBounds(28, 32, 244, 20);
		outputPanel.add(fNameOuttxt);

		lNameOutTxt = new JTextField();
		lNameOutTxt.setColumns(10);
		lNameOutTxt.setBounds(28, 68, 244, 20);
		outputPanel.add(lNameOutTxt);

		mobileOutTxt = new JTextField();
		mobileOutTxt.setColumns(10);
		mobileOutTxt.setBounds(28, 110, 244, 20);
		outputPanel.add(mobileOutTxt);

		emailOutTxt = new JTextField();
		emailOutTxt.setColumns(10);
		emailOutTxt.setBounds(28, 154, 244, 20);
		outputPanel.add(emailOutTxt);

		idTxt = new JTextField();
		idTxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (idTxt.isCursorSet()) {
					btnSearchById.setEnabled(true);
				}
			}
		});
		idTxt.setColumns(10);
		idTxt.setBounds(28, 194, 244, 20);
		outputPanel.add(idTxt);

		btnSearchById = new JButton("searchById");
		btnSearchById.setFont(lblFont);
		btnSearchById.setEnabled(false);
		btnSearchById.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ContactBook contact = bookManger.searchById(idTxt.getText());
				if (contact == null) {
					idTxt.setText("Wrong id...");

				} else {
					fNameOuttxt.setText(contact.getFirstName());
					lNameOutTxt.setText(contact.getLastName());
					mobileOutTxt.setText(contact.getMobile());
					emailOutTxt.setText(contact.getEmail());
					idTxt.setText(contact.getContactId());

				}

			}
		});
		btnSearchById.setBounds(28, 241, 127, 23);
		outputPanel.add(btnSearchById);

		btnClr = new JButton("CLR");
		btnClr.setFont(lblFont);
		btnClr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnSearchById.setEnabled(true);
				btnSearchByName.setEnabled(true);

				fNameOuttxt.setText(null);
				lNameOutTxt.setText(null);
				mobileOutTxt.setText(null);
				emailOutTxt.setText(null);
				idTxt.setText(null);
			}
		});
		btnClr.setBounds(183, 241, 89, 23);
		outputPanel.add(btnClr);

		btnSearchByName = new JButton("searchByFirst&LastName");
		btnSearchByName.setFont(lblFont);
		btnSearchByName.setEnabled(false);
		btnSearchByName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ContactBook contact = bookManger.searchByName(fNameOuttxt.getText(), lNameOutTxt.getText());
				if (contact == null) {
					fNameOuttxt.setText("No Contact found");
				} else {
					fNameOuttxt.setText(contact.getFirstName());
					lNameOutTxt.setText(contact.getLastName());
					mobileOutTxt.setText(contact.getMobile());
					emailOutTxt.setText(contact.getEmail());
					idTxt.setText(contact.getContactId());
				}
			}
		});
		btnSearchByName.setBounds(28, 279, 244, 33);
		outputPanel.add(btnSearchByName);

		btnAdd = new JButton("Add");
		btnAdd.setFont(lblFont);
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (!fNmeTxt.getText().equals("") && !lNameTxt.getText().equals("")) {
					ContactBook c = new ContactBook();

					fNameOuttxt.setText(fNmeTxt.getText());
					lNameOutTxt.setText(lNameTxt.getText());
					mobileOutTxt.setText(mobileTxt.getText());
					emailOutTxt.setText(emailTxt.getText());
					idTxt.setText(c.getContactId());

					c.setFirstName(fNameOuttxt.getText());
					c.setLastName(lNameOutTxt.getText());
					c.setMobile(mobileOutTxt.getText());
					c.setEmail(emailOutTxt.getText());

					fNmeTxt.setText(null);
					lNameTxt.setText(null);
					mobileTxt.setText(null);
					emailTxt.setText(null);

					btnSearchById.setEnabled(false);
					btnSearchByName.setEnabled(false);

					try {
						bookManger.addContacts(c);
					} catch (IOException e) {

						e.printStackTrace();
					}
				}
			}
		});
		btnAdd.setBounds(101, 239, 89, 23);
		inputPanel.add(btnAdd);

	}
}
