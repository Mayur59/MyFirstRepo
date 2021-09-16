package com.mayur;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.awt.Graphics;
import java.awt.color.*;

public class Chess extends JFrame implements ItemListener, ActionListener {

	ImageIcon v = new ImageIcon();
	ImageIcon vt = new ImageIcon();
	ImageIcon tempv = new ImageIcon();
	int kiroo = 0;
	String en_pass;
	int kingi, kingj;
	int rt = 0;
	int g1 = 0;
	int g2 = 0;

	int state;
	int i, j, h, ii, jj, x, y, count = 1, yesnull;
	int p = 0;
	int ki = 0, kj = 0;
	int cnt;
	int tempi, tempj;
	int player;
	String tname;

	// Icon c1;
	boolean type, set;

	ImageIcon ic1, ic2, icon, ic11, ic22;
	Checkbox c1, c2;
	JLabel l1, l2;
	JButton u;

	JButton b[][] = new JButton[64][64];
	JButton reset;
	JButton undo;
	ImageIcon c, t, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
	int flag;
	int diri, dirj;

	/*
	 * public void paint(Graphics g){ g.drawLine(700, 600, 50, 100);
	 * g.setColor(Color.GREEN); }
	 */
	public Chess() {

		CheckboxGroup cbg = new CheckboxGroup();
		c1 = new Checkbox("vs friend ", cbg, false);
		c2 = new Checkbox("vs computer", cbg, false);
		c1.setBounds(120, 80, 100, 40);
		c2.setBounds(120, 150, 100, 40);
		add(c1);
		add(c2);

		c = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\Pawn.jpg");
		c.setDescription("Pb");
		t = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\white_pawn_new.jpg");
		t.setDescription("pw");
		t1 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\white_rook.jpg");
		t1.setDescription("rw");
		t2 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\black_rook.jpg");
		t2.setDescription("rb");
		t3 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\white_bishop.jpg");
		t3.setDescription("bw");
		t4 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\black_bishop.jpg");
		t4.setDescription("bb");
		t5 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\black_knight.jpg");
		t5.setDescription("kb");
		t6 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\white_knight.jpg");
		t6.setDescription("kw");
		t7 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\white_king.jpg");
		t7.setDescription("KKw");
		t8 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\black_king.jpg");
		t8.setDescription("KKb");
		t9 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\white_rani.jpg");
		t9.setDescription("qw");
		t10 = new ImageIcon("C:\\Users\\hp\\Downloads\\ms_team\\chess\\Chess\\Chess\\black_rani.jpg");
		t10.setDescription("qb");

		c1.addItemListener(this);
		c2.addItemListener(this);

		type = true;
		set = true;

		setLayout(null);
		setSize(800, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public void setId(int i) {

	}

	public void showButton() {

		System.out.println("yes in show method");
		x = 50;
		y = 50;
		j = 0;
		System.out.println("x=" + x + "y=" + 50 + "j=" + j + "i=" + i + "h=" + h + "count=" + count);
		int r = 0;
		for (i = 0; i <= 7; i++) {
			for (h = 0; h <= 7; h++, x += 50, j++) {

				count++;
				// System.out.println("count="+count);
				if (rt != 1) {

					b[i][h] = new JButton();
					b[i][h].setName(null);
					// System.out.println("resetting peices");

				}
				if (rt == 1) {
					for (int x = 2; x <= 5; x++) {
						for (int y = 0; y <= 7; y++) {
							b[x][y].setIcon(null);
						}
					}

				}
				if (i == 1)
					b[i][h].setIcon(c);

				if (i == 6)
					b[i][h].setIcon(t);
				if (i == 7 && h == 0)
					b[7][0].setIcon(t1);
				if (i == 7 && h == 7)
					b[7][7].setIcon(t1);
				if (i == 0 && h == 0)
					b[0][0].setIcon(t2);
				if (i == 0 && h == 7)
					b[0][7].setIcon(t2);
				if (i == 7 && h == 2)
					b[7][2].setIcon(t3);
				if (i == 7 && h == 5) {
					b[7][5].setIcon(t3);

				}
				if (i == 0 && h == 2) {
					b[0][2].setIcon(t4);
				}
				if (i == 0 && h == 5)
					b[0][5].setIcon(t4);
				if (i == 7 && h == 1) {
					// System.out.println("it is in setting image of Knight t"+t);

					b[7][1].setIcon(t6);
				}
				if (i == 7 && h == 6) {
					b[7][6].setIcon(t6);
					// System.out.println("it is in setting image of Knight t"+t);
				}
				if (i == 0 && h == 1)
					b[0][1].setIcon(t5);
				if (i == 0 && h == 6)
					b[0][6].setIcon(t5);
				if (i == 7 && h == 4)
					b[7][4].setIcon(t7);
				if (i == 0 && h == 4)
					b[0][4].setIcon(t8);
				if (i == 7 && h == 3)
					b[7][3].setIcon(t9);
				if (i == 0 && h == 3)
					b[0][3].setIcon(t10);

				// b[i].setIcon(new ImageIcon("Pawn.jpg");

				if (r % 2 == 0) {
					// System.out.println("reset setting if block r="+r);

					if (h % 2 == 0) {
						b[i][h].setBackground(Color.WHITE);
						// System.out.println("reset setting if block h="+h);

					} else {
						b[i][h].setBackground(Color.BLACK);
						// System.out.println("reset setting if else block h="+h);
					}

				} else {
					if (h % 2 == 0) {
						b[i][h].setBackground(Color.BLACK);

					} else {
						b[i][h].setBackground(Color.WHITE);
					}
				}
				if (j == 7) {
					r++;
				}
				if (j == 8) {
					j = 0;
					y += 50;
					x = 50; // r++;
				}
				// System.out.print(r);
				if (rt != 1) {

					add(b[i][h]);

					// System.out.println("it is runiig");
					// System.out.print("i=" +i + " " + "h="+h);

					b[i][h].setBounds(x, y, 50, 50);
					b[i][h].addActionListener(this);
				}

				// System.out.println("location is for reset ="+ b[i][h].getLocation());

			} // eof for
		}
		if (rt != 1) {

			undo = new JButton("UNDO");
			reset = new JButton("RESET");
			undo.setBounds(50, 450, 100, 50);
			reset.setBounds(150, 450, 100, 50);
			add(reset);
			reset.addActionListener(this);

			add(undo);
			undo.addActionListener(this);

			System.out.println(" Reset count" + count);

		}

		/*
		 * b[1][0].setText("rook"); b[1][7].setText("rook");
		 * b[6][7].setText("rook");b[6][0].setText("rook"); b[0][1].setText("knight");
		 * b[0][6].setText("knight"); b[7][6].setText("knight");
		 * b[7][1].setText("knight"); b[0][2].setText("bishop");
		 * b[0][5].setText("bishop"); b[7][2].setText("bishop");
		 * b[7][5].setText("bishop"); b[0][3].setText("queen");
		 * b[7][4].setText("queen"); b[0][4].setText("king"); b[7][5].setText("king");
		 */
		for (int m = 1; m <= 1; m++) {
			for (int n = 0; n <= 7; n++) {
				// b[m][n].setText("pawn");

			}
		}

		for (int m = 6; m <= 6; m++) {
			for (int n = 0; n <= 7; n++) {
				// b[m][n].setText("pawn");

			}
		}

		for (int m = 0; m <= 1; m++) {
			for (int n = 0; n <= 7; n++) {
				b[m][n].setName("p1ayer1");
				player = 1;
				// b[m][n].setEnabled(false);
			}
		}

		for (int x = 6; x <= 7; x++) {
			for (int z = 0; z <= 7; z++) {
				player = 2;
				b[x][z].setName("p1ayer2");
				// b[m][n].setEnabled(false);
			}
		}
	}

	/*
	 * public void paint(Graphics g){ g.drawLine(700, 600, 50, 100);
	 * g.setColor(Color.GREEN); }
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

		/*
		 * if(e.getSource()==reset){
		 * System.out.println(" yes ,it is  entered the reset ");
		 * System.out.println(" For reset = tempi="+i+"tempj="+j);
		 * System.out.println(icon); System.out.println(v.getDescription());
		 * System.out.println(vt);
		 * 
		 * }
		 */
		System.out.println("in action listner");

		if (p == 0) {

			System.out.println("P_0 and G1=" + g1);
			g1++;

			System.out.println(" fisrst starter  p=" + p);

			/*
			 * if(e.getSource()==reset){
			 * System.out.println(" yes ,it is  entered the reset ");
			 * 
			 * 
			 * }
			 */
			int rst = 0;
			int resett = 0;
			for (int i = 0; i <= 63; i++) {
				if (rst == 1) {
					if (state == 1) {
						state = state - 1;
						System.out.println("Undo state=" + state);
					} else {
						state = state + 1;
						System.out.println("Undo state=" + state);
					}

					// state=0;
					break;
				}
				if (resett == 1) {
					state = 0;
					resett = 0;
					System.out.println(" final reset=" + resett);
					break;
				}
				for (int j = 0; j <= 63; j++) {
					// int rst=0;
					if ((e.getSource() == reset)) {
						// repaint(0,0,330,450);
						rt = 1;
						i = 0;
						h = 0;
						count = 0;
						showButton();
						// cnt--;
						System.out.println("cnt in reset cnt=" + cnt);
						resett = 1;
						System.out.println("yes , it is entered in reset");
						System.out.println("reset=" + resett);
						break;

					}
					if ((e.getSource() == undo) && (diri == i) && (dirj == j)) {
						System.out.println(" yes ,it is  entered the Undo ");
						System.out.println(" For Undo = tempi=" + i + "tempj=" + j);
						System.out.println(icon);
						icon = (ImageIcon) b[ki][kj].getIcon();
						b[tempi][tempj].setIcon(icon);
						b[ki][kj].setIcon(vt);
						System.out.println("Undo temp=" + b[tempi][tempj].getName());
						System.out.println("undo temp=" + b[ki][kj].getName());
						// b[ki][kj].setName("p1ayer1");

						if (b[ki][kj].getName() == "p1ayer1") {
							b[ki][kj].setName("p1ayer2");

						} else {
							b[ki][kj].setName("p1ayer1");
						}

						System.out.println(v.getDescription());
						System.out.println(vt);
						rst++;
						break;

					}
					if (b[tempi][tempj] == b[i][j] && cnt == 1) {
						System.out.println("fist if break");
						break;
					}

					if ((e.getSource() == b[i][j]) && (cnt == 0)) {
						if (b[i][j].getIcon() == null) {
							System.out.println("null image without image count=" + cnt);
							break;
						}
					}

					if (e.getSource() == b[i][j]) // gameButtons[i][j] was clicked
					{
						if (e.getSource() == b[i][j] && state == 0) {
							if (b[i][j].getName() == "p1ayer1") {
								JOptionPane.showConfirmDialog(getParent(), " White piece Turn");
								System.out.println(" sorry , player 2 due");

								System.out.println(" in player1");
								// state++;
								break;

							}
						}
						if (e.getSource() == b[i][j] && state == 1) {
							if (b[i][j].getName() == "p1ayer2") {

								JOptionPane.showConfirmDialog(getParent(), "Black Piece Turn");
								System.out.println(" sorry , player 1 due");
								System.out.println(" in player2");
								// state++;
								break;

							}
						}

						System.out.println("i=" + i + "j=" + j + "  //gameButtons[i][j] was clicked  " + "cnt=" + cnt);
						System.out.println(b[i][j].getName());
						if (cnt == 0) {
							tempi = i;
							tempj = j;
							System.out.println("tempi=" + i + "tempj=" + j);
							icon = (ImageIcon) b[tempi][tempj].getIcon();
							System.out.println(icon);
							tname = b[tempi][tempj].getName();
							System.out.println(" only  0==cont=" + cnt);
							cnt++;
							p = 1;
							if (b[i][j].getName() == "p1ayer2") {
								type = true;
							}
							if (b[i][j].getName() == "p1ayer1") {
								type = false;
							}

							System.out.println(" first state=" + state);

							System.out.println("only cnt==0 first count=" + cnt);

						} // end if

					} // end if

				} // Inner for end

			} // outer For end
		} // Start if end
		else {
			g2++;
			System.out.println("P_1 and God=" + g2);
			System.out.println("comes in else part of starter p=0");
			System.out.println(" next p=" + p + "count=" + cnt);
			int i = 0;
			for (i = 0; i <= 63; i++) {
				for (int j = 0; j <= 63; j++) {
					/*
					 * if(e.getSource()==b[i][j]) //gameButtons[i][j] was clicked {
					 * System.out.println("mayur"); if(e.getSource()==b[i][j] && cnt==1 && state==0)
					 * { if(b[i][j].getName()=="p1ayer2") { System.out.println("  next in player2");
					 * break;
					 * 
					 * } } }
					 */
					// System.out.println("tempi= "+tempi +" tempj= "+ tempj+"i= "+i+" j= "+j);

					// System.out.println("tempi and temp j="+ tempi +tempj);
					// System.out.println("b object "+ b[tempi][tempj]);
					// System.out.println("b object "+ e.getSource());

					if (b[tempi][tempj] == e.getSource() && cnt == 1) {
						System.out.println(" if tempi and temp j=" + tempi + tempj);
						b[i][j] = (JButton) e.getSource();
						if (b[tempi][tempj].getName() == b[i][j].getName()) {
							System.out.println("b object " + b[tempi][tempj]);
							System.out.println("b object " + b[tempi][tempj].getIcon());
							System.out.println("b[i][j] " + b[i][j].getIcon());
							System.out.println("b[tempi][tempj] " + b[tempi][tempj].getIcon());
							System.out.println("b object " + e.getSource());

							System.out.println("b[tempi][tempj].getName()" + b[tempi][tempj].getName());
							System.out.println("b[i][j].getName()" + b[i][j].getName());
							System.out.println("tempi= " + tempi + " tempj= " + tempj + "i= " + i + " j= " + j);
							System.out.println(" if same button is clicked and cnt==1  ");
							icon = null;
							cnt--;
							p = 0;
							break;
						}
						System.out.println("b[tempi][tempj].getName() =" + b[tempi][tempj].getName());
						System.out.println("b[i][j].getName() =" + b[i][j].getName());
						System.out.println("tempi= " + tempi + " tempj= " + tempj + "i= " + i + " j= " + j);
						System.out.println(" if same button is clicked  and cnt not eql to 1 ");
						icon = null;
						cnt--;
						p = 0;
						break;
					}
					// System.out.println("tempi= "+tempi +" tempj= "+ tempj+"i= "+i+" j= "+j);

					if (e.getSource() == b[i][j] && cnt == 1) // gameButtons[i][j] was clicked
					{
						System.out.println("b[i][j] " + b[i][j].getIcon());
						System.out.println(" not temp b[tempi][tempj] " + b[tempi][tempj].getIcon());

						diri = tempi;
						dirj = tempj;
						ki = i;
						kj = j;

						System.out.println(" next in cnt 1  2 if " + "i=" + i + "j=" + j + " ki=" + ki + "  kj=" + kj);
						v = (ImageIcon) b[tempi][tempj].getIcon();
						vt = (ImageIcon) b[i][j].getIcon();
						System.out.println(v.getDescription());
						System.out.println("vt=" + vt);

						if (v.getDescription() == "pw") // White pawn
						{
							System.out.println("coming to locking condition pw");

							if (e.getSource() == b[i][j] && vt != null) {
								// System.out.println("Lates watch for player"+b[i][j].getName());
								if (vt.getDescription() == "pw" || vt.getDescription() == "Kw"
										|| vt.getDescription() == "Kw" || vt.getDescription() == "qw"
										|| vt.getDescription() == "KKw" || vt.getDescription() == "bw") {
									System.out.println(" in player2");
									// b[tempi][tempj].setIcon(null);

									icon = null;
									cnt--;
									p = 0;

									break;
								}
							}

							// Npass code start

							if ((i == diri - 1 && j == dirj) || (i == diri - 2 && j == dirj)
									|| (i == diri - 1 && j == dirj + 1) || (i == diri - 1 && j == dirj - 1)) {
								// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

								if ((j == dirj + 1) && (vt == null)
										&& (((tempj != 7)) && ((b[tempi][tempj + 1].getText() == "npass")))) {

									System.out.println("actuall en pasnat starts for right side");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("diri=" + diri + "dirj=" + dirj);

									b[tempi][tempj].setIcon(null);
									b[tempi][tempj + 1].setIcon(null);
									b[tempi][tempj + 1].setText(null);

									icon = null;
									cnt--;
									p = 0;
								} else if ((vt == null)
										&& (((tempj != 0)) && ((b[tempi][tempj - 1].getText() == "npass")))) {
									System.out.println("actuall en pasnat starts for  left side");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("diri=" + diri + "dirj=" + dirj);

									b[tempi][tempj].setIcon(null);
									b[tempi][tempj - 1].setIcon(null);
									b[tempi][tempj - 1].setText(null);

									icon = null;
									cnt--;
									p = 0;
								} else if ((vt == null) && ((j == (dirj + 1)) || (j == (dirj - 1)))) {
									System.out.println("enter in pwan hit on cross null and dont have en pasant");
									icon = null;
									cnt--;
									p = 0;

									break;

								} else {
									if (tempi == i - 2) {
										System.out.println("setting en pasant");
										b[i][j].setText("npass");
									}

									// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

									System.out.println("enetered in locking condition ");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("diri=" + diri + "dirj=" + dirj);

									b[tempi][tempj].setIcon(null);
									if (tempi == i + 2) {
										System.out.println("setting en pasant");
										b[i][j].setText("npass");
									}

									icon = null;
									cnt--;
									p = 0;
								}
							}
						}

						if (v.getDescription() == "Pb") // Black pawn
						{
							System.out.println("testing of black pawn ");

							if (e.getSource() == b[i][j] && vt != null) {
								// System.out.println("Lates watch for player"+b[i][j].getName());

								// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

								if (vt.getDescription() == "Pb" || vt.getDescription() == "Kb"
										|| vt.getDescription() == "Kb" || vt.getDescription() == "qb"
										|| vt.getDescription() == "KKb" || vt.getDescription() == "bb") {
									System.out.println(" in player 1");
									// b[tempi][tempj].setIcon(null);

									icon = null;
									cnt--;
									p = 0;

									break;
								}

								// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
							}

							System.out.println("coming to locking condition pb");
							// code start for en pasant
							// if((vt==null)&&(b[i][j].getText()=="npass"))
							if ((i == diri + 1 && j == dirj) || (i == diri + 2 && j == dirj)
									|| (i == diri + 1 && j == dirj + 1) || (i == diri + 1 && j == dirj - 1)) {
								if ((j == dirj + 1) && (vt == null)
										&& (((tempj != 7)) && ((b[tempi][tempj + 1].getText() == "npass")))) {

									System.out.println("actuall en pasnat starts for right side");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("diri=" + diri + "dirj=" + dirj);

									b[tempi][tempj].setIcon(null);
									b[tempi][tempj + 1].setIcon(null);
									b[tempi][tempj + 1].setText(null);

									icon = null;
									cnt--;
									p = 0;
								} else if ((vt == null)
										&& (((tempj != 0)) && ((b[tempi][tempj - 1].getText() == "npass")))) {
									System.out.println("actuall en pasnat starts for  left side");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("diri=" + diri + "dirj=" + dirj);

									b[tempi][tempj].setIcon(null);
									b[tempi][tempj - 1].setIcon(null);
									b[tempi][tempj - 1].setText(null);

									icon = null;
									cnt--;
									p = 0;
								} else if ((vt == null) && ((j == (dirj + 1)) || (j == (dirj - 1)))) {
									System.out.println("enter in pwan hit on cross null and dont have en pasant");
									icon = null;
									cnt--;
									p = 0;

									break;

								} else {
									if (tempi == i - 2) {
										System.out.println("setting en pasant");
										b[i][j].setText("npass");
									}
									System.out.println("enetered in locking condition ");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("diri=" + diri + "dirj=" + dirj);

									b[tempi][tempj].setIcon(null);

									icon = null;
									cnt--;
									p = 0;
								}
							}
						}

						// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

						if (v.getDescription() == "KKw" || v.getDescription() == "KKb") // White or black Queen
						{

							// Code Start for short castaling for white King

							System.out.println(
									"enterd in castling test 7  5" + b[7][5].getIcon() + " v=" + v + "  vt=" + vt);
							if ((e.getSource() == b[7][6]) && (vt == null) && (b[7][5].getIcon() == null)) {

								System.out.println("enterd in castling test");
								b[i][j].setIcon(icon);
								b[i][j].setName(tname);
								tempv = (ImageIcon) b[7][7].getIcon();
								System.out.println("setting image to king of rook");
								b[7][5].setIcon(tempv);
								b[7][7].setIcon(null);
								b[tempi][tempj].setIcon(null);

								icon = null;
								cnt = 0;
								p = 0;
								kiroo = 1;

							}
							if ((e.getSource() == b[7][6]) && (kiroo == 0)
									&& (vt == null && b[7][5].getIcon() != null)) {
								System.out.println(" latestes castel setting ");
								icon = null;
								cnt--;
								p = 0;
								// state++;
								break;

							}
							// Code End for short casting of white king

							// code start for long castling of white king

							System.out.println(
									"enterd in castling test 7  5" + b[7][5].getIcon() + " v=" + v + "  vt=" + vt);
							if ((e.getSource() == b[7][2]) && (vt == null) && (b[7][1].getIcon() == null)
									&& (b[7][3].getIcon() == null)) {

								System.out.println("enterd in castling test");
								b[i][j].setIcon(icon);
								b[i][j].setName(tname);
								tempv = (ImageIcon) b[7][0].getIcon();
								System.out.println("setting image to king of rook");
								b[7][3].setIcon(tempv);
								b[7][0].setIcon(null);
								b[tempi][tempj].setIcon(null);

								icon = null;
								cnt = 0;
								p = 0;
								kiroo = 1;

							}
							if ((e.getSource() == b[7][2]) && (kiroo == 0)
									&& (vt == null && (b[7][1].getIcon() != null) || b[7][3].getIcon() != null)) {
								System.out.println(" latestes castel setting ");
								icon = null;
								cnt--;
								p = 0;
								// state++;
								break;

							}

							// code end for long castling for white king

							// code start for short castling for Black king

							System.out.println(
									"enterd in castling test 0  5" + b[0][5].getIcon() + " v=" + v + "  vt=" + vt);
							if ((e.getSource() == b[0][6]) && (vt == null) && (b[0][5].getIcon() == null)) {

								System.out.println("enterd in castling test");
								b[i][j].setIcon(icon);
								b[i][j].setName(tname);
								tempv = (ImageIcon) b[0][7].getIcon();
								System.out.println("setting image to king of rook");
								b[0][5].setIcon(tempv);
								b[0][7].setIcon(null);
								b[tempi][tempj].setIcon(null);

								icon = null;
								cnt = 0;
								p = 0;
								kiroo = 1;

							}
							if ((e.getSource() == b[0][6]) && (kiroo == 0)
									&& (vt == null && b[0][5].getIcon() != null)) {
								System.out.println(" latestes castel setting ");
								icon = null;
								cnt--;
								p = 0;
								// state++;
								break;

							}
							// Code End for short casting of Black king

							// code start for long castling of Black king

							System.out.println(
									"enterd in castling test 0  5" + b[0][5].getIcon() + " v=" + v + "  vt=" + vt);
							if ((e.getSource() == b[0][2]) && (vt == null) && (b[0][1].getIcon() == null)
									&& (b[0][3].getIcon() == null)) {

								System.out.println("enterd in castling test");
								b[i][j].setIcon(icon);
								b[i][j].setName(tname);
								tempv = (ImageIcon) b[0][0].getIcon();
								System.out.println("setting image to king of rook");
								b[0][3].setIcon(tempv);
								b[0][0].setIcon(null);
								b[tempi][tempj].setIcon(null);

								icon = null;
								cnt = 0;
								p = 0;
								kiroo = 1;

							}
							if ((e.getSource() == b[0][2]) && (kiroo == 0)
									&& (vt == null && (b[0][1].getIcon() != null) || b[0][3].getIcon() != null)) {
								System.out.println(" latestes castel setting ");
								icon = null;
								cnt--;
								p = 0;
								// state++;
								break;

							}

							// code end for long casting for black King
							System.out.println("castel i and j=" + i + " " + j + " 7 and 5 button" + b[7][5].getIcon());
							if (e.getSource() == b[i][j] && vt != null) {
								System.out.println("test castel vt=" + vt);

								System.out.println("Lates watch for player" + b[i][j].getName());
								// System.out.println("vt in if"+vt.getDescription());
								System.out.println(
										"v in if" + v.getDescription() + "kiroo=  " + kiroo + " v=" + v + "  vt=" + vt);
								if (kiroo == 0) {
									if ((vt.getDescription() == "pw" || vt.getDescription() == "kw"
											|| vt.getDescription() == "qw" || vt.getDescription() == "bw"
											|| vt.getDescription() == "rw") && (v.getDescription() == "KKw")) {
										System.out.println("vt in if if" + vt.getDescription());
										System.out.println("vt in if if" + vt.getDescription());
										System.out.println("v in  if if" + v.getDescription());
										System.out.println(" in player2");
										// b[tempi][tempj].setIcon(null);
										icon = null;
										cnt--;
										p = 0;
										// state++;
										break;
									}
								}
								if ((kiroo == 0) && (vt.getDescription() == "Pb" || vt.getDescription() == "kb"
										|| vt.getDescription() == "qb" || vt.getDescription() == "bb"
										|| vt.getDescription() == "rb") && v.getDescription() == "KKb") {
									System.out.println(" in player1 fffff");
									// b[tempi][tempj].setIcon(null);
									icon = null;
									cnt--;
									p = 0;
									break;
								}
							}

							System.out.println("coming to locking condition bw " + "kiroo=" + kiroo);
							int n = 0;
							int d = 0;
							// for(n=0;n<=7;n++,d++)
							// {
							if ((kiroo == 0)) {
								System.out.println("tested for");
								if (((i == (diri - 1) && j == dirj) || (i == (diri + 1) && j == dirj)
										|| (i == diri && j == dirj + 1) || (i == diri && j == dirj + 1)
										|| (i == (diri - 1) && j == dirj + 1) || (i == (diri - 1) && j == dirj - 1)
										|| (i == diri + 1 && j == dirj - 1) || (i == diri + 1 && j == dirj + 1)
										|| (i == diri && j == dirj - 1))) {
									System.out.println("enetered in locking condition ");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("tname=" + tname);
									System.out.println("tesin" + (b[1][2].getName()));
									System.out.println("diri=" + diri + "dirj=" + dirj);
									// break;
								}
								// }
								b[tempi][tempj].setIcon(null);

								icon = null;
								cnt--;
								p = 0;
								kingi = i;
								kingj = j;
								System.out.println("kingi=" + kingi + " kingj=" + kingj);
							}
							kiroo = 0;
						}

						// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

						if (v.getDescription() == "qw" || v.getDescription() == "qb") // White or black Queen
						{
							if (e.getSource() == b[i][j] && vt != null) {
								System.out.println("Lates watch for player" + b[i][j].getName());
								System.out.println("vt in if" + vt.getDescription());
								System.out.println("v in if" + v.getDescription());
								if ((vt.getDescription() == "pw" || vt.getDescription() == "kw"
										|| vt.getDescription() == "qw" || vt.getDescription() == "KKw"
										|| vt.getDescription() == "rw") && v.getDescription() == "qw") {
									System.out.println("vt in if if" + vt.getDescription());
									System.out.println("v in  if if" + v.getDescription());
									System.out.println(" in player2");
									// b[tempi][tempj].setIcon(null);
									icon = null;
									cnt--;
									p = 0;
									// state++;
									break;
								}
								if ((vt.getDescription() == "Pb" || vt.getDescription() == "kb"
										|| vt.getDescription() == "qb" || vt.getDescription() == "KKb"
										|| vt.getDescription() == "rb") && v.getDescription() == "qb") {
									System.out.println(" in player1 fffff");
									// b[tempi][tempj].setIcon(null);
									icon = null;
									cnt--;
									p = 0;
									break;
								}
							}
							System.out.println("coming to locking condition bw");
							int t = 0;
							int d = 0;
							for (t = 0; t <= 7; t++, d++) {
								System.out.println("tested for");
								if ((i == (diri) && j == dirj - t) || (i == (diri) && j == dirj + t)
										|| (i == (diri - t) && j == dirj) || (i == (diri + t) && j == dirj)
										|| (i == diri && j == dirj + t) || (i == diri && j == dirj + t)
										|| (i == (diri - t) && j == dirj + d) || (i == (diri - t) && j == dirj - d)
										|| (i == diri + t && j == dirj - d) || (i == diri + t && j == dirj + d)) {
									System.out.println("enetered in locking condition ");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("tname=" + tname);
									System.out.println("tesin" + (b[1][2].getName()));
									System.out.println("diri=" + diri + "dirj=" + dirj);
									break;
								}
							}
							b[tempi][tempj].setIcon(null);
							icon = null;
							cnt--;
							p = 0;

						}

						// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
						if (v.getDescription() == "bw" || v.getDescription() == "bb") // White bishop
						{
							if (e.getSource() == b[i][j] && vt != null) {
								System.out.println("Lates watch for player" + b[i][j].getName());
								System.out.println("vt in if" + vt.getDescription());
								System.out.println("v in if" + v.getDescription());

								if ((vt.getDescription() == "pw" || vt.getDescription() == "kw"
										|| vt.getDescription() == "qw" || vt.getDescription() == "KKw"
										|| vt.getDescription() == "rw") && v.getDescription() == "bw") {
									System.out.println("vt in if if" + vt.getDescription());
									System.out.println("v in  if if" + v.getDescription());

									System.out.println(" in player2");
									// b[tempi][tempj].setIcon(null);
									icon = null;
									cnt--;
									p = 0;

									// state++;
									break;

								}

								if ((vt.getDescription() == "Pb" || vt.getDescription() == "kb"
										|| vt.getDescription() == "qb" || vt.getDescription() == "KKb"
										|| vt.getDescription() == "rb") && v.getDescription() == "bb") {
									System.out.println(" in player1 fffff");
									// b[tempi][tempj].setIcon(null);

									icon = null;
									cnt--;
									p = 0;
									break;
								}
							}

							System.out.println("coming to locking condition bw");
							int n = 0;
							int d = 0;
							for (n = 0; n <= 7; n++, d++) {
								System.out.println("latrst vt=" + vt);
								System.out.println("tested for");
								if ((i == (diri - n) && j == dirj + d) || (i == (diri - n) && j == dirj - d)
										|| (i == diri + n && j == dirj - d) || (i == diri + n && j == dirj + d)) {
									b[i][j] = (JButton) e.getSource();
									if (b[tempi][tempj].getName() != b[i][j].getName() || (e.getSource() != null)) {
										System.out.println("tempi= " + tempi + " tempj= " + tempj + "i= " + i + " j= "
												+ j + "  ki=" + ki + "  kj=" + kj);
										System.out.println(" if same button is clicked  ");
										ImageIcon top = (ImageIcon) b[i][j].getIcon();
										if (top != null) {
											if (top.getDescription() == "KKb") {
												JOptionPane.showConfirmDialog(getParent(), "King is checked");
											}

										}
										// icon=null;
										// cnt--;
										// p=0;
										// break;
									}

									System.out.println("enetered in locking condition ");
									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("latrst vt=" + vt);
									System.out.println("tname=" + tname);
									System.out.println("latrst vt=" + vt);
									System.out.println("tesin" + (b[1][2].getName()));
									System.out.println("diri=" + diri + "dirj=" + dirj);

									break;
								}
							}
							b[tempi][tempj].setIcon(null);
							icon = null;
							cnt--;
							p = 0;
							check(i, j, kingi, kingj, e);
						}

						// =================================================================================================

						if (v.getDescription() == "kw" || v.getDescription() == "kb") // White Rook
						{
							if (e.getSource() == b[i][j] && vt != null) {
								// System.out.println("Lates watch for player"+b[i][j].getName());
								if ((vt.getDescription() == "pw" || vt.getDescription() == "qw"
										|| vt.getDescription() == "KKw" || vt.getDescription() == "bw")
										&& v.getDescription() == "kw") {
									System.out.println(" in player2");
									// b[tempi][tempj].setIcon(null);
									icon = null;
									cnt--;
									p = 0;

									// state++;
									break;

								}

								if ((vt.getDescription() == "Pb" || vt.getDescription() == "pb"
										|| vt.getDescription() == "qb" || vt.getDescription() == "KKb"
										|| vt.getDescription() == "bb") && v.getDescription() == "kb") {
									System.out.println(" in player1");
									// b[tempi][tempj].setIcon(null);

									icon = null;
									cnt--;
									p = 0;
									break;
								}
							}

							System.out.println("coming to locking condition rw");
							// int m=0;
							// for(m=0;m<=7;m++)
							// {
							System.out.println("tested for");
							if ((i == diri + 1 && j == dirj + 2) || (i == diri + 2 && j == dirj + 1)
									|| (i == (diri + 1) && j == dirj - 2) || (i == (diri - 1) && j == dirj + 2)
									|| (i == (diri + 1) && j == dirj - 2) || (i == (diri - 1) && j == dirj + 2)
									|| (i == (diri - 1) && j == dirj - 2) || (i == (diri + 1) && j == dirj - 2)
									|| (i == diri + 2 && j == dirj + 1) || (i == diri + 2 && j == dirj - 1)
									|| (i == (diri - 2) && j == dirj - 1) || (i == (diri - 2) && j == dirj + 1)
									|| (i == diri - 2 && j == dirj + 1) || (i == diri - 2 && j == dirj - 1)) {

								System.out.println("enetered in locking condition ");
								b[i][j].setIcon(icon);
								b[i][j].setName(tname);
								System.out.println("tname=" + tname);
								System.out.println("tesin" + (b[1][2].getName()));
								System.out.println("diri=" + diri + "dirj=" + dirj);
								// break;
							}

							b[tempi][tempj].setIcon(null);
							icon = null;
							cnt--;
							p = 0;

						}

						// ==============================================================================================

						if (v.getDescription() == "rw" || v.getDescription() == "rb") // White Rook
						{
							if (e.getSource() == b[i][j] && vt != null) {
								System.out.println("Lates watch for player" + b[i][j].getName());
								if ((vt.getDescription() == "pw" || vt.getDescription() == "Kw"
										|| vt.getDescription() == "qw" || vt.getDescription() == "KKw"
										|| vt.getDescription() == "bw") && v.getDescription() == "rw") {
									System.out.println(" in player2");
									// b[tempi][tempj].setIcon(null);

									icon = null;
									cnt--;
									p = 0;
									/*
									 * if(type){ state++; System.out.println("Player 2 has done"); } if(!type){
									 * state--; System.out.println("Player 1 has done"); }
									 */
									// state++;
									break;

								}

								if ((vt.getDescription() == "pb" || vt.getDescription() == "Kb"
										|| vt.getDescription() == "qb" || vt.getDescription() == "KKb"
										|| vt.getDescription() == "bb") && v.getDescription() == "rb") {
									System.out.println(" in player1");
									// b[tempi][tempj].setIcon(null);

									icon = null;
									cnt--;
									p = 0;

									break;

								}
							}

							System.out.println("coming to locking condition rw");
							int m = 0;
							for (m = 0; m <= 7; m++) {
								System.out.println("tested for");
								if ((i == (diri - m) && j == dirj) || (i == (diri + m) && j == dirj)
										|| (i == diri && j == dirj + m) || (i == diri && j == dirj + m)
										|| (i == diri && j == dirj - m)) {

									System.out.println("enetered in locking condition ");

									b[i][j].setIcon(icon);
									b[i][j].setName(tname);
									System.out.println("tname=" + tname);
									System.out.println("tesin" + (b[1][2].getName()));
									System.out.println("diri=" + diri + "dirj=" + dirj);
									break;

								}
							}

							b[tempi][tempj].setIcon(null);

							icon = null;
							cnt--;
							p = 0;

						}

						if (type) {
							state++;
							System.out.println("Player 2 has done" + " tempi=" + tempi + " tempj=" + tempj + " ki=" + ki
									+ "kj=" + kj);
						}
						if (!type) {
							state--;
							System.out.println("Player 1 has done" + " b tempi=" + tempi + " tempj=" + tempj + " ki="
									+ ki + "kj=" + kj);
						}
						System.out.println(" first state=" + state);

						break;
					}

					// ====================

				} // end second for
					// p=0;
					// cnt++;
			} // end else
		}

	}

	public void check(int i2, int j2, int ki2, int kj2, ActionEvent e) {
		System.out.println("Finally comes in check");
		int dii = ki2;
		int dij = kj2;
		int tempii, tempij;
		System.out.println("i2=" + i2 + "j2=" + j2 + "ki2=" + ki2 + " kj2=" + kj2);

		for (int x = 0; x <= 7; x++) {
			for (int y = 0; y <= 7; y++) {
				// ImageIcon vt=(ImageIcon) b[x][y].getIcon();
				ImageIcon v = (ImageIcon) b[x][y].getIcon();
				System.out.println("x=" + x + " y=" + y);

				if (e.getSource() == b[x][y]) {

					// ImageIcon v=(ImageIcon) b[x][y].getIcon();
					ImageIcon vt = (ImageIcon) b[dii][dij].getIcon();
					System.out.println("comes in check e sorce");
					tempii = x;
					tempij = y;
					int n = 0;
					int d = 0;
					for (n = 0; n <= 7; n++, d++) {
						if (((v.getDescription() != null)) && (x == (dii - n) && y == dij + d)
								|| (x == (dii - n) && y == dij - d) || (x == dii + n && y == dij - d)
								|| (x == dii + n && y == dij + d)) {
							System.out.println("comes in inner check" + "vt=" + vt);
							if ((vt.getDescription() == "KKw") && (v.getDescription() != null)) {
								ImageIcon vt1 = (ImageIcon) b[x][y].getIcon();
								System.out.println("x=" + x + "y=" + y);
								System.out.println("  final vt1=" + vt1);
								if (vt1.getDescription() != null) {
									System.out.println("finally vt1=" + vt1.getDescription());
									System.out.println(" Inner most x=" + x + "y=" + y);
									JOptionPane.showConfirmDialog(getParent(), " King is checked");
								}
							}
						}
					}
				}
			}
		}

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if (c1.getState()) {
			type = false;
		}

		else if (c2.getState()) {
			type = true;
		}
		remove(c1);
		remove(c2);
		repaint(0, 0, 330, 450);
		showButton();

	}

	public static void main(String[] args) {
		Chess cn = new Chess();
		// System.out.println("count"+count);
	}

}
