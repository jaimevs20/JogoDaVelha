package View;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class JogoDaVelha extends JFrame{
	private JPanel contentPane;
	boolean jogador1=false,jogador2 = false;
	int jogadas = 0, pontoJogador1=0, pontoJogador2=0,i;
	String Nomejog1="Jogador X", Nomejog2="Jogador O";

	public static JButton[] botoes = new JButton[9];
	JLabel lblJogoDaVelha = new JLabel("JOGO DA VELHA");
	
	
	public JogoDaVelha() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 478);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		setNomejog1(Nomejog1=JOptionPane.showInputDialog("Digite o nome do Jogador 1 (X)"));
		setNomejog2(Nomejog2=JOptionPane.showInputDialog("Digite o nome do Jogador 2 (O)"));
		
		if(getNomejog1() == null || getNomejog2() == null){
			System.out.println("the end");
			System.exit(0);
		}
		
		lblJogoDaVelha.setForeground(Color.WHITE);
		lblJogoDaVelha.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 18));
		lblJogoDaVelha.setBounds(224, 22, 205, 27);
		contentPane.add(lblJogoDaVelha);
		
		JLabel lblPts1 = new JLabel(""+pontoJogador1);
		lblPts1.setForeground(new Color(255, 255, 255));
		lblPts1.setBounds(26, 122, 46, 14);
		contentPane.add(lblPts1);
		
		JLabel lblJogadorX = new JLabel(""+getNomejog1());
		lblJogadorX.setForeground(new Color(255, 255, 255));
		lblJogadorX.setBounds(26, 90, 84, 35);
		contentPane.add(lblJogadorX);
		
		/*if(lblJogadorX.getText() == "")
			lblJogadorX.setText("Jogador 1");*/
		
		JLabel lblJogadorO = new JLabel(""+getNomejog2());
		lblJogadorO.setForeground(Color.WHITE);
		lblJogadorO.setBounds(507, 90, 84, 35);
		contentPane.add(lblJogadorO);
	
		/*if(lblJogadorO.getText() == "")
		lblJogadorO.setText("Jogador 2");*/
		
		JLabel lblPts2 = new JLabel(""+pontoJogador2);
		lblPts2.setForeground(Color.WHITE);
		lblPts2.setBounds(517, 122, 46, 14);
		contentPane.add(lblPts2);
		
		lblPts1.getText();
		lblPts2.getText();
		
		JButton button1 = new JButton(" ");
		button1.setBackground(new Color(255, 255, 255));
		button1.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button1.setBounds(154, 90, 105, 78);
		contentPane.add(button1);
		
		JButton button2 = new JButton(" ");
		button2.setBackground(new Color(0, 0, 0));
		button2.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button2.setBounds(269, 90, 105, 78);
		contentPane.add(button2);
		
		JButton button3 = new JButton(" ");
		button3.setBackground(new Color(255, 255, 255));
		button3.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button3.setBounds(384, 90, 105, 78);
		contentPane.add(button3);
		
		JButton button4 = new JButton(" ");
		button4.setBackground(new Color(0, 0, 0));
		button4.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button4.setBounds(154, 179, 105, 78);
		contentPane.add(button4);
		
		JButton button5 = new JButton(" ");
		button5.setBackground(new Color(255, 255, 255));
		button5.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button5.setBounds(269, 179, 105, 78);
		contentPane.add(button5);
		
		JButton button6 = new JButton(" ");
		button6.setBackground(new Color(0, 0, 0));
		button6.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button6.setBounds(384, 179, 105, 78);
		contentPane.add(button6);
		
		JButton button7 = new JButton(" ");
		button7.setBackground(new Color(255, 255, 255));
		button7.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button7.setBounds(154, 268, 105, 78);
		contentPane.add(button7);
		
		JButton button8 = new JButton(" ");
		button8.setBackground(new Color(0, 0, 0));
		button8.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button8.setBounds(269, 268, 105, 78);
		contentPane.add(button8);
		
		JButton button9 = new JButton(" ");
		button9.setBackground(new Color(255, 255, 255));
		button9.setFont(new Font("Trebuchet MS", Font.BOLD, 65));
		button9.setBounds(384, 268, 105, 78);
		contentPane.add(button9);
		
		botoes[0] = button1;
		botoes[1] = button2;
		botoes[2] = button3;
		botoes[3] = button4;
		botoes[4] = button5;
		botoes[5] = button6;
		botoes[6] = button7;
		botoes[7] = button8;
		botoes[8] = button9;
		
		JButton btnNovoJogo = new JButton("Novo Jogo");
		btnNovoJogo.setForeground(new Color(255, 250, 205));
		btnNovoJogo.setBackground(new Color(255, 0, 0));
		btnNovoJogo.setBounds(474, 371, 100, 35);
		contentPane.add(btnNovoJogo);
		
		JLabel lblJogadorA = new JLabel("Jogador, é a sua vez");
		lblJogadorA.setForeground(new Color(255, 215, 0));
		lblJogadorA.setBackground(new Color(255, 255, 255));
		lblJogadorA.setFont(new Font("Tunga", Font.BOLD, 13));
		lblJogadorA.setBounds(251, 368, 140, 14);
		contentPane.add(lblJogadorA);
		
		lblJogadorA.setText(Nomejog1+", é a sua vez");
		
		for(i=0;i<9;i++)
			jogar(botoes[i],lblJogadorO,lblJogadorX,lblJogadorA,lblPts1,lblPts2);
		
		btnNovoJogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				JogoDaVelha frame = new JogoDaVelha();
				frame.setVisible(true);
			}
		});
		
	}
	
	public void jogar(JButton botoes, JLabel lblJogadorO, JLabel lblJogadorX, JLabel lblJogadorA,JLabel lblPts1 ,JLabel lblPts2){
			botoes.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(outroMov(botoes) == true){
						JOptionPane.showMessageDialog(null, "Escolha outro movimento");
					}
					else
					{
						if(jogador1 == false)
							escreveX(botoes,lblJogadorO,lblJogadorA);
						else if(jogador1 == true)
							escreveO(botoes,lblJogadorX,lblJogadorA);
						resultado(lblPts1,lblPts2,lblJogadorX,lblJogadorO,lblJogadorA);
					}
				}
			});
		}
	
	
	public String getNomejog1() {
		return Nomejog1;
	}

	public void setNomejog1(String nomejog1) {
		Nomejog1 = nomejog1;
	}

	public String getNomejog2() {
		return Nomejog2;
	}

	public void setNomejog2(String nomejog2) {
		Nomejog2 = nomejog2;
	}

	public boolean outroMov(JButton buton){
		if(buton.getText() != " ")
			return true;
		else
			return false;
	}
	
	public void resultado(JLabel lbl, JLabel lbl2,JLabel lblj1, JLabel lblj2,JLabel frase){
		if(		
				(botoes[0].getText() == "X" && botoes[1].getText() == "X" && botoes[2].getText() == "X") || 
				(botoes[3].getText() == "X" && botoes[4].getText() == "X" && botoes[5].getText() == "X") ||
				(botoes[6].getText() == "X" && botoes[7].getText() == "X" && botoes[8].getText() == "X") ||
				(botoes[0].getText() == "X" && botoes[3].getText() == "X" && botoes[6].getText() == "X") ||
				(botoes[1].getText() == "X" && botoes[4].getText() == "X" && botoes[7].getText() == "X") ||
				(botoes[2].getText() == "X" && botoes[5].getText() == "X" && botoes[8].getText() == "X") ||
				(botoes[0].getText() == "X" && botoes[4].getText() == "X" && botoes[8].getText() == "X") ||
				(botoes[2].getText() == "X" && botoes[4].getText() == "X" && botoes[6].getText() == "X")
			){
					pontoJogador1++;
					JOptionPane.showMessageDialog(null,lblj1.getText()+" ganhou");
					frase.setText(Nomejog1+", é a sua vez");
					lbl.setText(""+pontoJogador1);
					for(int i=0;i<9;i++)
						botoes[i].setText(" ");
					jogador1=false;
					jogador2 = false;
					jogadas=0;
			}
		
			else if(
					(botoes[0].getText() == "O" && botoes[1].getText() == "O" && botoes[2].getText() == "O") || 
					(botoes[3].getText() == "O" && botoes[4].getText() == "O" && botoes[5].getText() == "O") ||
					(botoes[6].getText() == "O" && botoes[7].getText() == "O" && botoes[8].getText() == "O") ||
					(botoes[0].getText() == "O" && botoes[3].getText() == "O" && botoes[6].getText() == "O") ||
					(botoes[1].getText() == "O" && botoes[4].getText() == "O" && botoes[7].getText() == "O") ||
					(botoes[2].getText() == "O" && botoes[5].getText() == "O" && botoes[8].getText() == "O") ||
					(botoes[0].getText() == "O" && botoes[4].getText() == "O" && botoes[8].getText() == "O") ||
					(botoes[2].getText() == "O" && botoes[4].getText() == "O" && botoes[6].getText() == "O")
				){
					pontoJogador2++;
					JOptionPane.showMessageDialog(null,lblj2.getText()+" ganhou");
					lbl2.setText(""+pontoJogador2);
					frase.setText(Nomejog1+", é a sua vez");
					for(int i=0;i<9;i++)
						botoes[i].setText(" ");
					jogador1=false;
					jogador2 = false;
					jogadas=0;
				}
		
		else if(jogadas == 9){
			JOptionPane.showMessageDialog(null, "Empatou");
			lbl.getText();
			lbl2.getText();
			frase.setText(Nomejog1+", é a sua vez");
			for(int i=0;i<9;i++)
				botoes[i].setText(" ");
			jogador1=false;
			jogador2 = false;
			jogadas=0;
		}
		
	}
	
	public void escreveX(JButton botao,JLabel lbljog,JLabel lblfrase){
		botao.setText("X");
		botao.setForeground(Color.blue);
		jogador1 = true;
		jogador2 = false;
		jogadas++;
		
		lblfrase.setText(lbljog.getText()+", é a sua vez");
	}
	public void escreveO(JButton botao,JLabel lbljog,JLabel lblfrase){
		botao.setText("O");
		botao.setForeground(Color.green);
		jogador2 = true;
		jogador1 = false;
		jogadas++;
		
		lblfrase.setText(lbljog.getText()+", é a sua vez");
	}
}